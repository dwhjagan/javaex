package Sample.Java.FirstProgram.charclass;

public class charclass {

    public static void main(String args[]) {

        System.out.println("isLetter");
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));

        System.out.println("isDigit");
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isDigit('5'));

        System.out.println("isWhitespace");
        System.out.println(Character.isWhitespace('c'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));

        System.out.println("isUpperCase");
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isUpperCase('\n'));
        System.out.println(Character.isUpperCase('\t'));

        System.out.println("isLowerCase");
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isLowerCase('C'));
        System.out.println(Character.isLowerCase('\n'));
        System.out.println(Character.isLowerCase('\t'));

        System.out.println("toString");
        System.out.println(Character.toString('c'));
        System.out.println(Character.toString('C'));

    }
}

/*


Escape Sequence	Description
\t	Inserts a tab in the text at this point.
\b	Inserts a backspace in the text at this point.
\n	Inserts a newline in the text at this point.
\r	Inserts a carriage return in the text at this point.
\f	Inserts a form feed in the text at this point.
\'	Inserts a single quote character in the text at this point.
\"	Inserts a double quote character in the text at this point.
\\	Inserts a backslash character in the text at this point.
 */