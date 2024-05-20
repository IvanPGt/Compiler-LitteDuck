grammar litteDuck;

@parser::header {
    import java.util.Stack;
}

programa locals [
    Functions f = new Functions(),
    ArrayList<TVariables> globalVar = new ArrayList<TVariables>(),
    ArrayList<String> dirFunc = new ArrayList<String>(),

    CuboSemantico cuboSemantico = new CuboSemantico(),
    ArrayList<Quad> quads = new ArrayList<Quad>(),

    Stack<String> PilaO = new Stack<>(),
    Stack<String> PilaT = new Stack<>(),
    Stack<String> POper = new Stack<>(),
    Stack<Integer> PJumps = new Stack<>(),


    int avail = 0,
    int quad_cont = 0,

    boolean isLocalVar = false
    ]
    :   'program' ID { $programa::dirFunc.add($ID.text); 
        System.out.println("------debug-------");
         System.out.println("ahi va excepcion");
        
        if(!$programa::POper.empty()){
            if( "<".equals($programa::POper.peek()) ){
                System.out.println("dentro: NO EXCEPTION");
            }
        }
 
        System.out.println("NO EXCEPTION");
        System.out.println("hola");
        System.out.println("------debug-------");
    
    } ';' vars funcs 'main' body 'end' {
        System.out.println("quad_cont: "+$programa::quad_cont);
        System.out.println("-------CUADRUPOS-------");
        System.out.println($programa::quads);
        System.out.println("-------CUADRUPOS_FIN-------");
    };
vars:   md_vars
    | 
    ;
md_vars
    :   'var' def_vars ;
def_vars locals [ArrayList<String> pendigIds = new ArrayList<String>()]
    :   list_ids ':' type {
        for(int i = 0; i < $def_vars::pendigIds.size(); i++){
            TVariables _variable = new TVariables($def_vars::pendigIds.get(i), $type.text, null);
            if($programa::isLocalVar) {

                if ( $funcs::localVar.contains(_variable) || $programa::globalVar.contains(_variable) ) {
                    System.err.println("ERROR: Double definition for local variable: "+$def_vars::pendigIds.get(i) );
                } else { 
                    $funcs::localVar.add(_variable);
                }

            } else {

                if ( $programa::globalVar.contains(_variable) ) {
                    System.err.println("ERROR: Double definition for global variable: "+$def_vars::pendigIds.get(i) );
                } else {
                    $programa::globalVar.add(_variable);
                }

            }
        }
    }';' def_vars_ ;
def_vars_
    :   def_vars
    |
    ;
list_ids
    :   ID { $def_vars::pendigIds.add($ID.text); } list_ids_ ;
list_ids_
    :   ',' list_ids
    |   
    ;
type:   'int'
    |   'float'
    ;
funcs locals [ArrayList<TVariables> localVar = new ArrayList<TVariables>()]
    :   {$programa::isLocalVar = true;} md_funcs md_funcs_ {$programa::isLocalVar = false;}
    |   
    ;
md_funcs_
    :   funcs
    |
    ;
md_funcs
    :   'void' ID {

        if ( $programa::dirFunc.contains($ID.text) ) {
            System.err.println("ERROR: Double definition for function: "+$ID.text );
        } else {
            $programa::dirFunc.add($ID.text);
        }

        } '(' ids_funcs ')' '[' vars body ']' ';';
ids_funcs
    :   ID ':' type {
        TVariables _variable = new TVariables($ID.text, $type.text, null);

        if ( $funcs::localVar.contains(_variable) || $programa::globalVar.contains(_variable) ) {
            System.err.println("ERROR: Double definition for local variable parameter: "+$ID.text );
        } else {
            $funcs::localVar.add(_variable);
        }

        }ids_funcs_
    |   
    ;
ids_funcs_
    :   ',' ids_funcs
    |
    ;
body:   '{' md_body '}' ;
md_body
    :   statement md_body_
    |
    ;
md_body_
    :   md_body
    |
    ;
statement
    :   assign
    |   condition
    |   cicle
    |   f_call
    |   print
    ;
assign locals [String tipo_id]
    :   ID {

        TVariables _variable = new TVariables($ID.text, null, null);
        if($programa::isLocalVar) {
            if ( !$programa::globalVar.contains(_variable) && !$funcs::localVar.contains(_variable) ) {
                System.err.println("ERROR: Local Variable "+$ID.text+" not exist" );
            } else { $assign::tipo_id = $programa::f.findTipoById($funcs::localVar, $ID.text); }
            
        } else {
            if ( !$programa::globalVar.contains(_variable) ) {
                System.err.println("ERROR: Global variable "+$ID.text+" not exist" );
            } else { $assign::tipo_id = $programa::f.findTipoById($programa::globalVar, $ID.text); }
        }

        } '=' expresion ';' {

            if( $programa::cuboSemantico.checkError(7, $programa::cuboSemantico.getTipoId($assign::tipo_id), $programa::cuboSemantico.getTipoId($programa::PilaT.peek())) != 4 ) {
                Quad _quad = new Quad("=", $programa::PilaO.pop(), null, $ID.text);
                $programa::quads.add(_quad);
                $programa::quad_cont++;
                System.out.println(_quad);
            } else {
                System.err.println("ERROR: Assign Type mismatch: " + $ID.text + ":" + $assign::tipo_id + " & " + $programa::PilaO.peek() + ":" + $programa::PilaT.peek());
            } 
        };
