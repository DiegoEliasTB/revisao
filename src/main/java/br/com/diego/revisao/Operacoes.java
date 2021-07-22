package br.com.diego.revisao;

public class Operacoes {

	public static void main(String[] args) {
		Integer somaInt = 0;
		Float somaFlo;
		
		if(args.length > 3) {
			if(args.length < 4) {			
				switch(args[0]) {
					case "dividir":
						somaFlo = Float.valueOf(args[1]) / Float.valueOf(args[2]);
						System.out.println("Divis�o entre " + args[1] + " / " + args[2] + " = " + somaFlo + "\n");
					break;
					case "somar":
						somaInt = Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
						System.out.println("Soma entre " + args[1] + " + " + args[2] + " = " + somaInt + "\n");
					break;
					case "multiplicar":
						somaFlo = Float.valueOf(args[1]) * Float.valueOf(args[2]);
						System.out.println("Multiplica��o entre " + args[1] + " * " + args[2] + " = " + somaFlo + "\n");
					break;
					default:
						System.out.print("Opera��o inv�lida!\nPar�mentro informado est� incorreto");
					break;
				}			
			} else {
				System.out.println("N�mero excessivo de argumentos!");
			}
		} else {
			System.out.println("� preciso informar argumentos na aplica��o!");
		}
	}

}
