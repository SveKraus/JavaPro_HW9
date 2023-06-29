package lesson11;

public class Translate {
    String english;
    String russian;

    public Translate(String english, String russian) {
        this.english = english;
        this.russian = russian;
    }

    @Override
    public String toString() {
        return "Translate{" +
                "english='" + english + '\'' +
                ", russian='" + russian + '\'' +
                '}';
    }
}
