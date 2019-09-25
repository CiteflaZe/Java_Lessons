package hometask5.service;

import hometask5.domain.Text;

import java.util.Objects;

import static java.util.Objects.isNull;

public class TextServiceImpl implements TextService {
    @Override
    public Text convertStringToText(String text) {
        throw new UnsupportedOperationException("Too lazy to implement now");
    }

    @Override
    public String convertTextToString(Text text) {
        return isNull(text) ? null : text.toString();
    }
}
