package ship.developer.entity;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(age < o.age)
            return 1;
        else if(age > o.age)
            return -1;
        else
            return name.compareTo(o.name);
    }
}
