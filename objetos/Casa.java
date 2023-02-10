package objetos;
public class Casa{
    private static int contador = 0;
    private String descripcion;
    private float precio;
    public Casa(String descripcion,float precio){
        this.descripcion = descripcion;
        this.precio = precio;
        this.contador++;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public static int getContador(){
        return contador;
    }
}