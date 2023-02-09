public class Casa{
    private String descripcion;
    private float precio;
    public Casa(String descripcion,float precio){
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
}