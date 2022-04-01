import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static String text = "";

    public static String Read(String FileName) {
        try (FileReader file = new FileReader(FileName)) {
            BufferedReader reader = new BufferedReader(file);
            String line = null;
            while ((line = reader.readLine()) != null) {
                text += line + "\n";
            }
            //text.deleteCharAt(text.length() - 1);
            return (text == null || text.length() == 0)
                    ? ""
                    : (text.substring(0, text.length() - 2));
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
            return "";
        }
    }

    public static String textСorrection(String text) {
        text = text.replaceAll("\n+", "\n");
        text = text.replaceAll(" +", " ");
        return text;
    }


}
