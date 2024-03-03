import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");

        String letter = input.nextLine();

        char ch = letter.charAt(0);

        if (Character.isLetter(ch))
        {
            switch(Character.toUpperCase(ch))
            {
                case 'A':
                case 'E':
                case 'I':
                case 'U': System.out.println(ch + " is a vowel"); break;
                default : System.out.println(ch + " is a consonant");
            }
        }
        else 
            System.out.println(ch + "is an invalid input'");




    }
}
