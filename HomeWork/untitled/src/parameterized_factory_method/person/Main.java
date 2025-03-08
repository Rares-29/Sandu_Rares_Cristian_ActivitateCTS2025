package parameterized_factory_method.person;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        Person p1 = personFactory.create(18);
        Person p2 = personFactory.create(20);
        Person p3 = personFactory.create(15);
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        for (Person p: personList) {
            System.out.println(p.getDescription());
        }
    }
}
