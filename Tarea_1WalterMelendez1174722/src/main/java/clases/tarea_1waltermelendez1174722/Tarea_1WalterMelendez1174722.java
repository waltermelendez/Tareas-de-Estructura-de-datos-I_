

package clases.tarea_1waltermelendez1174722;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarea_1WalterMelendez1174722 {

    public static void main(String[] args) {
        //Ejercercicio numero 1 con ciclo for
        System.out.println("Notas con ciclo For");
        int [] Notas=new int [10];
        Scanner Entrada= new Scanner (System.in);
        int aux;
        int promedio=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Diga una nota "+(i+1) );
            Notas[i]=Entrada.nextInt();
        }
        //Ordenamineto en for
        
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if (Notas[j]>Notas[i]) {
                    aux=Notas[j];
                  Notas[j]=Notas[i];
                  Notas[i]=aux;
                }
                
            }
        }
        
        System.out.println("En numero más alto es: "+Notas[0]);
        System.out.println("El numero con la notas más baja es: "+Notas[9]);
        
        for (int i = 0; i < 10; i++) {
            promedio=Notas[i]+promedio;
        }
        promedio=promedio/10;
        System.out.println("El promedio es: "+(promedio));
       
        //Ejercicio numero 1 con while
        
        System.out.println("Notas con ciclo while");
        
        int cont=0;
        while (cont<10){
            System.out.println("Diga una nota "+ (cont+1));
        Notas[cont]=Entrada.nextInt();
        cont++;
        }
        
        //Ordenamiento
        cont=0;
       int promediow=0;
        int cont_aux=cont+1;
        while(cont<10){
        while(cont_aux<10){
            if (Notas[cont_aux]>Notas[cont]) {
                aux=Notas[cont_aux];
                  Notas[cont_aux]=Notas[cont];
                  Notas[cont]=aux;
            }else{
            cont_aux++;
            }
            
        }
            cont++;
            cont_aux=cont+1;
        }
        System.out.println("La nota mas alta es: "+Notas[0]);
        System.out.println("La nota mas baja es: "+Notas[9]);
        
        //Promedio de while
        cont=0;
        while(cont<10){
        promediow=Notas[cont]+promediow;
        cont++;
        }
        promediow=promediow/10;
        System.out.println("El promedio es de: "+(promediow));
        
        
        //Ejercicio de Notas con do-while
      int contar=0;
      int contar_aux=0;
      int auxi=0;
        System.out.println("");
        System.out.println("Notas con ciclo do--while");
        do {
            System.out.println("Diga un numero: "+(contar+1));
            Notas[contar]=Entrada.nextInt();
            contar++;
        } while (contar<10);
        //Ordenamiento
        contar=0;
        int [] a= new int [5];
        
         contar_aux=1;
        do {
            do {
                if (Notas[contar]<Notas[contar_aux]) {
                auxi=Notas[contar_aux];
                  Notas[contar_aux]=Notas[contar];
                  Notas[contar]=auxi;
            }else{
                contar_aux++;
            }
            } while (contar_aux<9);
            contar++;
            contar_aux=contar+1;
        } while (contar<9);
        
        //Promedio de ciclo do--while
        contar=0;
        int promedio_d=0;
        do {
           promedio_d=promedio_d+Notas[contar];
           contar++;
        } while (contar<10);
        
        System.out.println("La nota mas alta es: "+Notas[0]);
        System.out.println("La nota mas baja es: "+Notas[9]);
        promedio_d=promedio_d/10;
        System.out.println("El promedio es de: "+promedio_d);
        //Ejercicio Numero 2
        
        System.out.println("Ejercicio Numero 2");
        
        int cantidad=10;
       ArrayList <Integer> numeros=new ArrayList<>(cantidad);//Se debe de usar array list debido a que los arrays simples porque tiene tama;o fijo.
        for (int i = 0; i < 10; i++) {
            System.out.println("Diga un numero"+(i+1));
            numeros.add(Entrada.nextInt());
        }
        int posA=0;
        int posB=0;
        boolean respuesta= true;
        
        char letra='S';
        int remover=0;
        do {
            if (letra==('S')) {
                for (int i = 0; i < cantidad; i++) {//Encontrar los numeros repetidos
                    for (int j = 0; j < cantidad; j++) {
                        if (numeros.get(i)==numeros.get(j)) {
                            if (numeros.get(i)==posA||numeros.get(j)==posB) {
                              break;//Para no contar dos veces los numeros ya encontrados.
                            }else{
                              posA=j;
                            posB=i;
                            remover=2;
                            }
                            
                            
                        }
                        
                    }
                }
                if (posA==0&&posB==0) {//Si no hay numeros repetidos
                    System.out.println("No hay mas numeros que sean iguales");
                    
                }else{//Si hay numeros repetidos
                 cantidad=cantidad-remover;
               int[] copiar=new int [cantidad];
                for (int i = 0; i < cantidad; i++) {
                    if (numeros.get(i)==posA) {
                     break;   
                    }else if(numeros.get(i)==posB){
                    break;
                    }else{
                    copiar[i]=numeros.get(i);
                    }
                }
                numeros.clear();
                
                for (int i = 0; i < cantidad-1; i++) {
                numeros.add(copiar[i]);
                }
               posA=0;
               posB=0;
                
                }
               
            }
            if(letra=='N'){
                System.out.println("Saliendo.....");
                respuesta=false;
            
            }
            System.out.println("Quiere buscar mas numeros que esten repetidos?");
           letra=Entrada.next().charAt(0);
        } while (respuesta);
       
    }
}
