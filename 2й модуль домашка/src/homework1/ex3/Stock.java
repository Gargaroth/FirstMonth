package homework1.ex3;
import java.util.ArrayList;

public class Stock {
    private ArrayList<Item> items;

    public Stock(ArrayList<Item> items) {
        this.items = items;
    }

    public void setItems(ArrayList<Item> items) {
            if (items.isEmpty()) {
                this.items = items;
            } else {
                this.items.addAll(items);
            }
        }

    public void getAllItems() {
        for (int i = 0; i < items.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(items.get(i));
            }
        }
    }

    public void removeItem(int indexToDelete) {
        items.remove(indexToDelete);
    }

//    public void removeAllButLast() {
//        while (item.size() > 1){
//            item.remove(0);
//        }
//    }

    public void removeAllButLast() {
        items.subList(0, items.size()-1).clear();
    }

    @Override
    public String toString() {
        return "Stock{" +
                "item=" + items +
                '}';
    }
}
