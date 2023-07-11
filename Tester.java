/**
 * Tests methods in the WordGames class.
 *
 * @author Enrico Drago
 */
public class Tester
{
    /**
     * The main method in the Tester class for testing the WordGames class.
     *
     * @param args Unused.
     */
    public static void main(String[] args)
    {
        WordGames wg = new WordGames();

        System.out.println(wg.addHelloWord("World!"));
        System.out.println(wg.getFullName("Enrico", "Drago"));
    }
}
