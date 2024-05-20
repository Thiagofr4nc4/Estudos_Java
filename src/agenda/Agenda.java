package agenda;

public class Agenda {
    private String nome;
    private String numero;
    private String endereco;


    public Agenda(String nome, String numero, String endereco) {
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;
    }

    @Override
    public String toString(){
        return "informações: " + nome + " " + numero + " " + endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
