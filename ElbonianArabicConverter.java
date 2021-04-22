package converter;

import converter.exceptions.MalformedNumberException;
import converter.exceptions.ValueOutOfBoundsException;

/**
 * This class implements a converter that takes a string that represents a number in either the
 * Elbonian or Arabic numeral form. This class has methods that will return a value in the chosen form.
 *
 * @version 3/18/17
 */
public class ElbonianArabicConverter {

    // A string that holds the number (Elbonian or Arabic) you would like to convert
    private final String number;

    /**
     * Constructor for the ElbonianArabic class that takes a string. The string should contain a valid
     * Elbonian or Arabic numeral. The String can have leading or trailing spaces. But there should be no
     * spaces within the actual number (ie. "9 9" is not ok, but " 99 " is ok). If the String is an Arabic
     * number it should be checked to make sure it is within the Elbonian number systems bounds. If the
     * number is Elbonian, it must be a valid Elbonian representation of a number.
     *
     * @param number A string that represents either a Elbonian or Arabic number.
     * @throws MalformedNumberException Thrown if the value is an Elbonian number that does not conform
     * to the rules of the Elbonian number system. Leading and trailing spaces should not throw an error.
     * @throws ValueOutOfBoundsException Thrown if the value is an Arabic number that cannot be represented
     * in the Elbonian number system.
     */
    public ElbonianArabicConverter(String number) throws MalformedNumberException, ValueOutOfBoundsException {

        // TODO check to see if the number is valid, then set it equal to the string
        int i = 0;
        boolean start = false;
        boolean midBlank = false;
        boolean arabic = false;
        boolean elbonian = false;

        for (i = 0; i < number.length(); i++) {
            switch (number.charAt(i)) {
                case 'M':
                    elbonian = true;
                    if (arabic)
                    {
                        System.out.println("Illegal Mix of Arabic and Elbonian");
                        return;
                    }
                    System.out.println('M');
                    break;
                case 'C':
                    elbonian = true;
                    System.out.println('C');
                    break;
                case 'F':
                    elbonian = true;
                    System.out.println('F');
                    break;
                case 'D':
                    elbonian = true;
                    System.out.println('D');
                    break;
                case 'X':
                    elbonian = true;
                    System.out.println('X');
                    break;
                case 'N':
                    elbonian = true;
                    System.out.println('N');
                    break;
                case 'L':
                    elbonian = true;
                    System.out.println('L');
                    break;
                case 'I':
                    elbonian = true;
                    System.out.println('I');
                    break;
                case 'Y':
                    elbonian = true;
                    System.out.println('Y');
                    break;
                case 'V':
                    elbonian = true;
                    System.out.println('V');
                    break;
                case ' ':
                    System.out.println(' ');
                    break;
                case '0':
                    arabic = true;
                    System.out.println('0');
                    break;
                case '1':
                    arabic = true;
                    System.out.println('1');
                    break;
                case '2':
                    arabic = true;
                    System.out.println('2');
                    break;
                case '3':
                    arabic = true;
                    System.out.println('3');
                    break;
                case '4':
                    arabic = true;
                    System.out.println('4');
                    break;
                case '5':
                    arabic = true;
                    System.out.println('5');
                    break;
                case '6':
                    arabic = true;
                    System.out.println('6');
                    break;
                case '7':
                    arabic = true;
                    System.out.println('7');
                    break;
                case '8':
                    arabic = true;
                    System.out.println('8');
                    break;
                case '9':
                    arabic = true;
                    System.out.println('9');
                    break;
                default:
                    System.out.println("Invalid character");
                    return;
            }
        }

        this.number = number;
    }

    /**
     * Converts the number to an Arabic numeral or returns the current value as an int if it is already
     * in the Arabic form.
     *
     * @return An arabic value
     */
    public int toArabic() {
        // TODO Fill in the method's body
        return 1;
    }

    /**
     * Converts the number to an Elbonian numeral or returns the current value if it is already in the Elbonian form.
     *
     * @return An Elbonian value
     */
    public String toElbonian() {
        // TODO Fill in the method's body
        return "I";
    }

}
