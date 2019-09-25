package hometask5.service;

import hometask5.domain.Text;

public interface TextService {
    Text convertStringToText(String text);

    String convertTextToString(Text text);
}
