package shop;

public class Runner {
    public static void main(String[] args) {
        Item thing1 = new Item(1000, "Hammer");
        Item thing2 = new Item(50, "Screwdriver");
        Item thing3 = new Item(30, "Notebook");
        Item thing4 = new Item(10, "Pen");

        Worker worker1 = new Worker("Василий", 30, "М", thing1.name, thing2.name);
        Worker worker2 = new Worker("Марьяна", 25, "Ж", thing3.name, thing4.name);

        Shop shop = new Shop(new Worker[]{worker1, worker2});
        worker1.workerCanDo();
        worker2.workerCanDo();

        //всю голову сломал, не знаю как дальше, буду смотреть разбор в воскресенье)

    }

}



