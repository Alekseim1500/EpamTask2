import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        String fileName = "text.txt";
        String text = Reader.Read(fileName);
        System.out.println("Text from file:\n" + text);

        String correctText = Reader.textСorrection(text);
        System.out.println("\n\n\n" + "Correct text:\n" + correctText);
        System.out.println("\n\n\n" + "Sentences:\n");
        String[] sentence = Fragmentation.toSentence(correctText);
        for (String s : sentence) {
            System.out.println(s + "\n");
        }

        System.out.println("\n\n\n" + "Words:\n");
        List<String> words = new ArrayList<>();
        for (String s : sentence) {
            words.addAll(Fragmentation.toWord(s));
        }
        System.out.println(words);


        System.out.println("\n\n\n" + "Mails and numbers:\n");
        List<String> mailAndNumber = Fragmentation.getMailAndNumber(words);
        System.out.println(mailAndNumber);


        System.out.println("\n\n\n" + "Filter words:\n");
        List<String> filterWords = Fragmentation.checkWords(words, 5);
        System.out.println(filterWords);


    }

}


