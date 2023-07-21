package lista3;

import java.util.Scanner;

/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//lendo o valor de X
		System.out.println("Eixo X:");
		double x = sc.nextDouble();
		
		//lendo o valor de X
		System.out.println("Eixo Y:");
		double y = sc.nextDouble();

		//se x e y forem ambos diferentes de 0
		while (x != 0 && y != 0) {
			if (x>0 && y>0) {
				System.out.println("Primeiro Quadrante");
			}
			else if (x<0 && y>0) {
				System.out.println("Segundo Quadrante");
			}
			else if (x<0 && y<0) {
				System.out.println("Terceiro Quadrante");
			}
			else if (x>0 && y<0) {
				System.out.println("Quarto Quadrante");
			}
			
			System.out.println("\n"+"Eixo X:");
			x = sc.nextDouble();
			
			System.out.println("Eixo Y:");
			y = sc.nextDouble();
			
		}
		sc.close();
		
		//caso x ou y seja igual a 0 o programa sai do while e aparece essa mensagem 
		System.out.println("Um dos eixos tem vaalor nulo. \nFIM DO PROGRAMA!");
	}

}
