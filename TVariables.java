import java.util.*;

class TVariables<T> {
    private String id;
    private String tipo;
    private T valor;

    public TVariables(String id, String tipo, T valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVariables tuple = (TVariables) o;
        return id.equals(tuple.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}