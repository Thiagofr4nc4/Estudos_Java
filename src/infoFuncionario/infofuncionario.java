package infoFuncionario;
import java.util.Scanner;
public class infofuncionario {
    Scanner scanner = new Scanner(System.in);
    String nome;
    double salario;
    double imposto;

    double aumento;

    public String addNome(){
        System.out.println("Digite o nome do funcionário: ");
        nome = scanner.nextLine();
        return nome;
    }

    public double addSalario(){
        System.out.println("Digite o salário do funcionário: ");
        salario = scanner.nextDouble();
        return salario;
    }

    public double addImposto(){
        System.out.println("Digite o valor da taxa do imposto: ");
        imposto = scanner.nextDouble();
        salario -= imposto;
        System.out.println("Salário liquido após descontos: "+salario);
        return salario;
    }

    public double addAumento(){
        System.out.println("Digite a % de aumento: ");
        aumento = scanner.nextDouble();
        double valorAumento = (aumento / 100) * salario;
        salario += valorAumento;
        return salario;
    }

    public void resumo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Imposto: " + imposto);
        System.out.println("Aumento: " + aumento+ "%");
    }
}
