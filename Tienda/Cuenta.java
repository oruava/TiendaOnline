public class Cuenta {

    private Pedidos pedidos;
    private Cliente cliente;
    private int idCuenta;

    public Pedidos getPedidos() {
        return this.pedidos;
    }

    /**
     *
     * @param pedidos
     */
    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    public void vincularCliente() {
        // TODO - implement Cuenta.vincularCliente
        throw new UnsupportedOperationException();
    }

    public void realizarPedido() {
        // TODO - implement Cuenta.realizarPedido
        throw new UnsupportedOperationException();
    }

}