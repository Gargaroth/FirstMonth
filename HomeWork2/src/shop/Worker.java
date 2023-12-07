package shop;

public class Worker {
    String name;
    int age;
    String sex;
    String item;
    String item2;

    public Worker(String name, int age, String sex, String item, String item2) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.item = item;
        this.item2 = item2;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getItem() {
        return item;
    }

    public String getItem2() {
        return item2;
    }

    public void workerCanDo() {
        System.out.println(name + ": Смотрите какая у меня вещь - " + item);
        System.out.println(name + ": Смотрите какая у меня вещь - " + item2);
    }
}

