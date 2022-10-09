package com.example.myapplication;

public class Cars  {
    public static void main(String[] args) {
        Carss carss = new Carss(new Cardrive());
        carss.drive();
    }
}
interface Iwheelturn {
    void spinthewheels();
}

class Cardrive implements Iwheelturn{

    @Override
    public void spinthewheels() {
        System.out.println("The wheels are spinning");
    }
}
class Carss{
    Iwheelturn wheelturn;
    Carss(Iwheelturn action){
        this.wheelturn = action;
    }
    public void drive(){
        wheelturn.spinthewheels();

    }

}

