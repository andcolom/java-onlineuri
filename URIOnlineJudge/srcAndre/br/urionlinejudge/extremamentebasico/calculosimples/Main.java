package br.urionlinejudge.extremamentebasico.calculosimples;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {
		Scanner entrada = new Scanner( System.in );
		double raio = 0.00d;
		double area = 0.00d;
		double pi = 3.14159;
		raio = Double.parseDouble( entrada.next() );
		area = pi * Math.pow( raio, 2 );
		NumberFormat nf = NumberFormat.getInstance( new Locale( "en" ) );
		nf.setMinimumFractionDigits( 4 );
		nf.setMaximumFractionDigits( 4 );
		System.out.println( "A=" + nf.format( area ) );
	}
}
