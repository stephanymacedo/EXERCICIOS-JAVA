import java.util.Scanner;

public class exercicio2 {
	
		public static void main (String [] arg){
		Scanner ler= new Scanner(System.in); 
		
		int idade, ano, anoemDias, quantidadeMeses;
		
		System.out.println("Digite sua idade em dias:");
		idade = ler.nextInt(); 
		 
	 	ano = idade/365;
	 	quantidadeMeses = (idade%365)/30;
		anoemDias = (idade%365)%30;
					
	
		 //System.out.printl ("Voce tem "+ ano + " anos e " + quantidadeMeses + " meses e "+ anoemDias + " dias de vida");
		System.out.printf("Voc? tem %d anos, %d meses, %d dias.", ano,quantidadeMeses, anoemDias);
		  
	}
	
	

}
