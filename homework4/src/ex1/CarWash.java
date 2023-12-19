package ex1;

public class CarWash {
    protected int prise;
    protected String category;

    public String canCarWash(Machine machine) {
        if (machine.length > 6 || machine.height > 2.5 || machine.width > 2) {
            category = "Крупное авто";
            prise = 4000;
        } else {
            category = "Маломерная";
            prise = 2000;
        }
        return ("Цена помывки одной машины: " + prise);
    }

    public String canCarWash(Machine... machine) {
        int totalPrice = 0;
        for (int i = 0; i < machine.length; i++) {
            canCarWash(machine[i]);
            totalPrice += prise;
        }
        return ("Цена помывки всех машин: " + totalPrice);
    }

}

