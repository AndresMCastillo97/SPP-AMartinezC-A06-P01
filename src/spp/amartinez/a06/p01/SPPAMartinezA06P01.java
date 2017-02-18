/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinez.a06.p01;

import java.util.*;

/**
 *
 * @author andres
 */
public class SPPAMartinezA06P01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int suma=0, numero=0;
       
        System.out.println("Suma de numeros");
        System.out.println("Introduce los numeros que quieres sumar");
        
        
        while(numero>=0){
            try{
            numero=solicitardato();
            suma=calcularsuma(numero,suma);
            }  catch (Exception ex) {
                System.out.println("El dato no es válido\nIntroduce los números");
    }
        }
            System.out.println("Suma= "+(suma-numero)); 
    }
    static int solicitardato(){    
        int numero;
        Scanner kb=new Scanner(System.in);
        numero=kb.nextInt();
        return numero;
    }
    
    static int calcularsuma(int numero,int suma){
        int s;
        s=suma+numero;
      
         return s;   
    }
 
 }

