package objetos;
public class Articulo{
    private String nombre;
    private int cantidad;
    private float precio;
    private String tipo;
    private int diasACaducar;
    public Articulo(String nombre,int cantidad,float precio,String tipo,int diasACaducar){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipo = tipo;
        this.diasACaducar = diasACaducar;
    }
}