public class Main {
    public static void main(String[] args) {

        //Задача 1
        byte age=21;
        if (age>=18){
            System.out.println("С совершеннолетием!");
        }
        if (age<18){
            System.out.println("Совершеннолетие еще не наступило");
        };

        //Задача 2
        if (age>=7 && age<18){
            System.out.println("Ребенок ходит в школу, если его возраст равен или больше 7 годам");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет, " +
                    "если его возраст 18 и больше");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу," +
                    " если ему 24 и больше лет.");
        }



        //задание 3

        byte people =70;//Текущее число пассажиров в вагоне
        if (people<=60) {
            System.out.println(
                    "Есть сидячие места");
        }
        if (people > 60 && people<=102){
            System.out.println(
                    "Есть только стоячие места");
        };
        if (people>102) {
            System.out.println("Мест нет: нарушение требований к вместимости вагона");
        }

        //Домашнее задание 2
        //Задание 1
        if (age>=18){
            System.out.println("С совершеннолетием!");
        } else {
            System.out.println("Совершеннолетие еще не наступило и нужно подождать");
        };

        //Задание 2
        if (age>=7 && age<18){
            System.out.println("Ребенок ходит в школу, если его возраст равен или больше 7 годам");
        } else {
            if (age >= 18 && age < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет, " +
                        "если его возраст 18 и больше");
            } else {
                if (age >= 24) {
                    System.out.println("Человек окончил университет и ему пора искать первую работу," +
                            " если ему 24 и больше лет.");
                } else {
                    System.out.println("Ребенок идет в ясли");
                }
            }
        }
        //Задание 3
        if (people<=60) {
            System.out.println(
                    "Есть сидячие места");
        } else {
            if (people > 60 && people <= 102) {
                System.out.println(
                        "Есть только стоячие места");
            } else {
                System.out.println("Мест нет: нарушение требований к вместимости вагона");
            }
        }

        //Домашнее задание 3
        //Задача 1
        boolean elementary = age>=2 && age <7;
        boolean school = age>=7 && age <=18;
        boolean uni = age>18 && age <=24;


        if (elementary) {
            System.out.println("Если возраст человека равен "+ age + ", то ему нужно ходить в детский сад");
        } else {
            if (school) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else {
                if (uni) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в универ");
                } else {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
                }
            }
        }

        // Задача 2


        boolean notApprove = age<5;
        boolean appParent = age>=5 && age <14;


        if (notApprove) {
            System.out.println("Кататься нельзя");
        } else {
            if (appParent) {
                System.out.println("Только в сопровождении родителя");
            } else {
                System.out.println("Вход разрешен без сопровождения родителя");
            }
        }

        //Задача 3

        int one=1;
        int two=40;
        int free=3;

        int max=one;
        if (max<two){
            max=two;
        } else {
            if (max<free){
                max=free;
            }
        }

        System.out.println("Самое большое число " + max);





    }
}
