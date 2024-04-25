public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Instanciando uma classe, construindo um objeto

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Lilian Maria");
        pessoa1.setIdade(59);


        Carro meuCarro = new Carro();
        meuCarro.ano = "2024";
        meuCarro.cor = "vermelho perolizado";
        meuCarro.modelo = "Jeep Compass";

        
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(meuCarro.ano);
        System.out.println(meuCarro.cor);
        System.out.println(meuCarro.modelo);

    }
}


/*
 * Getters e Setters - metodos que a classe disponibiliza por validação 
 */