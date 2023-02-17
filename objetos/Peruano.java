package objetos;
public class Peruano extends Persona{
    public Peruano(String nombre,int edad){
        super(nombre,edad);
    }
    public void come(String comida){
        System.out.println("El peruano esta comiendo " + comida);
    }
}