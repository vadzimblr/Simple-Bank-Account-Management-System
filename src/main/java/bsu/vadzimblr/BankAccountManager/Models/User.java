package bsu.vadzimblr.BankAccountManager.Models;

import java.util.ArrayList;
import java.util.List;

public abstract class User implements DAOMapper<User> {
    private String login;
    private String password;
    private String email;
    private String name;
    private String surname;
    private String patronymic;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public User(String login, String password, String email, String name, String surname) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.patronymic = "";
    }

    public User(String login, String password, String email, String name,
                String surname, String patronymic) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    @Override
    public List<String> mapModelToParameters(User model) {
        List<String> result = new ArrayList<>();
        result.add(login);
        result.add(password);
        result.add(email);
        result.add(name);
        result.add(surname);
        result.add(patronymic);
        return result;
    }
}
