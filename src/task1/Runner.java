package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//вернуть список User у которых хотя бы одна группа начинается с H

public class Runner {
    public static void main(String[] args) {

    List<User> users= new ArrayList<User>();
//        users.stream().collect(Collectors.groupingBy(User::getGroups))
//            .collect(Collectors.groupingBy(Group::getName))
//            .filter(name -> name.startWith("H"))
//            .forEach(System.out::println);

        users.stream()
                .collect(Collectors.groupingBy(User::getGroups))
                .collect(Collectors.filtering(Group.class.getName())).
}
