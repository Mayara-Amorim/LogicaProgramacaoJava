package EntradaSaidaDados;
import java.util.Scanner;
public class EntradaDados {

	/*Problema: Calcular o dobro de um numero
	 * - ler o numero
	 * - multiplicar por 2
	 * - exibir o resultado	
	 */
	
	
	public static void main(String[] args) {
		int num, dobro;
		
		Scanner entrada = new Scanner(System.in); 
			
		System.out.println("Digite um valor: ");
		
		num = entrada.nextInt();
		dobro = num + num;
		
		System.out.println("O dobro de " + num + " é " + dobro);
	}

}
