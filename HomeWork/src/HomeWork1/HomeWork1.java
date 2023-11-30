package HomeWork1;

public class HomeWork1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
   }

    public static void ex1() {
        String name = "    ПЕтРов Олег Иванович      ";
        name = name.trim();
        name = name.toUpperCase();
        /* По ТЗ "ов" и "ова" маленькими буквами, в таком случае всегда будет
        выводится "Неизвестное лицо" */
        if (name.contains("ова")) {
            System.out.println("Уважаемая" +" " + name);
        } else if (name.contains("ов"))  {
            System.out.println("Уважаемый" + " " + name);
        } else {
            System.out.println("Неизвестное лицо" + " " + name);
        }

    }

    public static void ex2() {
        double fuel = 10;
        boolean isEngineWork = true;
        boolean hasErrors = false;
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;
        if ((fuel >= 10 && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4) && isEngineWork) ^ hasErrors) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        //Работа на самостоятельное изучение методов.
        //Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'o' в строке
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        simply = simply.toLowerCase();
        String notSimply = simply.replace("this is", "those are");
        int index = notSimply.indexOf('o', 3);
        System.out.println(index);

    }

    public static void ex4() {
        int sausage = 2000; //продано
        int ham = 8511;
        int neck = 6988;

        int sausagePrice = 800; // стоимость
        int hamPrice =  350;
        int neckPrice = 500;

        int sausageCost; //себестоимость
        int hamCost = 275;
        int neckCost;

        if (sausage < 1000){
           sausageCost = 412;
        } else if (sausage < 2000) {
            sausageCost = 408;
        } else {
            sausageCost = 404;
        }

        if (neck < 500) {
            neckCost = 311;
        } else {
            neckCost = 299;
        }

        int income = (sausage * sausagePrice) + (ham * hamPrice) + (neck * neckPrice);
        int outcome = (sausage * sausageCost) + (ham * hamCost) + (neck * neckCost) + 1000000;
        double profit = income - outcome;

        if (profit > 2000000) {
            profit = profit * 0.13;
        }   else if (profit >= 1000001) {
            profit = profit * 0.1;
        }   else {
            profit = profit * 0.08;
        }
        System.out.println(profit);
    }
}
