import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.Arrays;

public class MainClass {
    //-----------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int pointer = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    pointer = j;
                }}
                System.out.println(i + " шаг: Макcимум " + max + " на позиции " + pointer);
                for (int k = pointer; k >= i+1; k--)//сдвигаем массив от i до pointer на 1 позицию вправо
                    array[k] = array[k - 1];

                array[i] = max; //записываем максимум в i ячейку
                System.out.println("Теперь массив такой: " + Arrays.toString(array));
            }
        }
    }