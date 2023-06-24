package home_work_6;

public class Person {
    private String nick;
    private String password;
    private Names name;

    public Person(String nick, String password, Names name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("nick='").append(nick).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }
}
