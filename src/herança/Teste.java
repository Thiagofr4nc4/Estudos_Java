package herança;

public class Teste {
    public static void main(String[] args) {

       Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        Pessoa pessoa = new Pessoa();

        pessoa.setEndereco("Limgrave");
        aluno.setEndereco("Liurnia");
        professor.setEndereco("Anor Londo");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
}
