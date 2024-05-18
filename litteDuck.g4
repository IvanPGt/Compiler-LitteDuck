grammar litteDuck;

programa locals [
    List<TVariables> globalVar = new ArrayList<TVariables>(),
    List<String> dirFunc = new ArrayList<String>(),
    boolean isLocalVar = false
    ]
    :   'program' ID {
        $programa::dirFunc.add($ID.text);

        CuboSemantico cuboSemantico = new CuboSemantico();

        System.out.println("valor para 0,0,3: "+cuboSemantico.getTipo(0,0,3));
        
        System.out.println("TOY VIVO JAJAJA");
        } ';' vars funcs 'main' body 'end' 
        {
            System.out.println("\n\nVARIABLES GLOBALES"+$programa::globalVar+"\n\n");
            System.out.println("\n\nVARIABLES DIR_FUNCIONES"+$programa::dirFunc+"\n\n");
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
                }

                $funcs::localVar.add(_variable);
                System.out.println("Variable funcion: "+$def_vars::pendigIds.get(i)+" Tipo: "+$type.text+"\n");
            } else {

                if ( $programa::globalVar.contains(_variable) ) {
                    System.err.println("ERROR: Double definition for global variable: "+$def_vars::pendigIds.get(i) );
                }

                $programa::globalVar.add(_variable);
                System.out.println("Variable global: "+$def_vars::pendigIds.get(i)+" Tipo: "+$type.text+"\n");
            }
        }
    }';' def_vars_ ;
def_vars_
    :   def_vars
    |
    ;
list_ids
    :   ID { $def_vars::pendigIds.add($ID.text);} list_ids_ ;
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
        }

        $programa::dirFunc.add($ID.text);
        System.out.println("\n\nFUNCION: "+$ID.text+"\n");
        } '(' ids_funcs ')' '[' vars body ']' ';';
ids_funcs
    :   ID ':' type {
        TVariables _variable = new TVariables($ID.text, $type.text, null);

        if ( $funcs::localVar.contains(_variable) || $programa::globalVar.contains(_variable) ) {
            System.err.println("ERROR: Double definition for local variable parameter: "+$ID.text );
        }

        $funcs::localVar.add(_variable);
        System.out.println("Parametro funcion: "+$ID.text+" Tipo: "+$type.text+"\n");
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
assign
    :   ID {

        TVariables _variable = new TVariables($ID.text, null, null);
        if($programa::isLocalVar) {
            if ( !$programa::globalVar.contains(_variable) && !$funcs::localVar.contains(_variable) ) {
                System.err.println("ERROR: Local Variable "+$ID.text+" not exist" );
            }
            
        } else {
            if ( !$programa::globalVar.contains(_variable) ) {
                System.err.println("ERROR: Global variable "+$ID.text+" not exist" );
            }
        }
        

        }'=' expresion ';' ;
expresion
    :   exp md_exp ;
md_exp
    :   expresion_op exp
    |
    ;
expresion_op
    :   '>'
    |   '<'
    |   '!='
    ;
exp
    :   termino termino_ ;
termino_
    :   termino_op exp
    |   
    ;
termino_op
    :   '+'
    |   '-'
    ;
termino
    :   factor factor_ ;
factor_
    :   factor_op termino
    |
    ;
factor_op
    :   '*'
    |   '/'
    ;
factor
    :   '(' expresion ')'
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
            }
        } else {
            if ( !$programa::globalVar.contains(_variable) ) {
                System.err.println("ERROR: Global variable "+$ID.text+" not exist" );
            }
        }
    }
    |   cte
    ;
cte
    :   CTE_INT
    |   CTE_FLOAT
    ;
condition
    :   'if' '(' expresion ')' body condition_else ';' ;
condition_else
    :   'else' body
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