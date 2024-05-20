import java.util.*;

class TVariables<T> {
    private final String id;
    private final String tipo;
    private final T valor;

    public TVariables(String id, String tipo, T valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return this.tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVariables tuple = (TVariables) o;
        return Objects.equals(this.id, tuple.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public T getValor() {
        return valor;
    }

    public String getId() {
        return id;
    }
}