package hometask5.service;

import hometask5.domain.Text;

public interface TextService {
    Text convertStringToText(String header, String text);
    String convertTextToString(Text text);
    Text addSentenceToText(Text text, String string);
    void showTextInConsole(Text text);
}
