package com.example.myapplication;

public class Seasons   {
    enum Season  {
        Winter(-10),
        Spring(15),
        Summer(30){
            @Override
            public String getDescription(){
                return "Warm season ";
            }
        },
        Autumn(8);

         private final int temperature;
        Season(int temperature){
            this.temperature = temperature;
        }
        public int getTemperature(){
            return temperature;
        }
       public String getDescription (){
            return "Cold winter";
        }

    }

   public static byte wintertemperature = -10 ;
    public static int springrtemperature =  15;
    public static int summertemperature =  30;
    public static int autumtemperature =  8;
   public static String myloveSeasons = "Summer This is a great time for sunny and warm days, trips to the sea with the whole family or a friendly company, warm evenings, walks in the park.";
    public static void main(String[] args) {

        Season season = Season.Winter;
        System.out.println("Average temperature " +season.getTemperature());
        Season season1 = Season.Spring;
        System.out.println("Average temperature " +season1.getTemperature());
        Season season2 = Season.Summer;
        System.out.println("Average temperature " +season2.getTemperature());
        Season season3 = Season.Autumn;
        System.out.println("Average temperature " +season3.getTemperature());
        System.out.println(season2.getDescription());


         for(Season seasons : Season.values())  {
            System.out.println( "Season:" +  Season.Winter +"" +wintertemperature+ " " + Season.Spring + springrtemperature +" " +Season.Summer + summertemperature + " " +Season.Autumn + autumtemperature   );

        }

        System.out.println( myloveSeasons);

        Season myseason = Season.Summer;

        switch (myseason){
            case Winter:
                System.out.println("I like winter" );
                break;
            case Spring:
                System.out.println("I like spring");
                break;
            case Summer:
                System.out.println("I like summer");
                break;
            case Autumn:
                System.out.println("I like autumn");
        }












    }
}
