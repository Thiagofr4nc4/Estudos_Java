package enumeradores;

public class Teste {
    public static void main(String[] args) {
        usandoConstantes();

        System.out.println();

        usandoEnum();
    }
    private  static void usandoConstantes(){
        int segunda = DiaSemana.SEGUNDA;
        int terca = DiaSemana.TERCA;
        int quarta = DiaSemana.QUARTA;
        int quinta = DiaSemana.QUINTA;
        int sexta = DiaSemana.SEXTA;
        int sabado = DiaSemana.SABADO;
        int domingo = DiaSemana.DOMINGO;

        System.out.println("Usando constantes");
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terca);
        imprimirDiaSemana(quarta);
        imprimirDiaSemana(quinta);
        imprimirDiaSemana(sexta);
        imprimirDiaSemana(sabado);
        imprimirDiaSemana(domingo);
    }
    private static void imprimirDiaSemana(int dia){
        switch (dia){
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sabádo");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Dia inválido!");
        }
    }

    private static void usandoEnum(){
        System.out.println("Usando Enum ");

        DiaSemanaDois segunda = DiaSemanaDois.SEGUNDA;
        DiaSemanaDois terca = DiaSemanaDois.TERCA;
        DiaSemanaDois quarta = DiaSemanaDois.QUARTA;
        DiaSemanaDois quinta = DiaSemanaDois.QUINTA;
        DiaSemanaDois sexta = DiaSemanaDois.SEXTA;
        DiaSemanaDois sabado = DiaSemanaDois.SABADO;
        DiaSemanaDois domingo = DiaSemanaDois.DOMINGO;

        imprimirDiaSemanaDois(segunda);
        imprimirDiaSemanaDois(terca);
        imprimirDiaSemanaDois(quarta);
        imprimirDiaSemanaDois(quinta);
        imprimirDiaSemanaDois(sexta);
        imprimirDiaSemanaDois(sabado);
        imprimirDiaSemanaDois(domingo);




    }

    private static void imprimirDiaSemanaDois(DiaSemanaDois dia){
        switch (dia){
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sabádo");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;

        }
    }


}
