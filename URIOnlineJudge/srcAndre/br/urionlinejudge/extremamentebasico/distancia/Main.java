package br.urionlinejudge.extremamentebasico.distancia;

import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {
		Scanner entrada = new Scanner( System.in );
		double distancia = Double.parseDouble( entrada.next() );
		double minutos = (distancia*3600) / 30 / 60;
		System.out.println((int) minutos + " minutos" );
	}

}
