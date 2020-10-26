import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args){

        List<Developer> developers = Arrays.asList(
                new Developer("se","Hassan",909020),
                new Developer("sw","Ahmed",99090222),
                new Developer("se","Mohamed",99922200),
                new Developer("sw","Yehia",939301110),
                new Developer("se","Eslam",390001111)
        );

        Map<String,Set<Developer>> group5 = developers.stream().collect(
                Collectors.groupingBy(Developer::getTitle,Collectors.toSet()));

        printAll(group5);

    }

    private static void printAll(Map<String,Set<Developer>> dev){

        dev.forEach((title,list) -> {
            System.out.println("Title "+title+ " Count " +list.stream().count());
            System.out.println("Developers info " + list);
        });
    }

}
