import java.io.*;


public class Main {

    public static void main(String[] args) {
        String fileName ="text.txt";
        String text=Reader.Read(fileName);
        System.out.println(text+"\n\n\n"+"New text:\n");

        text= Reader.textСorrection(text);
        System.out.println(text);


    }

}


