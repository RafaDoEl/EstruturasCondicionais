import javax.swing.*;

public class ReajusteSalarial {
    public static void main(String[] args) {
        final double INFLACAO = 3.8;

        String salarioStr = JOptionPane.showInputDialog(null, "Digite o salário atual do colaborador:",
                "Reajuste Salarial", JOptionPane.QUESTION_MESSAGE);

        double salarioAtual = Double.parseDouble(salarioStr);
        double percentualAumento = 0;

        if (salarioAtual <= 280) {
            percentualAumento = 20.0;
        } else if (salarioAtual > 280 && salarioAtual <= 700) {
            percentualAumento = 15.0;
        } else if (salarioAtual > 700 && salarioAtual <= 1500) {
            percentualAumento = 10.0;
        } else {
            percentualAumento = 5.0;
        }

        double valorAumento = salarioAtual * (percentualAumento / 100);
        double novoSalario = salarioAtual + valorAumento;
        double aumentoReal = valorAumento - (salarioAtual * (INFLACAO / 100));

        String resultado = String.format(
                "--- Resultados ---\n" +
                        "Salário antes do reajuste: R$ %.2f\n" +
                        "Percentual de aumento aplicado: %.2f%%\n" +
                        "Valor do aumento: R$ %.2f\n" +
                        "Novo salário, após o aumento: R$ %.2f\n" +
                        "Valor do aumento real (descontada a inflação): R$ %.2f",
                salarioAtual, percentualAumento, valorAumento, novoSalario, aumentoReal);

        JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
