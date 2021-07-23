package com.TheMyxa;

public class Person {

    private String patronic;
    private String lastname;
    private String name;


    public static void main(String[] args) {

        Person person1 = new Person("Sergey", "Shishkin", "Sergeevich");
        Person person2 = new Person("Sergey", "Shamshin", "Igorevich");
        Person person3 = new Person("Sergey", "Krasnadarov", "Sergeevich");
        Person person11 = new Person("Sergey", "Zikkuratovich", "");
        Person person22 = new Person("", "Shahmumomedov", "");
        Person person33 = new Person("", "Khabarov", "Alexeevich");

        System.out.println(person1.getAdd());
        System.out.println(person2.getAdd());
        System.out.println(person3.getAdd());
        System.out.println(person11.getAdd());
        System.out.println(person22.getAdd());
        System.out.println(person33.getAdd());

    }

    private Person(String name, String lastname, String patronic) {
        this.patronic = patronic;
        this.lastname = lastname;
        this.name = name;

    }

    private String getAdd() {

        if (lastname == null || lastname.equals(""))
            return "no lastname";

        String res = lastname;
        if (name == null || name.equals("")) {
            return res;
        }
        res += " " + name.substring(0, 1).toUpperCase() + ".";

        if (patronic == null || patronic.equals(""))
            return res;
        res += patronic.substring(0, 1).toUpperCase() + ".";
        return res;
    }

}
