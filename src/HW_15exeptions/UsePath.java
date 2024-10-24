package HW_15exeptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsePath {
    public static void main(String[] args) throws FileNotFoundException {
        String text = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.";
        Path textfile3 = Path.of("C:\\Users\\ekaterina.ezepchik\\IdeaProjects\\untitled\\src\\textfile3");
        PrintWriter pw = new PrintWriter(textfile3.toString());
        pw.println(text);
        pw.close();
        String str = textfile3.toString();
        boolean abs = Path.of(str).isAbsolute();
        System.out.println(abs);
        System.out.println(textfile3.getFileName());

        Path textfile4 = Path.of("src\\textfile4.txt");
        PrintWriter pw4 = new PrintWriter(textfile4.toString());
        pw4.println(text);
        pw4.close();
        String str4 = textfile4.toString();
        boolean abs4 = Path.of(str4).isAbsolute();
        System.out.println(abs4);
        System.out.println(textfile4.getFileName());
        System.out.println(textfile4.getParent());
        System.out.println(textfile3.getParent());

        try {
           String content = Files.readString(textfile3);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String content = Files.readString(textfile4);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
