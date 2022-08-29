package EntradaSaidaDados;
import java.util.Scanner;
public class DePara {

	public static void main(String[] args) {
		int num, cubo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		
		num = entrada.nextInt();
		cubo = num * num * num;
		
		System.out.println("O resultado é de: " + cubo);
	

	}

}
