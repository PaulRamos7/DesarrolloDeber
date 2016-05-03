/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;

/**
 *
 * @author Toshiba
 */
public class Matzabalin {
    public static void main(String[] args) {
        //Declaracion de variables
      float[][] sueldo={{300, 400,500},
       {350,420,600}, 
       {380,520,520}, 
       {400,450,580},
      {400,450,580}};        
       //Salida
       imprimirMtriz(sueldo);
    }
    
    public static void imprimirMtriz(float[][] dato) {
        int d, f;            //dato[d][f];
        int n, m;
        //Entrada
        n = dato.length;
        System.out.println("n = " + n);
        m = dato[0].length;
        System.out.println("m = " + m);
        System.out.printf("%5s-!\n",
                "");
       //Proceso
        //Salida
        d = 0;
        do { //ciclo de filas
            f = 0;
            while (f < m) {                   //ciclo de columnas
                System.out.printf("%10.2f",
                        dato[d][f]);
                f++;
            }
            System.out.println();
            d++;
        } while (d < n);
         //System.out.println("Hola  Paul Ramos");
    }

          
}
