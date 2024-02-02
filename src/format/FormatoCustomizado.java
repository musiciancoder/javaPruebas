package format;





import java.text.DecimalFormat;
        import java.text.ParsePosition;

public class FormatoCustomizado {
    private static DecimalFormat formatter = new DecimalFormat();

    public static void main(String[] args) {
        formatNumber("##.##", 12.745);
        formatNumber("##.##", 12.746);
        formatNumber("0000.0000", 12.735);
        formatNumber("#.##", -12.735);

        // Positive and negative number format
        formatNumber("#.##;(#.##)", -12.735);

        // Parse a string to decimal number
        String str = "XY4,123.983";
        String pattern = "#,###.###";
        formatter.applyPattern(pattern);//from w  w  w  . j a  v a  2s.com

        // Create a ParsePosition object to specify the first digit of
        // number in the string. It is 4 in "XY4,123.983"
        // with the index 2.
        ParsePosition pp = new ParsePosition(2);

        Number numberObject = formatter.parse(str, pp);

        double value = numberObject.doubleValue();
        System.out.println("Parsed Value is " + value);
    }

    public static void formatNumber(String pattern, double value) {
        // Apply the pattern
        formatter.applyPattern(pattern);

        // Format the number
        String formattedNumber = formatter.format(value);

        System.out.println("Number:" + value + ", Pattern:" + pattern
                + ", Formatted Number:" + formattedNumber);
    }
}