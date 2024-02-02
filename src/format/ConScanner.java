package format;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConScanner {

    public static String currencyFormatter(double payment, String language, String country){
        Locale locale = new Locale(language, country);
        NumberFormat usCurrencyFormatter = NumberFormat.getCurrencyInstance(locale);
        String currency = usCurrencyFormatter.format(payment);
        return currency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        // Write your code here.
        System.out.println("US: " + currencyFormatter(payment,"en", "US"));
        System.out.println("India: " + currencyFormatter(payment, "en", "IN"));
        System.out.println("China: " + currencyFormatter(payment, "zh", "CN"));
        System.out.println("France: " + currencyFormatter(payment, "fr", "FR"));

        scanner.close();
    }
}
