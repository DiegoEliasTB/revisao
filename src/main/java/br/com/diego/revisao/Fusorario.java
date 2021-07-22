package br.com.diego.trijava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fusorario {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		Scanner s = new Scanner(System.in);
		LocalDate niver = LocalDate.parse(s.next(), DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("Data de aniversário: " + niver.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		Integer dias = 0;
		
		int mesAtual = hoje.getMonthValue();
		Integer diaAtual = hoje.getDayOfMonth();
		
		int mesNiver = niver.getMonthValue();
		Integer diaNiver = niver.getDayOfMonth();
		
		Boolean niverOk = (mesNiver < mesAtual || (mesNiver == mesAtual && diaNiver < diaAtual));
		
		if(niver.isBefore(hoje)) {
			while(niver.isBefore(hoje)) {
				niver = niver.plusDays(1);
				dias++;
			}	
		} else {
			while(hoje.isBefore(niver)) {
				hoje = hoje.plusDays(1);
				dias--;
			}
		}
		
		if (niverOk && dias > 366) {
			System.out.println("Voce já fez aniversário!");
		}
		
		if (dias != -1 && dias != 1) {
			System.out.println("Voce viveu " + dias + " dias");
		} else {
			System.out.println("Voce viveu " + dias + " dia");
		}
	}
}