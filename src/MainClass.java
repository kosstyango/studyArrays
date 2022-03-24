import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class MainClass {
    //-----------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            System.out.println("Введите число, пожалуйста");
            int x = parseInt(reader.readLine()); //считываем int
            list1.add(x); //Вносим значение в первый список
            if (x % 3 == 0)  //проверяем, что остаток от деления на три равен нулю
                list2.add(x);          //добавление во 2 массив - делящихся на 3
            if (x % 2 == 0)  //проверяем, что остаток от деления на два равен нулю
                list3.add(x);          //добавление в 3 массив - делящихся на 2
            if (x % 3 != 0 && x % 2 != 0) //все остальные элементы
                list4.add(x);// добавляем в 4 массив
        }
        System.out.println("Введённый массив:");
        printList(list1);
        System.out.println("Массив чисел, делящихся на 3");
        printList(list2);
        System.out.println("Массив чисел, делящихся на 2");
        printList(list3);
        System.out.println("Массив чисел, НЕ делящихся на 2 и на 3");
        printList(list4);
    }

    public static void printList(ArrayList<Integer> list) {

        for (Integer x : list)   //быстрый for по всем элементам, только для коллекций
            System.out.println(x);
    }
}