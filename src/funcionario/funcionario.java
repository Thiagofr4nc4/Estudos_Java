package funcionario;
import infoFuncionario.*;
public class funcionario {
    public static void main(String[] args) {

        infofuncionario funcionario = new infofuncionario();
        String nome = funcionario.addNome();
        double salario = funcionario.addSalario();
        double imposto = funcionario.addImposto();
        double aumento = funcionario.addAumento();

        funcionario.resumo();





    }

    }
