import java.util.Scanner;

	public class exercicio3 {

	public static void main (String [] arg){
		Scanner ler= new Scanner(System.in); 
		
		int tempoDuracao, horas, minutos, segundos;
		
		
		
		System.out.println("O tempo de dura??o em segundos:");
		tempoDuracao = ler.nextInt(); 
		
				horas = tempoDuracao/3600 ;
				minutos = (tempoDuracao % 3600)/60;
				segundos = (tempoDuracao % 3600) % 60;
				
	
		
		
		System.out.println("Hora[s]: ");
		System.out.println("Minuto[s]:");
		System.out.println("segundo[s]:");

	}
}
