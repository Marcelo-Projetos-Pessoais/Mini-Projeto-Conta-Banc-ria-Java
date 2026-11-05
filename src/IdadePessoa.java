public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if ( idade < 18 && idade > 0){
            System.out.println(nome + " é menor de idade!");
        }
        else if (idade < 0) {
            System.out.println("Essa idade não é válida!");
        }
        else {
            System.out.println(nome + " é maior de idade!");
        }
    }
}
