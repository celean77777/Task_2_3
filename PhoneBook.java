import java.util.*;

public class PhoneBook {

    private Map<String, HashSet> personList;
    public PhoneBook() {
        personList = new HashMap<>();
    }

    public void add(String name, String phone){
        if (!(personList.containsKey(name))){
            Set<String> phoneList = new HashSet<>();
            phoneList.add(phone);
            personList.put(name, (HashSet) phoneList);
        } else {
            HashSet<String> phoneList = personList.get(name);
            phoneList.add(phone);
            personList.put(name, phoneList);
        }
    }

    public String get (String name){
        HashSet<String> outputPhone = personList.get(name);
        return (new StringBuilder().append("Телефон(ы) абонентов с именем ").append(name).append(" - ").
                append(outputPhone).toString());
    }

    }






