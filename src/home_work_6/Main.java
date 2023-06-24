package home_work_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(randomStringRus(),randomString(),nameRandom());
        System.out.println(" персон "+ person.toString());

        Animal animal = new Animal(10,klRandom());
        System.out.println(" питомец "+ animal.toString());

    }
    public static String randomStringRus() {
        int leftLimit1 = 224; // буква 'a'
        int rightLimit1 = 255; // буква 'z'
        int stringLength1 = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(stringLength1);
        for (int i = 0; i < stringLength1; i++) {
            int randomLimitedInt = leftLimit1 + (int)
                    (random.nextFloat() * (rightLimit1 - leftLimit1 + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;

    }

    public static String randomString() {
        int leftLimit = 97; // буква 'a'
        int rightLimit = 122; // буква 'z'
        int stringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;

    }

    public static Names nameRandom() {
        Names[] masName = Names.values();
        int n = (int) Math.floor(Math.random() * masName.length);
        return masName[n];
    }

    public static Klichka klRandom() {
        Klichka[] klName1 = Klichka.values();
        int n = (int) Math.floor(Math.random() * klName1.length);
        return klName1[n];

    }
}