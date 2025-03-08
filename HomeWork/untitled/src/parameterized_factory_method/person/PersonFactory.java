package parameterized_factory_method.person;

public class PersonFactory {

    public Person create(int age) {
        if (age < 18) return new Child();
        else return new Adult();
    }
}
