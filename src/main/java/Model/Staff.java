package Model;

public abstract class Staff {

    private String name;

    private String identity;

    public Staff(String name, String identity) {
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
