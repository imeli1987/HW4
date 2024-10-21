public class Main {
    public static void main(String[] args) {
//        Задача 1
        System.out.println("Задача 1");

        int age = 18;
        if (age >= 18){
            System.out.printf("Если возраст человека равен %d, то он совершеннолетний", age);
        } else {
            System.out.printf("Если возраст человека равен %d, то он не достиг совершеннолетия, нужно немного подождать", age);
        }

//        Задача 2
        System.out.println();
        System.out.println("Задача 2");

        int temperature = 10;
        if (temperature <= 5){
            System.out.printf("На улице %d градусов, нужно надеть шапку", temperature);
        } else {
            System.out.printf("На улице %d градусов, можно идти без шапки", temperature);
        }

//        Задача 3
        System.out.println();
        System.out.println("Задача 3");

        int speed = 60;
        if (speed >= 60){
            System.out.printf("Если скорость %d, то придется заплатить штраф", speed);
        } else {
            System.out.printf("Если скорость %d, можно ездить спокойно", speed);
        }

//        Задача 4
        System.out.println();
        System.out.println("Задача 4");

        int ageMan = 194;
        if (2 <= ageMan && ageMan <= 6){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад", ageMan);
        } else if (7 <= ageMan && ageMan <= 17){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу", ageMan);
        } else if (18 <= ageMan && ageMan <= 24){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет", ageMan);
        } else if (24 <= ageMan){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу", ageMan);
        }

//        Задача 5
        System.out.println();
        System.out.println("Задача 5");

        int ageChildren = 15;
        if (ageChildren < 5){
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе", ageChildren);
        } else if (5 <= ageChildren && ageChildren < 14){
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе в сопровождении взрослого", ageChildren);
        } else if (14 <= ageChildren){
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе без сопровождения взрослого", ageChildren);
        }

//        Задача 6
        System.out.println();
        System.out.println("Задача 6");

        int trainCarriageCapacity = 102;
        int sittingPlace = 60;
        int countPassengers = 103;
        if (countPassengers > sittingPlace && countPassengers <= trainCarriageCapacity){
            System.out.printf("Остались %d стоячие места", countPassengers-sittingPlace);
        } else if (countPassengers > trainCarriageCapacity) {
            System.out.println("Мест в вагоне нет");
        } else {
            System.out.printf("Есть еще %d сидячих мест", sittingPlace-countPassengers);
        }

//        Задача 7
        System.out.println();
        System.out.println("Задача 7");

        int one = 2;
        int two = 3;
        int three = 1;
        if (one > two && one > three){
            System.out.println("Первое число больше");
        } else if (two > one && two > three){
            System.out.println("Второе число больше");
        } else {
            System.out.println("Третье число больше");
        }
    }
}