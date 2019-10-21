package lesson12.example1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<A> items = new TreeSet<>();
        A a = new A(1);
        A a1 = new A(100);
        items.add(a);
        System.out.println(items.size());
//        items.add(a1);
//        System.out.println(items.size());

        boolean isContained = items.contains(a1);
        a.setCode(100);
        System.out.println(isContained);

        Comparator<A> comparator = (o1, o2) -> -o1.getCode() + o2.getCode();
        TreeSet<A> as = new TreeSet<>(comparator);
        as.add(a);

        TreeSet<B> bs = new TreeSet<>((b1,b2) -> b1.getCode() - b2.getCode());
        Comparator<B> comparatorB = new Comparator<B>() {
            @Override
            public int compare(B o1, B o2) {
                if(o1 == null || o2 == null){
                    return 1;
                }
                return o1.getCode() - o2.getCode();
            }
        };
        TreeSet<B> bs1 = new TreeSet<>(comparatorB);
        bs1.add(null);

        bs.add(new B(1));

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Hello");



    }

    public static Map<Character, Integer> method(String sentence){
        if(sentence == null){
            throw new NullPointerException("Sentence is null");
        }
        Map<Character, Integer> characterToCount = new HashMap<>();

        char[] characters = sentence.toCharArray();

        for (char c :
                characters) {
            if (characterToCount.containsKey(c)) {
                Integer counter = characterToCount.get(c);
                characterToCount.put(c, ++counter);
            }
            else{
                characterToCount.put(c, 1);
            }
        }
        return characterToCount;

    }

    public static Map<Character, Integer> methodMerge(String sentence){
        if(sentence == null){
            throw new NullPointerException("Sentence is null");
        }
        Map<Character, Integer> characterToCount = new HashMap<>();

        char[] characters = sentence.toCharArray();

        for (char c :
                characters) {
            characterToCount.merge(c, 1, (oldCounter, counter) -> ++oldCounter);
        }
        return characterToCount;
    }

}
