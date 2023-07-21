package lista3;

import java.util.Scanner;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//ler a senha
		System.out.println("Digite a senha:");
		int senha = sc.nextInt();
		
		//caso a senha seja incorreta cai nesse while 
		while (senha != 2002) {
			//apresenta essa mensagem
			System.out.println("Senha Invalida!\n");
	
			//e você pode novamente digitar
			System.out.println("Digite a senha:");
			senha = sc.nextInt();
		}
		
		sc.close();
		
		//ao colocar a senha certa sai do while e é exibido essa mensagem
		System.out.println("Acesso Permitido!");
	}

}
