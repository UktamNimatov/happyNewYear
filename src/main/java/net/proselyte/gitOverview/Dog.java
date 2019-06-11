package net.proselyte.gitOverview;

public class Dog {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public int getId() {
        return id;
    }

    public Dog setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
