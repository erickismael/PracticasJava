import objetos.Casa;
import objetos.MiMath;
public class Main{
    public static void main(String unNombreDeAlgo[]){
        Casa c1 = new Casa("Una casa grande",1234567.23f);
        Casa c2 = new Casa("Una casa grande",1234567.23f);
        Casa c3 = new Casa("Una casa grande",1234567.23f);
        System.out.println(c1.getDescripcion());
        //System.out.println(Casa.contador);
        System.out.println(Casa.getContador());
        System.out.println(MiMath.numero);
        int[][] algo = new int[2][2];
        algo[0][0] = 0;
        algo[0][1] = 1;
        algo[1][0] = 2;
        algo[1][1] = 3;
        for(int i=0;i<algo.length;i++){
            for(int j=0;j<algo[i].length+1;j++){
                System.out.println(algo[i][j]);
            }
        }
    }
}