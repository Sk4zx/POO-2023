

public class Executavel {

    public static void main(String[] args) throws Exception{

        ContaCorrente c1 = new ContaCorrente(123,10);
        ContaCorrente c2 = new ContaCorrente(124,10);

        System.out.println(c1);
        System.out.println(c2);

        ContaCorrente.transferir(c1, c2, 3);

        System.out.println(c1);
        System.out.println(c2);
    }






}
