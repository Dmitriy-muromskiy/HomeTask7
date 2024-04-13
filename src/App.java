public class App {
    public static void main(String[] args) {
        Author chehov = new Author("Антон", " Чехов");
        Book toska = new Book("Тоска", chehov, 1905);
        Author tolstoy = new Author("Лев", " Толстой");
        Book war = new Book("Война и мир", tolstoy, 1896);

        war.setAge(1805);
    }
}