import java.util.Scanner;

public class exercicio1 {
	
		public static void main(String [] arg){
		
		int ano, meses, dias, totalemDias;
		Scanner ler= new Scanner(System.in); 
		
		System.out.println("Digite os anos:");
		ano= ler.nextInt();
		System.out.println("digite os meses:");
		meses= ler.nextInt();
		System.out.println("Digite os dias:");
		dias= ler.nextInt();
		
		totalemDias= (ano*365)+ (meses*30)+ dias;
		System.out.println("Sua idade aproximadamente em dias ?:" + totalemDias);
		
	}

}
