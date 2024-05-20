package contato;

public class TesteContato {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Thiago");
        contato.setTelefone("9900001100");


        //criar objeto endereco

        Endereco end = new Endereco();
        end.setNomeRua("Limgrave");
        end.setCidade("Elden");
        end.setCep("00000002");
        end.setEstado("Firelink");
        end.setComplemento("sei la");

        contato.setEndereco(end);


        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco());
        System.out.println(contato.getTelefone());
    }
}
