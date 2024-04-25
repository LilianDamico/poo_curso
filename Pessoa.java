public class Pessoa {
    private String nome; //atributos
    private Integer idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return this.idade;
    }
    
}

/**
 * METODOS ACESSORES:
 * 
 * PUBLIC: QUALQUER UM PODE ACESSAR O ELEMENTO
 * PRIVATE: INDICA QUE SOMENTE A CLASSE CONSEGUE ACESSAR
 * PROTECTED: INDICA QUE SOMENTE A CLASSE E SEUS FILHOS CONSEGUE ACESSAR 
 * DEFAULT: INDICA QUE SOMENTE A CLASSE, SEUS FILHOS E 
 * AS CLASSES NO MESMO PACKAGE CONSEGUE ACESSAR
 */
