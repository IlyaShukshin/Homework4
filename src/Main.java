public class Main {
    public static void main (String [] srgs) {
        System.out.println("Задача №1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия");
        }

        System.out.println("Задача №2");
        int temp = -30;
        if (temp < -5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        if (temp > 5) {
            System.out.println("На улице " + temp+ " градусов, можно идти без шапки");
        }

        System.out.println("Задача №3");
        int speed = 90;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

        System.out.println("Задача №4");
        int ageHuman = 30;
        if (ageHuman > 2 && ageHuman < 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад.");
        } else if (ageHuman > 7 && ageHuman < 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу.");
        } else if (ageHuman >= 18 && ageHuman <=24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет.");
        } else if(ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу.");
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
        int standingPlaces = vanPlace - seatingPlace;
        int passengerSeats = 50;
        int passengerStanding = 40;
        if (passengerSeats < 60) {
            System.out.println("Есть сидячие места в вагоне");
    } else {
            System.out.println("сидячих мест нет");}
        if (passengerStanding < standingPlaces) {
            System.out.println("Есть стоячие места в вагоне");}
        else {
            System.out.println("Стоячих мест нет");}
        if (passengerStanding > standingPlaces && passengerSeats > 60) {
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