public class Materia{
    private String nombre;
    private int calificacion;
    Materia(String nombre, int c){
        this.nombre = nombre;
        calificacion = c;
    }
    public String getNombre(){
        return nombre;
    }
    public int calificacion(){
        return calificacion;
    }
}