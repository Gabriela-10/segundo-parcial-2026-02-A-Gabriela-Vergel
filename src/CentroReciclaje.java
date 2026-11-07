import java.util.Scanner;

public class CentroReciclaje{

    public static void main(String[] args) {
        int cantidadCargas= cargasMaterial();

    }

    public static int cargasMaterial(){
        Scanner scanner =new Scanner(System.in);

        System.out.println("ingrese la cantidad de cargas de material");
        int cantidad= scanner.nextInt();

        if (cantidad<3 || cantidad>20){
            System.out.println("cantidad de cargas no valida, deben ser entre 3 a 20, ingrese denuevo");
            cantidad= scanner.nextInt();
        }
        return cantidad;
    }

    public static int[] pesos(int[] pesos){
        int largo = pesos.length;
        for (int i =0; i<largo; i++){
            
            System.out.println("ingrese el peso de la carga "+(i+1));
            if (pesos[i]<5 || pesos[i]>200){
                System.out.println("valor no valido ingreselo de nuevo");
            }
        }
    }


}