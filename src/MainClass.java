import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
    //-----------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats); //создаём карту методом addCatsToMap


        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
    public static Map<String, Cat> addCatsToMap (String[] cats){ //наполняем карту именами котов их списка и объектами
        Map<String, Cat> map = new HashMap<>();

        for (int i = 0; i < cats.length; i++) {
            map.put(cats[i], new Cat(cats[i]));
        }
        return map;
    }
    public static class Cat {
        String name;
        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}