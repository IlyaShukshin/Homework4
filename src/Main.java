public class Main {
    public static void main (String [] srgs) {
        System.out.println("Задача №1");
        int age1 = 22, age2 = 16;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия");
        }
        if (age2 < 18){
            System.out.println("Если возраст человека равен " + age2 + ", то он не достиг совершеннолетия");
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", то он совершеннолетний");}

        System.out.println("Задача №2");
        int temp1 = -30;
        if (temp1 < -5) {
            System.out.println("На улице " + temp1 + " градусов, нужно надеть шапку");
        }
        int temp2 = 40;
        if (temp2 > 5) {
            System.out.println("На улице " + temp2 + " градусов, можно идти без шапки");
        }

        System.out.println("Задача №3");
        int speed1 = 90, speed2 = 50;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + " км/ч, то придётся заплатить штраф");
        }
        if (speed2 < 60) {
            System.out.println("Если скорость " + speed2 + " км/ч, то можно ездить спокойно");
        }

        System.out.println("Задача №4");
        int age3 = 5;
        int age4 = 12;
        int age5 = 20;
        int age6 = 30;
        if (age3 > 2 && age3 < 6) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад.");
        } else if (age3 > 7 && age3 < 17) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу.");
        } else if (age3 >= 18 && age3 <=24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет.");
        } else if(age3 > 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить на работу.");
        }
        if (age4 > 2 && age4 < 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад.");
        } else if (age4 > 7 && age4 < 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу.");
        } else if (age4 >= 18 && age4 <=24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет.");
        } else if(age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу.");
        }
        if (age5 > 2 && age5 < 6) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в детский сад.");
        } else if (age5 > 7 && age5< 17) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в школу.");
        } else if (age5 >= 18 && age5 <=24) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в университет.");
        } else if(age5 > 24) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить на работу.");
        }
        if (age6 > 2 && age6 < 6) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в детский сад.");
        } else if (age6 > 7 && age6 < 17) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в школу.");
        } else if (age6 >= 18 && age6 <=24) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в университет.");
        } else if(age6 > 24) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить на работу.");
        }

        System.out.println("Задача №5");
        int kidAge = 12;
        boolean adult = true;
        boolean youCanRide = kidAge > 5 && kidAge < 14 && adult;
        if (kidAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidAge + " , то он не может кататься на аттракционе.");
    } else if (youCanRide) {
            System.out.println("Если возраст ребенка равен " + kidAge + " , то можно кататься на аттракционе в сопровождении взрослого.");
        } else if (kidAge > 14) {
            System.out.println("Если возраст ребенка равен " + kidAge + " , то можно кататься на аттракционе без сопровождения взрослого");}

        System.out.println("Задача №6");
        int vanPlace = 102;
        int seatingPlace = 60;
        int standingPlaces = 42;
        int passengerSeats = 50;
        int passengerStanding = 40;
        if (passengerSeats < 60) {
            System.out.println("Есть сидячие места в вагоне");
    } else {
            System.out.println("сидячих мест нет");}
        if (passengerStanding < 42) {
            System.out.println("Есть стоячие места в вагоне");}
        else {
            System.out.println("Стоячих мест нет");}
        if (passengerStanding > 42 && passengerSeats > 60) {
            System.out.println("Вагон уже полностью забит");}

        System.out.println("Задача №7");
        int one = 50;
        int two = 30;
        int three = 70;
        if (one > two && one > three) {
            System.out.println("Число " + one + " болшьшее");}
        else if (two > one && two > three) {
            System.out.println("Число " + two + " большее");}
        else {
            System.out.println("Число " + three + " большее");}
    }
}