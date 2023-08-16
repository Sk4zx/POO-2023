package atividade1;

import java.util.Scanner;

public class verificarNumeroPrimo {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se ele é primo: ");

        int numero = scanner.nextInt();
        
        verificaNumeroPrimo(numero);
        
        int resultado = verificaNumeroPrimo(numero);

        if(resultado==1){
            System.out.println(numero + " é primo");
        }

        if(resultado==0){
            System.out.println(numero + " não é primo");
        }

        scanner.close();

        }

        public static int verificaNumeroPrimo(Integer n){
        
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
