package constructorsandmodifiers.level1;

public class Person {
    private String company;
    private int salary;

    Person(Person otherPerson)
    {
        this.company=otherPerson.company;
        this.salary=otherPerson.salary;
    }

}
