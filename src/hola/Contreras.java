/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hola;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Contreras {
     public static void main(String[] args) {
         System.out.println("HOLA MUNDO :D :D");
         int a,b,s;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese un numero");
        a= Integer.valueOf(entrada.nextLine());
        System.out.println("ingrese un numero");
        b= Integer.valueOf(entrada.nextLine());
        s=a+b;
        System.out.println("la suma es " + s);
     }
     }

