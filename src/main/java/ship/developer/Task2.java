package ship.developer;

import ship.developer.entity.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task2 {
    public static List<Person> deleteEveryFifthPerson(List<Person> list){
        //IntStream.range(0, list.size()).filter(i -> i % 8 != 0).mapToObj()
        return list.stream().collect(Collectors.groupingBy(p -> (list.indexOf(p) + 1) % 8 != 0)).get(true);
    }
}
