import java.util.Arrays;
import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        //Дан массив с массивом чисел внутри
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 2, 3, 4, 5, 6, 7, 8, 9, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 93, 10};
        arrayOfNumbers[2] = new int[]{1, 2, 31, 4, 5, 6, 7, 81, 9, 10};
        arrayOfNumbers[3] = new int[]{1, 2, 3, 45, 5, 6, 77, 8, 9, 10};
        arrayOfNumbers[4] = new int[]{1, 2, 3, 4, 57, 67, 7, 8, 9, 10};
        arrayOfNumbers[5] = new int[]{1, 2, 3, 4, 533, 68, 7, 8, 9, 10};
        arrayOfNumbers[6] = new int[]{1, 2, 3, 40, 5, 6, 72, 8, 9, 10};
        arrayOfNumbers[7] = new int[]{1, 2, 30, 4, 5, 6, 7, 83, 9, 10};
        arrayOfNumbers[8] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 901, 10};
        arrayOfNumbers[9] = new int[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 101};

        //Посчитать сумму каждой диагонали используя цикл(ы)
        //Вывесим на экран

        //С левого верхнего угла к нижнему правому
        int leftUpToRightDownSum = 0;
        //С левого нижнего угла к верхнему правому
        int leftDownToRightUpSum = 0;


        for (int i = 0; i < arrayOfNumbers.length; i++) {
            leftDownToRightUpSum += arrayOfNumbers[i][i];
        }
        for (int j = 0; j < arrayOfNumbers.length; j++) {
            leftUpToRightDownSum += arrayOfNumbers[j][arrayOfNumbers.length-1-j];
        }
        System.out.println(leftDownToRightUpSum);
        System.out.println(leftUpToRightDownSum);

    }

    public static void ex2() {
        //Перевернуть массив(без сторонних классов), не создавая новый массив. Вывести на экран.
        //"перевернуть" - значит последние элементы становятся первыми и наоборот.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length/2; i++) {
            int reverse = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = reverse;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void ex3() {
        //Дан распределитель случайных чисел
        Random random = new Random(1);
        //Получение случайного числа
        int number = random.nextInt(1000);
        int count = 0;
        do {
            count++;
            number++;
        }
        while (number != 999); {
        }
        System.out.println(count);

        //Написать код, генерирующий случайные числа до тех пор, пока не сгенерируется 999.
        //Вывести номер попытки, с которой получилось получить случайным образом число 999.

    }

    public static void ex4() {
        //Создать пакет shop. Внутри пакета:
        //Создать класс Item (вещь). У вещи есть вес и наименование.
        //Создать класс Worker (работник). У работника есть: имя, возраст, пол(М/Ж), набор вещей.
        //Работник умеет хвастаться своими вещами: брать по очереди вещь, и кричать:
        //{Имя работника}: смотрите какая у меня вещь - {имя вещи}.
        //Создать класс Shop (магазин). У которого есть работники.
        //Магазин умеет печатать своих работников:
        //{Имя работника}: {возраст} лет, {мужчина или женщина}, список вещей: {набор вещей работника}
        //Создать класс Runner. В классе Runner:
        //Создать 4 вещи: молот (1000гр), отвертка(50гр), тетрадь(30гр), ручка(10гр)
        //Создать 2 работников:
        //-Василий,30 лет, мужчина, обладатель молота и отвертки.
        //-Марьяна,25 лет, женщина, обладательница тетради и ручки.
        //Создать магазин с работниками выше.
        //Вызвать у магазина печать.
        //Вызвать у каждого работника магазина хвастовство его вещами (достать работника из магазина).

    }


}





