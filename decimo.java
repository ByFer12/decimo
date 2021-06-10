import java.util.Scanner;

public class decimo {
    public static void main(String[] args) {
        int numero=0, aux=0,suma=0,suma2=0;
        Scanner ent= new Scanner(System.in);
        while(suma<1000){
            System.out.println("Ingrese un numero cualquiera: ");
            numero=ent.nextInt();
            if(numero%6==0){
                aux++;
            }
            if(numero<=10){
                suma2=suma2+numero;
            }
            suma=numero+suma;

        }
        System.out.println("Cantidad de multiplos de 6: "+aux);
        System.out.println("Suma de numeros entre 1 y 10: "+suma2);
    }
}
