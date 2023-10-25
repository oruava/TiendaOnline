public class ProductoEspecifico {

    private String nombreProducto;
    private int precioProducto;
    private int idProducto;

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    /**
     *
     * @param nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return this.precioProducto;
    }

    /**
     *
     * @param precioProducto
     */
    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    /**
     *
     * @param idProducto
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

}