package Introducao;
import java.util.Scanner;
public class CalculandoSoma {

	public static void main(String[] args) {
		
/*Pseudocodigo
 * 
		ler n1
		ler n2
		soma n1+n2
		Output soma		
*/
		
		int num1, num2, result;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite outro numero, please: ");
		num2 = entrada.nextInt();
		
		result = num1 + num2;
		System.out.println("O resultado da soma foi: " + result);

	}

}
