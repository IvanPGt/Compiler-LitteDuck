import java.util.*;

class Functions {

    public static String findTipoById(ArrayList<TVariables> list, String id) {
        for (TVariables var : list) {
            if (var.getId().equals(id)) {
                return var.getTipo();
            }
        }
        return null; // Retorna null si no se encuentra el _id
    }
}