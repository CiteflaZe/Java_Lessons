package hometask5.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence  {
    private final List<Word> words;

    public Sentence(List<Word> words) {
        this.words = words;
    }

    public List<Word> getWords() {
        return words == null ? null : new ArrayList<>(words);
    }

    @Override
    public String toString() {
        if (words == null || words.size() == 0){
            return "";
        }else {
            StringBuilder stringBuilder = new StringBuilder();

            for (Word i : words){
                stringBuilder.append(i.toString());
            }

            return stringBuilder.toString();
        }
    }
}