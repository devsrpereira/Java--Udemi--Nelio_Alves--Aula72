package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.printf("%nWhat is the dollar price? ");
        converter.p = s.nextDouble();

        System.out.printf("How many dollar will be bought? ");
        converter.m = s.nextDouble();

        System.out.printf("Almost to be paid in reais = R$ %.2f%n",converter.calc());

    }
}
