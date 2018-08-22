import java.util.Scanner;
public class ThreeLetterAcronym
{
    public static void main(String[] args)
    {
        String words, tla = "";
        int length;
        int count = 0;
        int i;
        char initial;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words: ");
        words = input.nextLine();
        length = words.length();
        tla += Character.toUpperCase(words.charAt(0));
        ++count;

        for (i = 1; i < length; i++)
        {
            if (count < 3)
            {
                if (words.charAt(i) == ' ')
                {
                    ++i;
                    initial = Character.toUpperCase(words.charAt(i));
                    tla += initial;
                    ++count;
                }
            }
        }

        System.out.println("The three-letter acronym: " + tla);
    }
}
