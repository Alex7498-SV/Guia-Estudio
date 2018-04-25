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
public class Ejercicio8 {

    public Ejercicio8(){
        
    }
    
    public void Lista(int l){
        Scanner input= new Scanner(System.in);
        ArrayList<Double> list= new ArrayList();
        for(int i=0;i<l;i++){
            System.out.println("Ingrese un numero: ");
            list.add(input.nextDouble());
            //Puta madre con vos
        }
    }
    
}
