package lesson14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;
import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
//        final List<String> strings = asList("one", "two", "three", "four", "one", null);
//
//        final long count = strings.stream()
//                .filter(x -> "one".equals(x))
//                .count();
//        System.out.println(count);
//
//        strings.stream()
//                .map(x -> x + "____")
//                .forEach(System.out::println);
//
//        List<Client> clients = asList(new Client("one", asList(new Item(1), new Item(2))),
//                new Client("two", asList(new Item(3), new Item(4), new Item(5))),
//                new Client("two", asList(new Item(6))),
//                new Client("two", null),
//                null
//        );
//
//        List<Item> items = clients.stream()
//                .filter(Objects::nonNull)
//                .filter(x -> Objects.nonNull(x.getItems()))
//                .flatMap(x -> x.getItems().stream())
//                .collect(toList());
//
//        items.forEach(System.out::println);
//
//        List<Item> items1 = clients.stream()
//                .flatMap(x -> Optional.ofNullable(x)
//                        .map(Client::getItems)
//                        .map(Collection::stream)
//                        .orElse(Stream.empty()))
//                .collect(toList());

        List<Client> clients1 = asList(new Client("one", asList(new Item(1), new Item(2)), Role.ADMIN),
                new Client("11", asList(new Item(1), new Item(2)), Role.ADMIN),
                new Client("22", asList(new Item(1), new Item(2)), Role.USER),
                new Client("two", asList(new Item(3), new Item(4), new Item(5)), null),
                new Client("third", asList(new Item(6)), Role.USER)
        );

        Map<Role, List<String>> roleToUser;

        roleToUser = clients1.stream()
                .collect(Collectors.groupingBy(Client::getRole, Collectors.mapping(Client::getName, Collectors.toList())));

        System.out.println(roleToUser);


    }
}
