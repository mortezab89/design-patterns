package creatinoal.builderDesign;

public class MainBuilder {

    public static void main(String[] args) {
        User build = new User.UserBuilder("Morteza", "Bandi")
                .age(31).address("test address").phone("123132").build();

        System.out.println(build);
    }
}
