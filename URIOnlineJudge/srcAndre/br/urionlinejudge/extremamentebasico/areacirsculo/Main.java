package br.urionlinejudge.extremamentebasico.areacirsculo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {
		Scanner entrada = new Scanner( System.in );
		double raio = Double.parseDouble( entrada.next() );
		double area = 3.14159 * ( raio * raio );
		NumberFormat nf = NumberFormat.getInstance( new Locale( "en" ) );
		nf.setMinimumFractionDigits( 4 );
		nf.setMaximumFractionDigits( 4 );
		System.out.println( "A=" + nf.format( area ) );
	}
}
