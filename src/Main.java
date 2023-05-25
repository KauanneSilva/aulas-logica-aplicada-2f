public class Main {
    public static void main(String[] args) {
        //aula de orientação à objetos
        // declarar objetos
        Pessoa adao;
        // Instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();
        // definição do formato
        adao.nome = "Adão";
        adao.sobrenome = "Silva";
        eva.nome = "Eva";
        eva.sobrenome = "Silva";
        // Acionar comportamento
        adao.falar();
        eva.falar();

        // Criar mais objetos
        Pessoa qualquer = new Pessoa();
        // Declarar objeto
        Pessoa rainha;
        // Instanciação do objeto
        rainha = new Pessoa();
        // Definido forma da pessoa
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // Definiçaão de comportamento
        System.out.println(rainha.falar("alto"));


    }
}