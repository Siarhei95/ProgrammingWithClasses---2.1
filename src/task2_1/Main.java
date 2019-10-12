package task2_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Text text = new Text();
        String str = "1234";
        String str2 = "dgf";
        String str3 = "Hello";
        String str4 = "Boom";
        String str5 = "Go";
        String str6 = "Joom";
        String title = "Hi";
        Word word = new Word(str);
        Word word1 = new Word(str2);
        Word word2 = new Word(str3);
        Word word3 = new Word(str4);
        Word word4 = new Word(str5);
        Word word5 = new Word(str6);
        Word word0 = new Word(title);
        Sentence sentence = new Sentence();
        Sentence sentence1 = new Sentence();
        sentence.add(word);
        sentence.add(word1);
        sentence.add(word2);
        sentence1.add(word3);
        sentence1.add(word4);
        sentence1.add(word5);
        text.addSentence(sentence);
        text.addSentence(sentence1);
        text.setTitle(word0);

        Printer printer = new Printer();
        printer.print(text);
    }
}
