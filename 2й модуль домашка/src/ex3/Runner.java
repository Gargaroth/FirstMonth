package ex3;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Item pen = new Item("Ручка");
        Item pencil = new Item("Карандаш");
        Item lighter = new Item("Зажигалка");
        Item cup = new Item("Чашка");
        Item bottle = new Item("Бутылка");

        ArrayList<Item> items = new ArrayList<>(List.of(pen, pencil, lighter));
        ArrayList<Item> items2 = new ArrayList<>(List.of(cup, bottle));

        Stock stock = new Stock(items);
        stock.setItems(items2);
        System.out.println(stock);
        stock.getAllItems();
        System.out.println("_____________________");
        stock.removeItem(0);
        System.out.println(stock);
        System.out.println("_____________________");
        stock.removeAllButLast();
        System.out.println(stock);
    }
}
