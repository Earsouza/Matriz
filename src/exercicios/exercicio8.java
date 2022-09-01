package exercicios;

import br.edu.ifsc.estrutura.dados.util.ArrayUtils;


public class exercicio8 {

    public static double soma(double[][] m) {
        double soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                soma += m[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        int linhas = 2;
        int colunas = 2;
        double[][] m = new double[linhas][colunas];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 10);
            }
        }
        ArrayUtils.printMatriz(m);

        System.out.printf("A soma da matriz = %.2f", soma(m));
    }
}