expresion
    :   exp md_exp ;
md_exp
    :   expresion_op { $programa::POper.push($expresion_op.text); } exp {
        if(!$programa::POper.empty()){
            if("<".equals($programa::POper.peek()) || ">".equals($programa::POper.peek()) || "!=".equals($programa::POper.peek())) {
                String s_L_O = $programa::PilaO.pop();
                String s_L_O_T = $programa::PilaT.pop();

                String s_R_O = $programa::PilaO.pop();
                String s_R_O_T = $programa::PilaT.pop();

                String s_oper = $programa::POper.pop();

                int oper = $programa::cuboSemantico.getOperId(s_oper);
                int L_O_T = $programa::cuboSemantico.getTipoId(s_L_O_T);
                int R_O_T = $programa::cuboSemantico.getTipoId(s_R_O_T);
            

                String res_type = $programa::cuboSemantico.getTipo(oper, L_O_T, R_O_T);

                if( $programa::cuboSemantico.checkError(oper, L_O_T, R_O_T) != 4 ) {
                    String _tvar_id = "t" + $programa::avail;
                    $programa::avail++;
                    TVariables _tvar = new TVariables(_tvar_id, res_type, null);
                    $programa::globalVar.add(_tvar);
                    $programa::PilaO.push(_tvar_id);
                    $programa::PilaT.push(res_type);
                    Quad _quad = new Quad(s_oper, s_L_O, s_R_O, _tvar_id);
                    $programa::quads.add(_quad);
                    $programa::quad_cont++;
                    System.out.println(_quad);

                } else {
                    System.err.println("ERROR: Type mismatch: " + s_L_O + ":" + s_L_O_T + " & " + s_R_O + ":" + s_R_O_T);
                }
            }
        }
     }
    |
    ;
expresion_op
    :   '>'
    |   '<'
    |   '!='
    ;
exp
    :   termino { 
        if(!$programa::POper.empty()){
            if("+".equals($programa::POper.peek()) || "-".equals($programa::POper.peek()) ) {
                String s_L_O = $programa::PilaO.pop();
                String s_L_O_T = $programa::PilaT.pop();

                String s_R_O = $programa::PilaO.pop();
                String s_R_O_T = $programa::PilaT.pop();

                String s_oper = $programa::POper.pop();

                int oper = $programa::cuboSemantico.getOperId(s_oper);
                int L_O_T = $programa::cuboSemantico.getTipoId(s_L_O_T);
                int R_O_T = $programa::cuboSemantico.getTipoId(s_R_O_T);
            

                String res_type = $programa::cuboSemantico.getTipo(oper, L_O_T, R_O_T);

                if( $programa::cuboSemantico.checkError(oper, L_O_T, R_O_T) != 4 ) {
                    String _tvar_id = "t" + $programa::avail;
                    $programa::avail++;
                    TVariables _tvar = new TVariables(_tvar_id, res_type, null);
                    $programa::globalVar.add(_tvar);
                    $programa::PilaO.push(_tvar_id);
                    $programa::PilaT.push(res_type);
                    Quad _quad = new Quad(s_oper, s_L_O, s_R_O, _tvar_id);
                    $programa::quads.add(_quad);
                    $programa::quad_cont++;
                    System.out.println(_quad);

                } else {
                    System.err.println("ERROR: Type mismatch: " + s_L_O + ":" + s_L_O_T + " & " + s_R_O + ":" + s_R_O_T);
                }
            }
        }
    } termino_ ;
termino_
    :   termino_op { $programa::POper.push($termino_op.text); } exp
    |   
    ;
termino_op
    :   '+'
    |   '-'
    ;
