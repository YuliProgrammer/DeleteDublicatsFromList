package com.dolnikova;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Alex"));
        userList.add(new User(2, "Yuli"));
        userList.add(new User(1, "Alex"));
        userList.add(new User(3, "Olga"));
        userList.add(new User(3, "Max"));

        System.out.println(userList);

        List<User> listWithoutDuplicates = new ArrayList<>(new HashSet<>(userList));
        System.out.println(listWithoutDuplicates);

    }
}
