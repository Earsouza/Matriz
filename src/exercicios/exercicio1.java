package exercicios;

import br.edu.ifsc.estrutura.dados.util.ArrayUtils;


public class exercicio1 {

  
    public static void main(String[] args) {
        int linhas = 4;
        int colunas = 10;
        int[][] a = new int[linhas][colunas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                a[i][j] = j;
            }
        }
        System.out.println("Item a)");
        ArrayUtils.printMatriz(a);
        
        //implementar o item b
        
        int[][] c = new int[6][6];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = i;
            }
        }
        System.out.println("Item c)");
        ArrayUtils.printMatriz(c);
        
        //implementar o item d
    }
}