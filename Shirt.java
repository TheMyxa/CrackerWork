package com.TheMyxa;

public class Shirt {

    private String id;
    private String description;
    private String color;
    private String size;

    /**
     * строку разбивает на слова, и каждый номер массива записывает в поля
     *
     * @param str в массиве строк все параметры разделяются запятыми
     */

    private Shirt(String str) {
        String[] arr = str.split(",");
        this.id = arr[0].trim();
        this.description = arr[1].trim();
        this.color = arr[2].trim();
        this.size = arr[3].trim();
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirtsObj = new Shirt[shirts.length];
        for (int i = 0; i < shirtsObj.length; i++)
            shirtsObj[i] = new Shirt(shirts[i]);

        for (Shirt shirt : shirtsObj) {
            System.out.println(shirt);
            System.out.println();
        }
    }

    // конструктор
    @Override
    public String toString() {
        return "Shirt {" + "\n\t" +
                "id = " + id + "\n\t" +
                "description = " + description + "\n\t" +
                "color = " + color + "\n\t" +
                "size = " + size + "\n\t" +
                '}';
    }


}
