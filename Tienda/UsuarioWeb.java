public class UsuarioWeb {
    private estado estado;
    private String nombreUsuarioWeb;

    public enum estado {
        Nuevo,
        Activo,
        BloqueadoTemporalmente,
        BloqueoProhibido
    }


    public estado getEstado() {
        return estado;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }

    public void agregarAlCarrito() {
        // TODO - implement UsuarioWeb.agregarAlCarrito
        throw new UnsupportedOperationException();
    }
}
