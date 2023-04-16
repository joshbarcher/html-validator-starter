package validator;

/**
 * This class stores a String containing HTML text
 * and can report whether the HTML is valid or not.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Validator
{
    private String path;

    /**
     * Stores an HTML string to inspect.
     * @param path the HTML string
     */
    public Validator(String path)
    {
        this.path = path;
    }

    /**
     * Reports whether the HTML string in the class
     * has valid HTML or not.
     * @return true if the HTML is valid, or otherwise false
     */
    public boolean isValid()
    {
        return false;
    }
}
