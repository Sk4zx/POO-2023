package revisao.ferramenta;

public class Pessoa {
    
    public String palavraCumprimento;

    public Pessoa(String palavra){
        this.palavraCumprimento = palavra;
    }
    public void cumprimentar(){
        System.out.println(this.palavraCumprimento);
    }

}
