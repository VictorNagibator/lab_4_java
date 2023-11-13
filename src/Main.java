import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Использование статического метода
        final int num = 5;
        Order[] orders = new Order[num];
        for (int i = 0; i < num; i++) orders[i] = new Order();
        System.out.println(Order.getLastNumOfOrder());
        
        //2. Использование массива объектов
        LaptopComponent[] components = new LaptopComponent[3];
        components[0] = new CPU();
        components[1] = new GPU();
        components[2] = new RAM();
        for (LaptopComponent item : components) System.out.println(item);

        //3. Возврат объекта через вспомогательный класс
        DataStorage storage = DataStorage.DataStorageFactory.createDataStorage("HDD");
        storage.input();
        System.out.println(storage);

        //4. Работа с классом String
        List<String> strings = Arrays.asList(
                "Some",
                "examples",
                "of",
                "strings"
        );
        System.out.println(String.join(" ", strings));
        System.out.println(strings.get(0).toUpperCase());
        String example = "What is going on?";
        String[] words = example.split(" ");
        for (String word : words) System.out.println(word);
    }
}