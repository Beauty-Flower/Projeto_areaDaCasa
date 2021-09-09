package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome, decisao = "S";
		double largura, comprimento, areaComodo, areaTotal = 0;
		
		System.out.println("-----------------------------------------");
		System.out.println("Cálculo da área de uma casa");
		System.out.println("-----------------------------------------");
		System.out.println();
		
		while(decisao.equals("S") || decisao.equals("s")) {
			System.out.print("Qual o nome do cômodo? ");
			nome = leitor.next();
			System.out.print("Qual a largura? ");
			largura = leitor.nextInt();
			System.out.print("Qual o comprimento? ");
			comprimento = leitor.nextInt();
			
			areaComodo = largura * comprimento;
			
			areaTotal = areaTotal + areaComodo;
			
			System.out.println("O(a) " + nome + " tem " + areaComodo + "metros quadrados." );
			
			System.out.println();
			
			System.out.print("Você deseja calcular mais cômodos(S/N)? ");
			decisao = leitor.next();
			
			leitor.close();
		}
		
		System.out.println("A área total da casa é " + areaTotal +  " metros quadrados");
		
		System.out.println();
		
		System.out.println("**FIM**");
	}

}
