import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class Fragmentation {
    private static final String sentanceRegular = "([.!?]+\\s)";
    private static final String phoneRegular = "(\\+[0-9]{3}\\([0-9]{2}\\)[0-9]{3}]\\-[0-9]{2}\\-[0-9]{2})";
    private static final String emailRegular = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+([a-z0-9_-]+)*\\.[a-z]{2,6}$";
    private static final String wordRegular = "([,|\\;|\\:|\\=|\\s\\-|\\(|\\)]+)";


    public static String[] toSentence(String text) {
        String[] sentence = (text + " ").split(sentanceRegular);
        return sentence;
    }

    public static List<String> toWord(String sentance) {

        List<String> list = Arrays.asList(sentance.split(wordRegular));
        return list;
    }

    public static List<String> getMailAndNumber(List<String> words) {
        List<String> mailsAndNumbers = new ArrayList<>();
        for (String s : words) {
            if (s.matches(emailRegular) || s.matches(phoneRegular)) {
                mailsAndNumbers.add(s);
            }
        }
        return mailsAndNumbers;
    }

    public static List<String> checkWords(List<String> words, int length) {
        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.matches("^[^АИОУЫЭаищуыэAEIOUYaeiouy].*") && s.length() == length) {
                iterator.remove();
            }
        }
        return words;
    }
}
