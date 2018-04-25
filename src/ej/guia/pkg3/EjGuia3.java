    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.guia.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nitroskate
 */
public class EjGuia3 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0, maximo;
        int numero;
        int suma=0;
        int opc=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una opcion: ");
        
        while(opc!=4){
            
            opc = input.nextInt();
            
            switch(opc){
            case 1:
                System.out.println("Digite el maximo de numeros a ingresar:");

                maximo = input.nextInt();

                Ejercicio1[] lista = new Ejercicio1[maximo];

                while(i<maximo){

                    System.out.println("Digite un numero: ");
                    lista[i] = new Ejercicio1(input.nextInt());
                    suma+= lista[i].getNumero();
                    i+=1;
                }
                System.out.println(lista.length);
                System.out.println(suma);
                System.out.println(suma/lista.length);
                break;
            case 2:
                System.out.println("Digite la cantidad de numeros que desea introducir: ");
                maximo = input.nextInt();
                Ejercicio2[] numeros = new Ejercicio2[maximo]; 
                for(int j=0; j<numeros.length; j++){
                    numeros[j] = new Ejercicio2(input.nextInt());
                }
                for(int k=0; k<numeros.length; k++){
                    System.out.println(numeros[k].getNumero());
                }
                break;
            case 3:
                
                break;
            case 8:
                Ejercicio8 ej8 = new Ejercicio8();
                maximo = input.nextInt();
                
                          
                break;
            }
        }
    
    }
}
