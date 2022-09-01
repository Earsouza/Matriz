package exercicios;

import br.edu.ifsc.estrutura.dados.util.ArrayUtils;


public class exercicio7 {

    public static double maiorValor(double[][] m){
        double maior = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }
        return maior;
    }
    public static void main(String[] args) {
        int linhas = 10;
        int colunas = 10;
        double[][] m = new double[linhas][colunas];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (Math.random() * 100);
            }
        }
        

        ArrayUtils.printMatriz(m);
        System.out.printf("Maior elemento é o %.2f\n", maiorValor(m));

    }

}
