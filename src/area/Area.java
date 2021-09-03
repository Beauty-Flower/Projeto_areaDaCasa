package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome, decisao = "S";
		double largura, comprimento, areaComodo, areaTotal;
		
		System.out.println("-----------------------------------------");
		System.out.println("C�lculo da �rea de uma casa");
		System.out.println("-----------------------------------------");
		System.out.println();
		
		System.out.print("Qual o nome do c�modo? ");
		nome = leitor.next();
		System.out.print("Qual a largura? ");
		largura = leitor.nextInt();
		System.out.print("Qual o comprimento? ");
		comprimento = leitor.nextInt();
		
		areaComodo = largura * comprimento;
		
		System.out.println("O(a) " + nome + " tem " + areaComodo + "metros quadrados." );
		
		System.out.print("Voc� deseja calcular mais c�modos(S/N)? ");
		decisao = leitor.next();
		
		while(decisao.equals("S") || decisao.equals("s")) {
			System.out.print("Qual o nome do c�modo? ");
			nome = leitor.next();
			System.out.print("Qual a largura? ");
			largura = leitor.nextInt();
			System.out.print("Qual o comprimento? ");
			comprimento = leitor.nextInt();
			
			areaComodo = largura * comprimento;
			
			System.out.println("O(a) " + nome + " tem " + areaComodo + "metros quadrados." );
			
			System.out.print("Voc� deseja calcular mais c�modos(S/N)? ");
			decisao = leitor.next();
		}
		
		System.out.println("A �rea total da casa � " +  " metros quadrados");
		System.out.println("**FIM**");
	}

}
