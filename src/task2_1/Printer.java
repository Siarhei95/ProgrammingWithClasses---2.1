package task2_1;

import java.util.List;

public class Printer {

    public void print(Text text){
        Word t = text.getTitle();
        String s = t.getWord();
        System.out.println(s);

        List<Sentence> h = text.getSentences();
        for(int i=0; i<h.size(); i++){
            Sentence d = h.get(i);
            printSentence(d);
        }
    }

    public void printSentence(Sentence sentence) {
        List<Word> words = sentence.getWords();
        for (int i = 0; i < words.size(); i++) {
            Word w = words.get(i);
            String str = w.getWord();
            System.out.println(str);
        }
    }
}
