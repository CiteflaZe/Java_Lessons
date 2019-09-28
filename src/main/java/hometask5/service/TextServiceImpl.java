package hometask5.service;

import hometask5.domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TextServiceImpl implements TextService{

    @Override
    public Text convertStringToText(String header, String text) {

        if (header == null && text == null){
            return new Text(null, null);
        }

        List<Symbol> symbols = new ArrayList<>();
        List<Word> words = new ArrayList<>();
        List<Sentence> sentences = null;
        Sentence headerSentence = null;

        if (text != null){
            char[] textArr = text.toCharArray();
            sentences = new ArrayList<>();

            for (int i = 0; i < textArr.length; i++) {
                symbols.add(new Letter(textArr[i]));
                if (i+1 == textArr.length){
                    words.add(new Word(new ArrayList<>(symbols)));
                    sentences.add(new Sentence(new ArrayList<>(words)));
                }
                if (textArr[i] == ' ' ||textArr[i] == '.'){
                    words.add(new Word(new ArrayList<>(symbols)));
                    symbols.clear();
                }
                if (textArr[i] == '.' || textArr[i] == '?' || textArr[i] == '!'){
                    sentences.add(new Sentence(new ArrayList<>(words)));
                    words.clear();
                }
            }
        }

        if (header != null){
            symbols.clear();
            words.clear();
            char[] headerArr = header.toCharArray();

            for (int i = 0; i < headerArr.length; i++) {
                symbols.add(new Letter(headerArr[i]));
                if (i+1 == headerArr.length){
                    words.add(new Word(new ArrayList<>(symbols)));
                    headerSentence = new Sentence(new ArrayList<>(words));
                }
                if (headerArr[i] == ' ' ||headerArr[i] == '.'){
                    words.add(new Word(new ArrayList<>(symbols)));
                    symbols.clear();
                }
                if (headerArr[i] == '.' || headerArr[i] == '?' || headerArr[i] == '!'){
                    words.add(new Word(new ArrayList<>(symbols)));
                }
            }
        }

        return new Text(headerSentence, sentences);
    }

    @Override
    public String convertTextToString(Text text) {
        return Objects.isNull(text) ? null : text.toString();
    }

    @Override
    public Text addSentenceToText(Text text, String string) {
        if (text == null || string == null){
            throw new IllegalArgumentException("Some of parameters are null");
        }
        StringBuilder stringBuilder = new StringBuilder();

        if (text.getSentences() != null){
            for (Sentence i : text.getSentences()){
                stringBuilder.append(i);
            }
        }

        stringBuilder.append(" ");
        stringBuilder.append(string);
        return convertStringToText(text.getHeader().toString(), stringBuilder.toString());
    }

    @Override
    public void showTextInConsole(Text text) {
        if (text == null){
            throw new IllegalArgumentException("Text is null");
        }
        System.out.println(convertTextToString(text));
    }
}
