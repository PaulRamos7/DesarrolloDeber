/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hola;

/**
 *
 * @author Personal
 */
public class Toapanta {
    
    public static void main(String[] args) {
        // Declarar un arreglo bidimensional o MATRIZ
        float[][] m1;
        
        // Inicializar la matriz
        m1 = new float [5][3];
        
        // Asignar valores
        m1[0][0] = 10f;
        m1[0][1] = 15f;
        m1[0][2] = 5f;
        m1[1][0] = 11f;
        m1[1][1] = 12f;
        m1[1][2] = 13f;
        m1[2][0] = 21f;
        m1[2][1] = 22f;
        m1[2][2] = 30f;
        m1[3][0] = 40f;
        m1[3][1] = 50f;
        m1[3][2] = 60f;
        m1[4][0] = 70f;
        m1[4][1] = 80f;
        m1[4][2] = 90f;
        // Salida de matriz
        for(int i= 0; i <= 4; i++){     // filas
            for(int j = 0; j <= 2; j++){        // columnas
                System.out.print(m1[i][j] + "    ");
            }
            System.out.println("");
             //System.out.println("Hola  Paul Ramos");
        }
        
    }
}
