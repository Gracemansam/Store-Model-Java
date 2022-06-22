package Model;

public abstract class Person {
    private String name;

    private String identity;

    public Person(String name, String identity) {
        this.name = name;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public String getIdentity() {
        return identity;
    }
}
