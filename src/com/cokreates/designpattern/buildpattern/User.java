package com.cokreates.designpattern.buildpattern;

public class User {
    private final String firstName;
    private final String lastName;
    private int age;


    private User(UserBuilder uBuilder) {
        this.firstName = uBuilder.firstName;
        this.lastName = uBuilder.lastName;
        this.age = uBuilder.age;
    }

    // All getter, and NO setter to provide immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age;
    }

    // UserBuilder class
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public User Build(){
            User user = new User(this);
            // TODO: add some validation
            return user;
        }

    }

}
