package view;

import java.util.Random;

import controller.ThreadMatriz;

public class main {

	public static void main(String[] args) {
		Random Gerador = new Random();
		int M[][]=new int [3][5];
		
		for(int x=0;x<3;x++) {
			for(int y=0;y<5;y++) {
				M[x][y] = Gerador.nextInt(20);
			}
		}
		
		for (int linha=0;linha<3;linha++) {
			Thread ThreadMatriz= new ThreadMatriz(M,linha);
			ThreadMatriz.start();
			}
		
     }

}
