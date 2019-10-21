package hometask13.statistic;

import java.io.File;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Stats stats = new Stats();

        Map<Character, Integer> stat = stats.fileToCharList("E:\\Epam_Java\\epam-project-test\\src\\main\\java\\hometask13\\statistic\\text.txt");

        stat.forEach((k, v) -> System.out.println(k + " appears: " + v + " times"));


    }
}
