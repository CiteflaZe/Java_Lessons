package hometask5.service;

import hometask5.domain.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class TextServiceImplTest {
    private final TextServiceImpl textService = new TextServiceImpl();

    @Test
    public void shouldReturnNullStringForNullText() {
        String expectedResult = null;
        String actualResult = textService.convertTextToString(null);
//        assertEquals(expectedResult, actualResult);
        assertNull("", actualResult);
    }

    @Test
    public void shouldReturnStringForText() {
        String expectedResult = "Some Header.";
        List<Symbol> symbols =  asList(new Letter('H'), new Letter('e'), new Letter('l'), new Letter('l'), new Letter('o'));
        Sentence header = new Sentence(asList(new Word(symbols)));
        Text text = new Text(header, null);
        String actualResult = textService.convertTextToString(text);
        assertEquals(expectedResult, actualResult);
    }

}