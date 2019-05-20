public class Classroom {

    public static void main(String[] args) {

        Wilder loup = new Wilder("Loup");
        System.out.println("1. " + loup.whoAmI());

        Wilder julien = new Wilder("Julien", false);
        System.out.println("2. " + julien.whoAmI());

        julien.setAware(true);
        System.out.println("2. " + julien.whoAmI());
    }
}