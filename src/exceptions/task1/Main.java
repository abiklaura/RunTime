package exceptions.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        //Проверить логин и пароль
        getUserByLoginAndPassword(login, password);

        //Вызвать методы валидации пользователя
        validateUser(getUserByLoginAndPassword(login, password));

        System.out.println("Доступ предоставлен");
    }

    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass1", 24);
        User user2 = new User("bob", "bob@gmail.com", "qwerty", 17);
        User user3 = new User("mike", "mike@gmail.com", "asdfg", 24);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {

        User[] users = getUsers();
        for (User user : users) {
            if (login.equalsIgnoreCase(user.getLogin()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18)
            throw new AccessDeniedException("Аge less than 18");
    }
}