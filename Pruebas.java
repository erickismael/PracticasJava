import objetos.mAsCoTa;
public class Pruebas{
    public static void main(String[] args){
        mAsCoTa m = new mAsCoTa();
        m.setNombre("Topo");
        m.setEdad(0);
        System.out.println(m.getNombre());
        System.out.println(m.getEdad());
    }
}