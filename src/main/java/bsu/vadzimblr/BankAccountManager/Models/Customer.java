package bsu.vadzimblr.BankAccountManager.Models;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User implements DAOMapper<User>{
    private int age;

    public Customer(String login, String password, String email,
                    String name, String surname, int age) {
        super(login, password, email, name, surname);
        this.age = age;
    }
    public Customer(String login, String password, String email,
                    String name, String surname, String patronymic,
                    int age) {
        super(login, password, email, name, surname, patronymic);
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public List<String> mapModelToParameters(User model) {
        List<String> result = super.mapModelToParameters(model);
        result.add(String.valueOf(age));
        return result;
    }

}
