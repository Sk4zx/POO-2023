package atividade2;

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Transformações de temperatura\n\n");

        System.out.println("Digite em qual escala esta a temperatura\nC - Celsius\nF - Fahrenheit");
        String Escala = scanner.next();

        System.out.println("Digite a temperatura: ");
        double T1 = scanner.nextDouble();

        double resultado = verificaEscala(Escala, T1);

        String resultadoFormatado = String.format("%.2f",resultado);

        if(Escala.equals("C") || Escala.equals("c")){
            System.out.println("Temperatura em fahrenheit: "+ resultadoFormatado);
        }

        if(Escala.equals("F") || Escala.equals("f")){
            System.out.println("Temperatura em Celsius: "+ resultadoFormatado);
        }

        scanner.close();
    }


    public static double verificaEscala(String E, double t1){
        double r = 0;

        if(E.equals("C") || E.equals("c")){
            r = t1 * 1.8 + 32;
        }

        if(E.equals("F") || E.equals("f")){
            r = (t1 - 32) / 1.8;
        }
        return r;
    }
}
