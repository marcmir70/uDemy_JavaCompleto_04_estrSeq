import java.util.Locale; // aula 22

public class Main {
	public static void main(String[] args) {
		System.out.println("Ol�, mundo!");  

// aula 22		
		System.out.println("Bom dia");  // println faz 'quebra de linha'
		
		System.out.print("Ol�, mundo!");
		System.out.println("Bom dia!"); // print (sem 'ln') n�o...
		
		int y = 32;
		System.out.println("vari�vel Y");
		System.out.println(y);  

		double x = 10.35784;
		System.out.println("vari�vel X");
		System.out.println(x);
	
		System.out.printf("%.2f%n", x);  // formatado * pega o formato do computador
		System.out.printf("%.4f%n", x);  // se em computador no Portugu�s traz v�rgula
	
		Locale.setDefault(Locale.US); // exige a declara��o IMPORT
		System.out.printf("%.4f%n", x);  // com o Locale usa relacionado ao idioma informado

		System.out.println("RESULTADO = " + x + " METROS");
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		String nome = "Maria"; // String tem que ser declarada iniciada com letra mai�scula
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",  nome, idade, renda);
	}
}
