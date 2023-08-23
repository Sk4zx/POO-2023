package atividade2;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Calculadora\n\nDigite a operação:\n+ - * /");
        String op = scanner.next();

        while(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")){
            System.out.println("Operação invalida\nDigite a operação:\n+ - * /");
            op = scanner.next();
        }

        System.out.println("Digite o primeiro número:");
        float n1= scanner.nextFloat();

        System.out.println("Digite o segundo número:");
        float n2= scanner.nextFloat();

        float resultado = Calcula(op, n1, n2);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static float Calcula(String op, float n1, float n2){
        
        float r=0;
        switch(op){
            case "+":
            r = n1+n2;
            break;
            
            case "-":
            r = n1-n2;
            break;

            case "*":
            r = n1*n2;
            break;

            case"/":
            if(n2==0){
                System.out.println("Erro: Impossivel dividir por 0");
            }else{
                r = n1/n2;
            }
            break;
        }
        return r;
    }

}    
