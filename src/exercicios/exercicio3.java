package exercicios;

import java.util.Scanner;

public class exercicio3 {

	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        double[][] m = new double[2][5];
	        for (int i = 0; i < m.length; i++) {
	            for (int j = 0; j < m[i].length; j++) {
	                System.out.printf("Entre com o valor (%s,%s)\n", i, j);
	                m[i][j] = s.nextDouble();
	            }
	        }
	        System.out.println("Matriz digitada foi");
	        ArrayUtils.printMatriz(m);
	    }
	}
