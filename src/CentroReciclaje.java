import java.util.Scanner;

public class CentroReciclaje{

    public static void main(String[] args) {
        int cantidadCargas= cargasMaterial();
        int[] pesosCargas = pesos(cantidadCargas);
        int sumaPesos= sumaPesos(pesosCargas);
        int promedioPesos= promedio(sumaPesos, cantidadCargas);

        System.out.println("el peso total de la jornada es "+sumaPesos);
        System.out.println("el promedio de los pesos fue "+promedioPesos);
        mayor80(pesosCargas, cantidadCargas);
        mayor(pesosCargas);

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

    public static int[] pesos(int cargas){
        Scanner scanner =new Scanner(System.in);
        int[] pesos = new int[cargas];

        for (int i =0; i<cargas; i++){
            
            System.out.println("ingrese el peso de la carga "+(i+1));
            pesos[i]= scanner.nextInt();

            if (pesos[i]<5 || pesos[i]>200){
                System.out.println("valor no valido ingreselo de nuevo");
                i--;
            }
        }
        return pesos;
    }

    public static void  mayor80(int[] pesos, int cantidadCargas){
        int contador=0;
        for (int i=0; i<cantidadCargas; i++){
            if (pesos[i]>80){
                contador++;
            }
        }
        System.out.println("las cargas con pesos mayores de 80 son "+ contador);
    }

    public static int sumaPesos(int[] pesos) {
        int sumador=0;
        for(int peso: pesos){
            sumador+=peso;
        }
        return sumador;
    }

    public static int promedio(int suma, int cantidadCargas){
        int promedio = suma/ cantidadCargas;
        return promedio;
    }

    public static void mayor(int[] pesos){
        int mayor=0;
        for (int peso: pesos){
            if (mayor<peso){
                mayor=peso;
            }
        }
        System.out.println("el peso mayor de la jornada es "+mayor);

    }

    public static void mayorePromedio(int[] pesos, int promedio){
        int contador=0;
        for (int peso: pesos){
            if (peso>promedio){
                contador++;
            }
        }
        System.out.println("la cantidad de pedidos mayores al promedio son "+contador);
    }


}