termino
    :   factor { 
        if(!$programa::POper.empty()){
            if("*".equals($programa::POper.peek()) || "/".equals($programa::POper.peek()) ) {
                String s_L_O = $programa::PilaO.pop();
                String s_L_O_T = $programa::PilaT.pop();

                String s_R_O = $programa::PilaO.pop();
                String s_R_O_T = $programa::PilaT.pop();

                String s_oper = $programa::POper.pop();

                int oper = $programa::cuboSemantico.getOperId(s_oper);
                int L_O_T = $programa::cuboSemantico.getTipoId(s_L_O_T);
                int R_O_T = $programa::cuboSemantico.getTipoId(s_R_O_T);
            

                String res_type = $programa::cuboSemantico.getTipo(oper, L_O_T, R_O_T);

                if( $programa::cuboSemantico.checkError(oper, L_O_T, R_O_T) != 4 ) {
                    String _tvar_id = "t" + $programa::avail;
                    $programa::avail++;
                    TVariables _tvar = new TVariables(_tvar_id, res_type, null);
                    $programa::globalVar.add(_tvar);
                    $programa::PilaO.push(_tvar_id);
                    $programa::PilaT.push(res_type);
                    Quad _quad = new Quad(s_oper, s_L_O, s_R_O, _tvar_id);
                    $programa::quads.add(_quad);
                    $programa::quad_cont++;
                    System.out.println(_quad);
 

                } else {
                    System.err.println("ERROR: Type mismatch: " + s_L_O + ":" + s_L_O_T + " & " + s_R_O + ":" + s_R_O_T);
                }
            }
        }
    
    } factor_ ;
factor_
    :   factor_op { $programa::POper.push($factor_op.text); } termino
    |
    ;
factor_op
    :   '*'
    |   '/'
    ;
factor
    :   '(' { $programa::POper.push("#"); } expresion ')' { $programa::POper.pop(); }
    |   factor_op_ factor_cte 
    ;
factor_op_
    :   termino_op
    |
    ;
factor_cte
    :   ID {
  
        TVariables _variable = new TVariables($ID.text, null, null);
        if($programa::isLocalVar) {
            if ( !$programa::globalVar.contains(_variable) && !$funcs::localVar.contains(_variable) ) {

                System.err.println("ERROR: Local Variable "+$ID.text+" not exist" );
            } else { 
    
                $programa::PilaO.push($ID.text); 
                $programa::PilaT.push($programa::f.findTipoById($funcs::localVar, $ID.text)); 
      
            }
        } else {
            if ( !$programa::globalVar.contains(_variable) ) {

                System.err.println("ERROR: Global variable "+$ID.text+" not exist" );
            } else { 
          
                $programa::PilaO.push($ID.text); 
                $programa::PilaT.push($programa::f.findTipoById($programa::globalVar, $ID.text)); 

            }
        }
    }
    |   cte
    ;
cte
    :   CTE_INT { $programa::PilaO.push($CTE_INT.text); $programa::PilaT.push("int"); }
    |   CTE_FLOAT { $programa::PilaO.push($CTE_FLOAT.text); $programa::PilaT.push("float"); }
    ;
condition locals [ String exp_type ]
    :   'if' '(' expresion ')' { 
        $condition::exp_type = $programa::PilaT.pop();
        if ( !"bool".equals($condition::exp_type) ) {
            System.err.println("ERROR: Type mismatch: if exprestion is not type bool: type: "+$condition::exp_type);
        } else {
            Quad _quad = new Quad("GotoF", $programa::PilaO.pop(), null, null);
            $programa::quads.add(_quad);
            $programa::quad_cont++;
            System.out.println(_quad);
            $programa::PJumps.push($programa::quad_cont-1);
        }
    } body condition_else ';' {
        if ( "bool".equals($condition::exp_type) ) {
            System.out.println("ENTRE FINAL");
            $programa::quads.get($programa::PJumps.pop()).setRes($programa::quad_cont);
        }
    };
condition_else
    :   'else' {
        if ( "bool".equals($condition::exp_type) ) {

            System.out.println("ENTRE ELSE");
            Quad _quad = new Quad("Goto", null, null, null);
            $programa::quads.add(_quad);
            $programa::quad_cont++;
            System.out.println(_quad);
            $programa::quads.get($programa::PJumps.pop()).setRes($programa::quad_cont);
            $programa::PJumps.push($programa::quad_cont-1);
        }
    } body
    |
    ;
cicle
    :   'do' body 'while' '(' expresion ')' ';' ;
f_call
    :   ID {
        if ( !$programa::dirFunc.contains($ID.text) ) {
            System.err.println("ERROR: Function "+$ID.text+" not exist" );
        }
        }'(' md_f_call ')' ';' ;
md_f_call
    :   expresion md_f_call_
    |
    ;
md_f_call_
    :   ',' md_f_call
    |
    ;
print
    :   'print''(' md_print ')' ';';
md_print
    :   CTE_STRING md_print_
    |   expresion md_print_
    ;
md_print_
    :   ',' md_print
    |
    ;
ID      : [a-zA-Z_]+[a-zA-Z0-9]* ;
CTE_INT     : [0-9]+ ; 
CTE_FLOAT   : [0-9]+(.[0-9]+)?;
CTE_STRING  : '"'~["]*'"';
NEWLINE : [\r\n\t]+ ->skip;
WHITESPACE : ' ' ->skip;