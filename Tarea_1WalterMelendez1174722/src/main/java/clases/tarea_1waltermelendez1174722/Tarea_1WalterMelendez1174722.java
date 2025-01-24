

package clases.tarea_1waltermelendez1174722;
import java.util.Scanner;

public class Tarea_1WalterMelendez1174722 {

    public static void main(String[] args) {
        //Ejercercicio numero 1 con ciclo for
        System.out.println("Notas con ciclo For");
        int [] Notas=new int [10];
        Scanner Entrada= new Scanner (System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Diga una nota "+(i+1) );
            Notas[i]=Entrada.nextInt();
        }
        //Ordenamineto en for
        int aux;
        int promedio=0;
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if (Notas[j]<Notas[j+1]) {
                    aux=Notas[j];
                  Notas[j]=Notas[j+1];
                  Notas[j+1]=aux;
                }
                
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(Notas[i]+", ");
        }
        System.out.println("En numero más alto es: "+Notas[0]);
        System.out.println("El numero con la notas más baja es: "+Notas[9]);
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
        promedio=0;
        //Promedio de while
        while(cont<10){
        promedio=Notas[cont]+promedio;
        
        }
        //Ejercicio de Notas con do-while
        cont=0;
        System.out.println("Notas con ciclo do--while");
        do {
            System.out.println("Diga un numero");
            Notas[cont]=Entrada.nextInt();
            cont++;
        } while (cont<10);
        //Ordenamiento
        
        //Promedio de ciclo do--while
        cont=0;
        promedio=0;
        do {
           promedio=promedio+Notas[cont];
           cont++;
        } while (cont<10);
        
        //Ejercicio Numero 2
        System.out.println("Ejercicio Numero 2");
        System.out.println("Prueba");
    }
}
