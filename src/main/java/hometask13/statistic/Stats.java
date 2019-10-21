package hometask13.statistic;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Stats {

    public Map<Character, Integer> fileToCharList(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new IllegalArgumentException("File not found");
        }
        Map<Character, Integer> map = new HashMap<>();
        try (Reader r = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), StandardCharsets.UTF_8));) {
            int input;
            while ((input = r.read()) != -1) {
                int frequency = map.getOrDefault((char) input, 0);
                //map.merge((char) input, frequency + 1);
            }
        } catch (IOException e) {
           // e.printStackTrace();
        }
        return map;
    }
}
