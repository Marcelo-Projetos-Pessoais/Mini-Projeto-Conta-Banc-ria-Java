public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setSaldo(2000);
        conta.titular = "Marcelo";

        System.out.println("Títular: " + conta.titular);
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());

        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Gabriela");
        pessoa1.setIdade(15);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Jack");
        pessoa2.setIdade(12);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade());
        pessoa1.verificarIdade();
        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade());
        pessoa2.verificarIdade();

        Produto produto = new Produto();

        produto.setNome("Perfume");
        produto.setPreco(120.00);

        System.out.println("O preço do " + produto.getNome() + "antes do desconto de 50%: " + produto.getPreco());
        produto.aplicarDesconto(50);
        System.out.println("O preço do " + produto.getNome() + " depois do desconto de 50%: " + produto.getPreco());

        Aluno aluno = new Aluno();

        aluno.setNome("Marcelo");
        aluno.setNota1(8);
        aluno.setNota2(7.25);
        aluno.setNota3(9);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Nota 3: " + aluno.getNota3());
        double media = aluno.calcularMedia(3);
        System.out.println("A média do aluno " + aluno.getNome() + " é de: " + media);

        Livros livro = new Livros();

        livro.setTitulo("A assassina");
        livro.setAutor("Gabriela Nellessen de Souza");

        System.out.println("Título do livro: " + livro.getTitulo());
        System.out.println("Autora: " + livro.getAutor());
    }
}
