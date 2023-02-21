package objetos;
public class mAsCoTa{
    private String nombre;
    private int edad;
    public mAsCoTa(){
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre=="Erick"){
            System.out.println("No se deben de asignar nombres de personas.");
            System.out.println("Se le asignara el nombre por defecto de 'Kira'.");
            this.nombre = "Kira";
        }else{
            this.nombre = nombre;
        }
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        // Se valida que no pueda tener 0 porque no es posible y 30 no existen mascotas con esa edad
        if(edad == 0){
            System.out.println("ERROR:La edad ingresada no puede ser 0");
            this.edad = 1;
        }else if(edad>=30){
            System.out.println("ERROR:La edad ingresada es muy grande, se asignara 1");
            this.edad = 1;
        }else{
            this.edad = edad;
        }
    }
}