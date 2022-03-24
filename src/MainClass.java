import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class MainClass {
    //-----------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку, пожалуйста");
            String s = reader.readLine(); //считываем строку
            list.add(0, s); //Вносим значение в начало списка
        }
        list.remove(2); //удаляем третий элемент
        //System.out.println("Введённый массив:");
        printList(list);

    }

    public static void printList(ArrayList<String> list) {
        for (String s : list)   //быстрый for по всем элементам, только для коллекций
            System.out.println(s);
    }
}