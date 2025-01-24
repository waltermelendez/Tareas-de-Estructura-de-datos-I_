

package clases.tarea_1waltermelendez1174722;
import java.util.Scanner;

public class Tarea_1WalterMelendez1174722 {

    public static void main(String[] args) {
        //Ejercercicio numero 1 con ciclo for
        System.out.println("Notas con ciclo For");
        int [] Notas_f=new int [10];
        Scanner Entrada= new Scanner (System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Diga una nota");
            Notas_f[i]=Entrada.nextInt();
        }
        //Ordenamineto en for
        int aux=0;
        int promedio=0;
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                aux=Notas_f[j];
                  Notas_f[j]=Notas_f[i];
                  Notas_f[i]=aux;
            }
        }
        System.out.println("Promedio del ciiclo For");
        for (int i = 0; i < 10; i++) {
            promedio=Notas_f[i]+promedio;
        }
    }
}
