package hometask5.domain;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private final Sentence header;
    private final List<Sentence> sentences;

    public Text(Sentence header, List<Sentence> sentences) {
        this.header = header;
        this.sentences = sentences;
    }

    public Sentence getHeader() {
        return header == null ? null : new Sentence(header.getWords());
    }

    public List<Sentence> getSentences() {
        return sentences == null ? null : new ArrayList<>(sentences);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (sentences != null){
            for (Sentence i : sentences){
                stringBuilder.append(i.toString());
            }
        }

        return header != null ? header.toString() + "\n" + stringBuilder.toString() : stringBuilder.toString();
    }
}
