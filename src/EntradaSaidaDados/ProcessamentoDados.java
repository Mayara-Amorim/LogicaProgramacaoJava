package EntradaSaidaDados;

public class ProcessamentoDados {

	public static void main(String[] args) {
		int num = 2;
		int num2 = 6;
		int num3 = 4;
		int multiplicacao = num * num2;
		int quebraPrioridade;
		

		/*
		 * Para realizar demais consultas basta trocar o operador ARITIMETICO * por: /
		 * DIVISÃO % MODULO (resto da divisão) + SOMA - SUBTRACAÕ EXPONENCIACÃO NÃO
		 * EXISTE EM JAVA () QUEBRA DE PRIORIDADE
		 * Na matemática sabemos que a multiplicação é realizada primeiro,
		 * se quisermos fazer com que a soma (por exemplo) tenha prioridade maior,
		 * colocamos essa operação entre parenteses.
		 * 
		 * VEJA ABAIXO:
		 * 
		 */
		quebraPrioridade = (num + num3) * num2;
		System.out.println(quebraPrioridade);
	}

}
