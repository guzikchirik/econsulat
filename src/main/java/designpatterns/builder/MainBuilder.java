package designpatterns.builder;

public class MainBuilder {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Anton", "Chyrko").age(26).address("Denisovskaya streat")
                .phone("+375297721991").build();
        System.out.println(user.toString());
    }
}
