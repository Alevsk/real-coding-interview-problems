import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * This is the file with your answer, do not rename or move it.
 * Write your code in it, and save it before submitting your answer.
 */

/*
* Write the code for your answer in this class.
*/
public class Answer
{
    /**
    * Determine if the provided string is a valid socket address.
    *
    * This method declaration must be kept unmodified.
    *
    * @param address A string with a socket address, eg, 
    *                '127.12.23.43:5000', to be checked for validity.
    * @return boolean indicating wether the provided string is a valid
    *                  socket address
    */
    public static boolean isValidSocketAddress(String address)
    {
        Pattern pattern;
        Matcher matcher;

        String socket_address =
                        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + //number between 0-255
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +  //number between 0-255
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +  //number between 0-255
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5]):" +    //number between 0-255
                        "(6553[0-5]|655[0-2]\\d|65[0-4]\\d{2}|6[0-4]\\d{3}|[1-5]\\d{4}|[1-9]\\d{0,3})$"; //valid por number

        pattern = Pattern.compile(socket_address);
        matcher = pattern.matcher(address);
        return matcher.matches();
    }

    /*
    * This tests your code with the examples given in the question,
    * and is provided only for your conveinience.
    */
    public static void main(String[] args)
    {
        String[] addresses = {"127.12.23.43:5000", "127.A:-12"};
        for (String address : addresses)
        {
            System.out.println(isValidSocketAddress(address));
        }
    }
}
