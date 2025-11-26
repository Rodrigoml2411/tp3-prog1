public class Cola {
    private Nodo primero;
    private Nodo ultimo;

    public Cola() {
        primero = null;
        ultimo = null;
    }

    public void insertar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (ultimo != null) {
            ultimo.siguiente = nuevo;
        } else {
            primero = nuevo;
        }
        ultimo = nuevo;
    }

    public Object quitar() {
        if (primero == null) return null;
        Object dato = primero.dato;
        primero = primero.siguiente;
        if (primero == null) ultimo = null;
        return dato;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public Nodo getPrimero() {
        return primero;
    }
}
