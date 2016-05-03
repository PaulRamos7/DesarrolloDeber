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
public class Jessenia {
    public static void main(String[] args) {

//NUMEROS PARES DEL 1 AL 10 con for

System.out.println("Acontinuacion e muetra la serie de numeros paresn");

int x;

int y;

for(int i=1;i<5;i++)

{

x=i*2;//aqui X toma el valor del actual valor de i, multiplicado por 2

System.out.println("Numero par:"+x);

}

 

//NUMEROS IMPARES DEL 1 AL 10 con while

System.out.println("Acontinuacion se muestra la serie de numeros imparesn");

int j=1;

while(j<10)

{

System.out.println("Numero impar:"+j);

j=j+2;/*aqui incremantamos la variable j en 2, de manera
32
que si tenia el valor de 1, se le suma 2 y valdra 3
33
* cuando j llegue al valor igual o mayor a 10, el ciclo termina
34
 
35
*/

}

 

}

}
