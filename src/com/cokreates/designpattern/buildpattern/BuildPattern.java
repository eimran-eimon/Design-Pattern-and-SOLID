package com.cokreates.designpattern.buildpattern;
import org.junit.*;


public class BuildPattern {
    public static void main(String args[]){
        User user1 = new User.UserBuilder("Md", "Eimon")
                .age(30)
                .Build();

        System.out.println("User created: " + user1);

        // age is optional attribute
        User user2 = new User.UserBuilder("Md", "Eimran")
                .Build();

        System.out.println("User created: " + user2);
    }

}
