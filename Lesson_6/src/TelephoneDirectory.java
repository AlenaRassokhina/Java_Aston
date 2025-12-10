import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {
    String surname;
    List<String> numbers;

    public TelephoneDirectory(String surname) {
        this.surname = surname;
        this.numbers = new ArrayList<>();
    }

    public void addTelephone(String number) {
        this.numbers.add(number);
    }

    public String getTelephone() {
        String phoneNumber = String.valueOf(this.numbers);
        return phoneNumber;
    }
}