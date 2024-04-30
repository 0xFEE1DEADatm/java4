package org.csvparser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Objects;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        try {
            List<Person> persons = new LinkedList<>();
            Map<String, Division> divisions = new HashMap<>();

            String file = "src/main/resources/foreign_names.csv";
            CSVParser csvParser = new CSVParser(file, ";");

            List<String[]> parsedData = csvParser.parsing();
            for (int i = 1; i < parsedData.size(); i++) {
                String[] row = parsedData.get(i);
                Gender gender = Objects.equals(row[2], "Male") ? Gender.MALE : Gender.FEMALE;
                if (!divisions.containsKey(row[4]))
                    divisions.put(row[4], new Division(generateUniqueId(), row[4]));
                Person person = new Person(Integer.parseInt(row[0]), row[1], gender, row[3], divisions.get(row[4]), Integer.parseInt(row[5]));
                persons.add(person);
            }

            for (Person person: persons)
                System.out.println(person);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int generateUniqueId() {
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        return Integer.parseInt(str);
    }
}