//Desenvolvido por:Maria Izabel
import java.util.Scanner;
public class Carro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de custo de fabrica do carro: ");
		double custofabrica = scanner.nextDouble();
		
		double percentualDistribuidor = 28.0 / 100.0;
		double percentualimpostos = 45.0 / 100.0;
		double valorDistribuidor  = custofabrica * percentualimpostos;
		
		double custofinal = custofabrica + percentualDistribuidor + valorDistribuidor;
		
		System.out.println("O custo ficou: " + custofabrica);
				
				
	}

}
