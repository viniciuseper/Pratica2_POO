import java.util.Scanner;

public class Rendimentos {
    double investimentoInicial;
    double taxaRendimento;
    int meses;

    public Rendimentos(double investimentoInicial, double taxaRendimento, int meses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaRendimento = taxaRendimento;
        this.meses = meses;
    }
    public double calcularJuros(int meses){

        return this.investimentoInicial * (Math.pow((1 + this.taxaRendimento/100), meses));

    }

    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);
        System.out.println("Digite o valor do investimento inicial: ");
        double investimento= scannear.nextDouble();
        System.out.println("Digite a taxa de rendimento: ");
        double entradaTaxaRendimento = scannear.nextDouble();
        System.out.println("Digite os meses: ");
        int entradaMeses = scannear.nextInt();

        Rendimentos rendimentos = new Rendimentos(investimento, entradaTaxaRendimento, entradaMeses);
        for (int i = 0; i <=rendimentos.meses; i++) {
            System.out.println("\nMês:" + i + "\n Valor:" + rendimentos.calcularJuros(i));

        }

    }
}
