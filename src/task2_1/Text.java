package task2_1;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private Word title;
    private List<Sentence> sentences = new ArrayList<>();

    public void setTitle(Word title){
        this.title = title;
    }
    public Word getTitle(){
        return title;
    }

    public void addSentence(Sentence sentence){
        sentences.add(sentence);
    }
    public List<Sentence> getSentences(){
        return sentences;
    }
}
