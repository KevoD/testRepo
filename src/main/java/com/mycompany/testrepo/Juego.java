/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testrepo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class Juego {
    
    public static void main(String[] args) {
        int numero, numeroaleatorio,contador=0;
        Random r = new Random ();
        Scanner teclado = new Scanner(System.in);
        do{
           System.out.println("Dame un numero entre 1 y 20");
        
        numero = Integer.parseInt(teclado.nextLine());
        numeroaleatorio=r.nextInt(20)+1;
        if (numero == numeroaleatorio){
            System.out.println("Ganaste crack, el numero de la vistoria fue "+numero);
        }
        else{
            System.out.println("Paila perdiste mi ñero, ese numero "+numero+" es malo");
        }
        contador=(contador+1);
        }
        
        while(numeroaleatorio!=numero);
        System.out.println("ganaste al los "+contador+" intentos");
   
        
        
   }
}
