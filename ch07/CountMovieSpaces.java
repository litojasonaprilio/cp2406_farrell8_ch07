public class CountMovieSpaces
{
    public static void main(String[] args)
    {
        String quote = "Pity yourself and life becomes an endless nightmare.";
        int num = 0;
        int stringLength = quote.length();

        for (int i = 0; i < stringLength; i++)
        {
            if (quote.charAt(i) == ' ')
            {
                num += 1;
            }
        }
        System.out.println("Total number of spaces contained in the String: " + num);
    }
}
