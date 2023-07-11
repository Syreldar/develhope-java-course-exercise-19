/**
 * provides methods for various word-based games.
 *
 * @author Enrico Drago
 */
public class WordGames
{
    /**
     * Adds "Hello" to the front of the input word.
     *
     * @param word The input word that will have "Hello" added to the front.
     * @return A String containing "Hello" plus the input word.
     */
    public String addHelloWord(String word)
    {
        return String.format("Hello %s", word);
    }

    /**
     * Concatenates a name and surname.
     *
     * @param name The first name.
     * @param surname The last name.
     * @return A String containing the full name.
     */
    public String getFullName(String name, String surname)
    {
        return name + " " + surname;
    }
}
