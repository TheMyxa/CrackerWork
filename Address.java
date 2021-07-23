package com.TheMyxa;

import java.util.StringTokenizer;

public class Address {

    public static void main(String[] args) {
        Address address = new Address();

        String adr1 = "РФ , Московская обл., г. Балашиха, ул. Ленина, 66, 42к2, 420";
        String adr2 = "РФ, Москва, Москва, Красная площадь, 11, , 2";
        String adr3 = "США, Кейвест ,  Флорида ,  СтокАйленд  ,  11, 12, 111";

        String adr12 = "РФ, Самарская область; Самара. 40 лет Победы, 24; 2к1 - 123";
        String adr22 = "РФ - Москва; Москва, Красная площадь. 1. - 1";
        String adr32 = "США- Кейвест. Флорида , СтокАйленд; 11; 10. 420";

        System.out.println("##### 1 PART ##### \n\t");
        address.fromStrSplit(adr1);
        System.out.println(address);
        System.out.println();
        address.fromStrSplit(adr2);
        System.out.println(address);
        System.out.println();
        address.fromStrSplit(adr3);
        System.out.println(address);
        System.out.println();

        System.out.println("##### 2 PART ##### \n\t");

        address.fromStrToken(adr12);
        System.out.println(address);
        System.out.println();
        address.fromStrToken(adr22);
        System.out.println(address);
        System.out.println();
        address.fromStrToken(adr32);
        System.out.println(address);
    }


    private String country;
    private String region;
    private String city;
    private String street;
    private int house;
    private String corpus;
    private int flat;


    // Используем метод разделителя через split() только запятую
    private void fromStrSplit(String str) {
        String[] arr = str.split(",");
        this.country = arr[0].trim();
        this.region = arr[1].trim();
        this.city = arr[2].trim();
        this.street = arr[3].trim();
        this.house = Integer.parseInt(arr[4].trim());
        this.corpus = arr[5].trim();
        this.flat = Integer.parseInt(arr[6].trim());
    }

    // используем класс StringTokenizer для использования любого символа для разделителя
    private void fromStrToken(String str) {
        StringTokenizer tok = new StringTokenizer(str, ",.;-");
        this.country = tok.nextToken().trim();
        this.region = tok.nextToken().trim();
        this.city = tok.nextToken().trim();
        this.street = tok.nextToken().trim();
        this.house = Integer.parseInt(tok.nextToken().trim());
        this.corpus = tok.nextToken().trim();
        this.flat = Integer.parseInt(tok.nextToken().trim());
    }


    public String toString() {
        return "Address { " +
                "country ='" + country + '\'' +
                ", region ='" + region + '\'' +
                ", city ='" + city + '\'' +
                ", street ='" + street + '\'' +
                ", house =" + house +
                ", corpus ='" + corpus + '\'' +
                ", flat =" + flat +
                '}';
    }


}
