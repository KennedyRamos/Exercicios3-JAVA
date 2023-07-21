package lista3;

import java.util.Scanner;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível*/

public class exercicio03 {
	
	public static void main(String[] args) {
		
		//variaveis inicializadas
		int alcool = 0, gasolina = 0, diesel = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//menu de escolha
		System.out.println("[1] - Álcool");
		System.out.println("[2] - Gasolina");
		System.out.println("[3] - Diesel");
		System.out.println("[4] - Sair");
		System.out.print(">> ");
		int codigo = sc.nextInt();
		
		//caso nao seja digitado o número 4
		while (codigo != 4) {
			
			if (codigo == 1) {
				alcool += 1;
			}
			else if (codigo == 2) {
				gasolina += 1;
			}
			else if (codigo == 3) {
				diesel += 1;
			}
			else {
				System.out.println("CODIGO INVALIDO"+"\n");
			}
			
			// apos a acumulação de qual combustivel foi preterido vem novamente o menu de escolha, se ele(menu) vinher antes do IF o primeiro valor sera substituido antes de ser computado
			System.out.println("[1] - Álcool");
			System.out.println("[2] - Gasolina");
			System.out.println("[3] - Diesel");
			System.out.println("[4] - Sair");
			System.out.print(">> ");
			codigo = sc.nextInt();
				
		}
		sc.close();
		
		//ao apertar 4 o usuario sai do menu
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}
	

}
