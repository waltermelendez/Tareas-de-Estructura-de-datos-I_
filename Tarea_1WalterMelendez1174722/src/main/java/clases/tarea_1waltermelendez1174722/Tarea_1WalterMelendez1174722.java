

package clases.tarea_1waltermelendez1174722;
import java.util.Scanner;

public class Tarea_1WalterMelendez1174722 {

    public static void main(String[] args) {
        //Ejercercicio numero 1 con ciclo for
        System.out.println("Notas con ciclo For");
        int [] Notas=new int [10];
        Scanner Entrada= new Scanner (System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Diga una nota");
            Notas[i]=Entrada.nextInt();
        }
        //Ordenamineto en for
        int aux;
        int promedio=0;
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                aux=Notas[j];
                  Notas[j]=Notas[i];
                  Notas[i]=aux;
            }
        }
        System.out.println("Promedio del ciclo For");
        for (int i = 0; i < 10; i++) {
            promedio=Notas[i]+promedio;
        }
        System.out.println("El promedio es "+promedio);
        //Ejercicio numero 1 con while
        System.out.println("Notas con ciclo while");
        
        int cont=0;
        while (cont<10){
            System.out.println("Diga una nota");
        Notas[cont]=Entrada.nextInt();
        cont++;
        }
        //Ordenamiento
        cont=0;
        //Promedio de while
        while(cont<10){
        promedio=Notas[cont]+promedio;
        
        }
    }
}
