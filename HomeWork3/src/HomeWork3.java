import Ex1.Birch;
import Ex1.Pine;
import Ex1.Spruce;
import Ex1.Tree;
import Ex2.*;
import Ex3.Pyramid1;
import Ex3.Pyramid2;
import Ex3.Pyramid3;

public class HomeWork3 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    public static void ex1() {
        //Реализовать в Java следующую схему (в скобках свойства объектов)
        //У нас есть Дерево(возраст)
        //Деревья делятся на:
        //хвойные(имеют тип иголок)
        //лиственные(есть листья на дереве сейчас), умеют опадать (листья пропадают с дерева)
        //умеют цвести (листья появляются)
        //
        //Сосна и Ель являются хвойными.
        //для сосны характерен тип иголок - крупный
        //для ели характерен тип иголок - мелкий
        //
        //Береза является лиственным деревом.
        //Когда Береза цветет, помимо появления листьев, она источает аллергены (печать в консоль)
        //
        //Создать в методе ex1 сосну, березу, ель. Положить в массив.
        //Посчитать их средний возраст.

        Pine pine = new Pine(100,"Крупный");
        Spruce spruce = new Spruce(50, "Мелкий");
        Birch birch = new Birch(20, true);
        Tree[] trees = {pine, spruce, birch};
        int totalAge = 0;
        for (Tree tree : trees) {
            totalAge += tree.age;
        }
        System.out.println(totalAge);
    }

    public static void ex2() {
        //Задача: Фабрика телефонов
        //Создать 2 типа телефонов и комплектующих к ним.
        //При печати телефона должны показываться все свойства телефона и вложенных объектов.
        //1 тип: Samsung galaxy. Имеет операционную систему Android,
        //плату j-108(размер (ширина Х длина Х высота) 10х12х13), камеру Samsung(20x zoom).
        //2 Тип: Iphone 15. Имеет операционную систему Ios, плату 7uik(размер 15х12х13),
        //камеру iphone(15x zoom, есть вспышка).
        //
        //Создать фабрику, которая заполняет созданный телефон деталями
        //При создании телефона в нем нет комплектующих, как будто пустой пластиковый каркас,
        //но при этом модель телефона уже есть.
        //
        //
        //В фабрике должно быть два публичных метода с одним названием:
        //один будет собирать iphone, второй будет собирать samsung.
        //В данном методе создать два телефона, собрать их, распечатать.


        Samsung samsung = new Samsung("Samsung galaxy");
        Iphone iphone = new Iphone("Iphone 15");

        Factory factory = new Factory(samsung,iphone);

        factory.assembly(samsung);
        factory.assembly(iphone);




    }

    public static void ex3() {
        //Задача: Пирамида наследования
        //Создать классы Pyramid1, Pyramid2, Pyramid3.
        //НЕОБХОДИМО НАСЛЕДОВАНИЕ С ИСПОЛЬЗОВАНИЕМ РОДИТЕЛЬСКИХ МЕТОДОВ!
        // Создать метод print, который будет выводить следующий текст:
        // M <- из Pyramid1
        // MM <- из Pyramid2
        // MMM <- из Pyramid3

        //Т.е. при вызове pyramid1.print выведется:
        // M
        // MM
        // MMM

        //при вызове pyramid2.print выведется:
        // MM
        // MMM

        //при вызове pyramid3.print выведется:
        // MMM

        //создать здесь pyramid1 и вызвать print

        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();

    }

}
