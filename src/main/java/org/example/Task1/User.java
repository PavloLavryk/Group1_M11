package org.example.Task1;

public class User {
    private final int index;
    private final String name;

    public User(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "User{" +
                "index=" + index +
                ", name='" + name + '\'' +
                '}';
    }
}

