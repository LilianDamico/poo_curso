public class App {
    public static void main(String[] args) {
        System.out.println("Sonhar acordado faz bem!");

        //Instanciando uma classe, construindo um objeto

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Lilian Maria");
        pessoa1.setIdade(59);


        Carro meuCarro = new Carro();
        meuCarro.setAno("2024");
        meuCarro.setCor("Vermelho Perolizado");
        meuCarro.setModelo("Jeep Compass");

        
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(meuCarro.getAno());
        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getCor());

    }
}


/*
 * Getters e Setters - metodos que a classe disponibiliza por validação 
 */