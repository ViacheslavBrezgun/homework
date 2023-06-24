package home_work_6;

public class Animal {
    private int age;
    private Klichka klichka;

    public Animal(int age, Klichka klichka) {
        this.age = age;
        this.klichka = klichka;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("age=").append(age);
        sb.append(", klichka=").append(klichka);
        sb.append('}');
        return sb.toString();
    }
}
