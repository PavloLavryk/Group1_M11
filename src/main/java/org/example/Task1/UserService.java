package org.example.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class UserService {
    public List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
        users.add(new User(1, "Pavlo"));
        users.add(new User(2, "Igor"));
        users.add(new User(3, "Ivan"));
        users.add(new User(4, "Stepan"));
        users.add(new User(5, "Sania"));
        users.add(new User(6, "Bodia"));
    }



    public void printingLogic(){
        IntStream.range(0, users.size())
                .filter(i -> i % 2 !=0)
                .forEach(i -> System.out.print(i + ". " + users.get(i).getName() + ", "));
    }
}
