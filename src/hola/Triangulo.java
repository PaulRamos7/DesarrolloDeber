
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Triangulo{
    public static void main(String[] args) throws IOException{
        float altura, base,lado1,lado2,perimetro,area,calculo1;
        int numero1;
        double numero2,calculo2,calculo3,calculo4,calculo5;
        char inicial;
        BufferedReader puerta = new BufferedReader( new InputStreamReader(System.in));
        System.out.printf("%10s%40s\n","","Calculo del perímetro y Área de un Triángulo");
        System.out.printf("%10s%20s","","Ingrese la base: ");
        altura = Float.valueOf(puerta.readLine());
        System.out.printf("%10s%20s","","Ingrese la altura: ");
        base = Float.valueOf(puerta.readLine());
        System.out.printf("%10s%20s","","Ingrese el lado 1: ");
        lado1 = Float.valueOf(puerta.readLine());
        System.out.printf("%10s%20s","","Ingrese el lado 2: ");
        lado2 = Float.valueOf(puerta.readLine());
        perimetro = lado1 + lado2 +base;
        area = base*altura/2;
       
        System.out.printf("%5s%30s%5s%30s\n","","Perímetro del triángulo","","Área del triángulo");
        System.out.printf("%10s%10.2f%15s%10.2f\n\n","",perimetro,"",area);
        numero1 = Integer.valueOf(puerta.readLine());
        numero2 = Double.valueOf(puerta.readLine());
        inicial = (puerta.readLine()).charAt(0);
        System.out.printf("%5s%-10c%10d%15.2e\n\n","",inicial,numero1,numero2);
        calculo1 = Math.abs(area);
        calculo2 = Math.sin(45 * Math.PI /180);
        calculo3 = Math.sqrt(numero1);
        calculo4 = Math.pow(altura, 5);
        System.out.printf("%5s%-10f%10.2e%15.2e%10.2e\n\n","",calculo1,calculo2,calculo3,calculo4);
        calculo5 = Math.random()*10+50;
        System.out.println(calculo5);
    }
}
