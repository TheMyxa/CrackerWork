package com.TheMyxa;

import java.util.Scanner;

public class SQLTask {
    // ch
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        System.out.print("Name of student`s group ");
        String nameOfGroup = in.nextLine();


        if (nameOfGroup.isEmpty()) {
            System.out.println("Error, string can not be empty, restart and try again");
            System.exit(0);

        }

        System.out.print("Number of debts:(number not word) ");
        if (in.hasNextInt()) {
            int numberOfDebts = in.nextInt();
            SQL(nameOfGroup, numberOfDebts);
        } else {
            System.out.println("Error, it is not a number, restart and try again");
            System.exit(0);
        }
        //Выше вводим с новых строк номер группы студента а также количество долгов
        // считываем всю введенную строку у группы т.к в ее названии могут быть пробелы


    }

    private static void SQL(String nameOfGroup, int numberOfDebts) {
        System.out.printf("INSERT INTO \n\tT_GroupSelected(id_Student, firstName, lastName, id_Group)\n" +
                "VALUES (SELECT id_Student, firstName, lastName, id_Group \n\t\tFROM T_Student\n\t\t" +
                "WHERE id_Group = '%s' AND dolgCount > %s)", nameOfGroup, numberOfDebts);
    }
}
