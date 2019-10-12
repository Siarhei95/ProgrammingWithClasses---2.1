package task2_1;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> sentence = new ArrayList<>();

    public void add(Word word) {
        sentence.add(word);
    }

    public List<Word> getWords() {
        return sentence;
    }
}
