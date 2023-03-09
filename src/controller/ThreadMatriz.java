package controller;

public class ThreadMatriz extends Thread{
	private int M[][];
	private int linha;
	
	public ThreadMatriz(int M1[][], int linha1) {
		M=M1;
		linha=linha1;
	}
	
	public void run() {
	SomaLinha();	
	}
	
	//Soma cada linha do vetor;
	private void SomaLinha(){
		int soma=0;;
		for(int y=0;y<5;y++) {
				soma = soma+M[linha][y];
			}
			System.out.println("Linha: " +linha+ " Soma: " +soma);
			soma=0;
	}
	
}
