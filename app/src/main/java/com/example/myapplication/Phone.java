package com.example.myapplication;

public class Phone {
    public static void main(String[] args) {
        Phone1 phone = new Phone1(+375222552,"Aplle",500);
        Phone1 phone1 = new Phone1(+332525553,"Samsung");
        Phone1 phone2 = new Phone1();
        phone.receiveCall();
        phone.getNumber();
        phone1.getNumber();
        phone2.getNumber();
        phone.sendMessage();
        phone1.sendMessage();
        phone2.sendMessage();
    }
}
class Phone1 {
    int number;
    String model;
    int weight;
    public Phone1(int number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone1(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone1() {
    }

    public void receiveCall() {
        String name1 ="Tolya";
        String name2 ="Oleg";
        String name3 = "Sasha";
        System.out.println("Звонит " + name3 +" +"  + number  );
        System.out.println("Звонит " + name1 +" +" +number  );
        System.out.println("Звонит " + name2 +"\n" );

    }


    void getNumber(){
        System.out.println(number+"\n");


    }
    void sendMessage(){
        System.out.println("Отправлено сообщение " + number);


    }

}





