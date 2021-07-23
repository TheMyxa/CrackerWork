package com.TheMyxa;

public class Phone {

    private String countryCode;
    private String phoneNumber;

    private Phone(){}

    public static void main(String[] args) {
        Phone phoneParser = new Phone();

        phoneParser.phoneFromStr("+79197774421"); // РФ номер в международном формате
        System.out.println(phoneParser);
        phoneParser.phoneFromStr("+104049994467");
        System.out.println(phoneParser);
        phoneParser.phoneFromStr("89997771100"); // РФ номер без международного формата
        System.out.println(phoneParser);
        phoneParser.phoneFromStr("+3100155688675"); // номер: 12 цифр,
        System.out.println(phoneParser);
        phoneParser.phoneFromStr("+1999552211"); // wrong numbers (10 )
        System.out.println(phoneParser);
        phoneParser.phoneFromStr("69175655655"); // wrong phone number:
        System.out.println(phoneParser);
        phoneParser.phoneFromStr("77788909"); // wrong phone number:
        System.out.println(phoneParser);
    }
//*
//* Проверяем методом startsWith, что строка начинается с необходимого символа и удовлетворяет длине 12-15 символов
//*  если РФ номер то заменяем 8 на 7
    private void phoneFromStr(String phone){
        countryCode = null;
        phoneNumber = null;
        if(phone.startsWith("+") && phone.length() >= 12 && phone.length() <= 15){
            countryCode = phone.substring(1, phone.length()-10);
            phoneNumber = phone.substring(phone.length()-10);
        }else if(phone.startsWith("8") && phone.length() == 11){
            countryCode = "7";
            phoneNumber = phone.substring(1);
        }
    }


    /**
     *
     * Проводится проверка условия , если все впорядке методом substring добавляем заданным интервалом
     *
     */
    public String toString() {
        if(countryCode == null || phoneNumber == null)
            return "wrong number";
        String phone = "+" + countryCode;
        phone += "(" + phoneNumber.substring(0, 3) + ")";
        phone +=  "-" + phoneNumber.substring(3, 6);
        phone +=  "-" + phoneNumber.substring(6, 10);
        return phone;
    }

}
