package collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

public class Collections {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Виктор\\Downloads\\vozrast-domov.csv");
        int length = fileInputStream.available();
        byte[] data = new byte[length];
        fileInputStream.read(data);

        String text = new String(data);


        ArrayList<String[]> lineWords = new ArrayList<>();

        String[] lines = text.split("\n");
        for (String line : lines) {
            String[] words = line.split(",");
            lineWords.add(words);
        }
        /*//Начало операции
        //перебор списка и вывод по нужному параметру (или вывод всего списка)
        for (String[] lineWord : lineWords) {
//            if (lineWord[4].equals("2008")) { //например фильтруем по какому-то типу
            for (String word : lineWord) {
                System.out.print(word);
                System.out.print("|");
            }
            System.out.println("==============");
//            }
        }
        //Конец операции*/

        //Начало операции
        //Перебираем список домов, если дом с конкрентым годом постройки нашелся в списке, увеличиваем счетчик
        //на выходе получаем карту с количеством построенных зданий в конкретном году
//        HashMap<String, Integer> map = new HashMap<>();
        TreeMap<String, Integer> map = new TreeMap<>(); //можно взять сортированную мапу трее
        for (String[] lineWord : lineWords) {
            if (map.containsKey(lineWord[4])) {
                Integer k = map.get(lineWord[4]);
                k += 1;
                map.put(lineWord[4], k);
            } else {
                map.put(lineWord[4], 1);
            }
        }
        // дай все значения по ключу
//        System.out.println(map.get("2008"));

//        Дай все значения вообще
        for (String key : map.keySet()) {
            System.out.println("Год: " + key + " Количество " + map.get(key));
        }
    }
}