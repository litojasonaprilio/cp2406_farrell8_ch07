import java.util.Scanner;
public class CountMovieSpaces2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a movie quote: ");
        String quote = input.nextLine();
        int num = 0;
        int stringLength = quote.length();

        for (int i = 0; i < stringLength; i++)
        {
            if (quote.charAt(i) == ' ')
            {
                num += 1;
            }
        }
        System.out.println("Total number of spaces contained in the movie quote: " + num);
    }
}
