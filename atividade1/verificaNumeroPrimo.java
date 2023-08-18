package atividade1;

import java.util.Scanner;

public class verificaNumeroPrimo {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se ele é primo: ");

        int numero = scanner.nextInt();

        int resultado = verificarNumeroPrimo(numero);

        if(resultado==1){
            System.out.println(numero + " é primo, retorno:" + resultado);
        }

        if(resultado==0){
            System.out.println(numero + " não é primo, retorno: " + resultado);

        }

        scanner.close();

        }

    public static int verificarNumeroPrimo(Integer n){
        
            if(n<=1){
                return 0;
            }

            for(int i=2; i<Math.sqrt(n); i++){
                if(n%i==0){
                    return 0;
             }
            }

            return 1;
        
        }

}
