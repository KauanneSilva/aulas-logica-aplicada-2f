public class Pessoa extends Animal {
    String sobrenome;
    // atributos da classe

    String Sobrenome;
    // Método da classe
    public void falar(){
        System.out.println("falei");
    }
    public String falar (String volume){
        return "falei" + volume;
    }
    // sobreescrito do método
    public void comer(){
        System.out.println("pessoa comeu");
    }
}
