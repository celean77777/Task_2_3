import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        // Задача 1
        String[] initArray = {
                "Cat", "Dog", "Lion", "Cow", "Cat", "Elephant", "Cat", "Crocodile", "Lion",
                "Dog", "Dog", "Dog", "Lamb", "Bird", "Cat", "Lion", "Mouse"
        };

        List<String> initList = new ArrayList<>(Arrays.asList(initArray));
        System.out.println(initList);
        Map<String, Integer> hashMap = new HashMap();
        Iterator<String> stringIterator = initList.listIterator();

        while (stringIterator.hasNext()){
            String str = stringIterator.next();
            if(!(hashMap.containsKey(str))){
                hashMap.put(str, 1);
            }else {
                hashMap.put(str, hashMap.get(str)+1);
            }
        }

        System.out.println(hashMap);

    // Задача 2

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Вася", "111");
        phoneBook.add("Петя", "222");
        phoneBook.add("Оля", "333");
        phoneBook.add("Вася", "111");
        phoneBook.add("Коля", "444");
        phoneBook.add("Юля", "555");
        phoneBook.add("Вася", "666");
        phoneBook.add("Вася", "777");
        phoneBook.add("Вова", "111");

        System.out.println(phoneBook.get("Вася"));
        System.out.println(phoneBook.get("Вова"));


    }
}
