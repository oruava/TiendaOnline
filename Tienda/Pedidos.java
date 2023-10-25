public class Pedidos {
    private estadoPedido estadoPedido;
    public enum estadoPedido {
        Nuevo,
        Creado,
        Despachado,
        Recibido,
        Cerrado
    }

    public estadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(estadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
}
