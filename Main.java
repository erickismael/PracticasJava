import objetos.Numero;
public class Main{
    public static void main(String unNombreDeAlgo[]){
        Numero[] numero = {new Numero(3),new Numero(5),new Numero(7),new Numero(19)};
        int total = 0;
        for(Numero n:numero){
            total+=n.getNumero();
        }
        System.out.println(total);
    }
}