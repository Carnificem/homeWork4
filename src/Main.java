public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("Задание 1");
        byte age = 14;
        if(age<18){
            System.out.println("Если возраст человека равен " + age +
                    " лет,он не достиг совершеннолетия нужно немного подождать.");}
        else {
            System.out.println("Если возраст человека " + age + " то он совершеннолетний.");}
        //задание 2
        System.out.println("Задание 2");
        byte airTemperature = 8;
        if (airTemperature < 5){
            System.out.println("На улице " + airTemperature + " градусов,нужно надеть шапку.");}
        else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки.");}
        //задание 3
        System.out.println("Задание 3");
        int speed = 300;
        if (speed <= 60){
            System.out.println("Если скорость " + speed + " км\\ч  можно ездить спокойно.");}
        else {
            System.out.println("Если скорость " + speed + " км\\ч,то придется заплатить штраф.");}
        //задание 4
        System.out.println("Задание 4");
        int personAge = 6;
        if (personAge>=2 && personAge<=6){
            System.out.println("Если возраст человека равен " + personAge + " ,то ему нужно ходить в детский сад");}
        else if (personAge>=7 && personAge <= 17){
            System.out.println("Если возраст человека равен " + personAge + " ,то ему нужно ходить в школу");}
        else if (personAge >= 18 && personAge <= 24){
            System.out.println("Если возраст человека равен " + personAge + " ,то ему нужно ходить в университет");}
        else if (personAge>24){
            System.out.println("Если возраст человека равен "+ personAge + " ,то ему пора ходить на работу.");}
        else {
            System.out.println("Если возраст человек равен " + personAge +" то ему нет места в этой задаче.");}
        //задача 5
        System.out.println("Задание 5");
        int kiddAge = 17;
        if (kiddAge<=5){
            System.out.println("Если возраст ребенка равен "+ kiddAge + " ,то ему нельзя кататься на аттракционе");}
        else if ( kiddAge>5 && kiddAge<14){
            System.out.println("Если возраст ребенка равен "+ kiddAge+ " ,то ему можно кататься на аттракционе в сопровождении взрослого");}
        else {
            System.out.println("Если возраст ребенка равен " + kiddAge + " ,то ему можно кататься на аттракцилоне без сопровождения взрослого");}
        //задача 6
        System.out.println("Задание 6");
        int railwayCarriage = 1;
        int maxRailwayCarriage = 102;
        int seats = 60;
        int standing = maxRailwayCarriage - seats;
        if (railwayCarriage<=60){
            System.out.println("в вагоне есть сидячее место");}
        else if (railwayCarriage>60 && railwayCarriage<=102){
            System.out.println("В вагоне есть стоячее место");}
        else {
            System.out.println("В вагоне отсутствует место");}
        //задание 7
        System.out.println("Задание 7");
        int one = 123;
        int two = 456;
        int three = 789;
        if (one > two && one > three){
            System.out.println("наибольшее число: " + one);}
        else if (two>three){
            System.out.println("Наибольшее число: " + two);}
        else{
            System.out.println("Наибольшее число : " + three);}

    }
}
