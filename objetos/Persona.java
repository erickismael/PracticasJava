package objetos;
public abstract class Persona{
    private String nombre;
    private int edad;
    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public abstract void come(String comida);
}