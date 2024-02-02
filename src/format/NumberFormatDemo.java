package format;

import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;

import static format.FormatoCustomizado.formatNumber;


public class NumberFormatDemo {



    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCompactNumberInstance();
        System.out.println(format.format(1000));
        format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println(format.format(1000));
        System.out.println(format.format(1000000));
        NumberFormat myformat0 = NumberFormat.getNumberInstance(Locale.US);
        System.out.print("US: $");
        System.out.println(myformat0.format(12324.134));
        formatNumber("##.##", 12.745);
        formatNumber("00.00", 12324.134);
        System.out.println("");
        NumberFormat myformat = NumberFormat.getNumberInstance(Locale.US);
        System.out.print("US: $");
        System.out.println(myformat.format(12324.134));
        System.out.print("India: Rs.");
        System.out.println(myformat.format(12324.134));
        NumberFormat myformat2 = NumberFormat.getNumberInstance(Locale.CHINA);
        System.out.print("China:￥.");
        System.out.println(myformat2.format(12324.134));
        NumberFormat myformat3 = NumberFormat.getNumberInstance(Locale.FRANCE);
        System.out.print("France: ");
        System.out.println(myformat3.format(12324.134));

    }
}
