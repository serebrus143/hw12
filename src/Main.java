public class Main {

    public static void main(String[] args){
        Author tolstoy = new Author("Лев", "Толстой");
        Author pushkin = new Author("Александр", "Пушкин");

        Book warAndPeace = new Book("Война и мир", 1867, tolstoy);
        Book captainDaughter = new Book("Капитанская дочка", 1836, pushkin);

        print(warAndPeace);
        print(captainDaughter);

        captainDaughter.setYear(1842);

        print(captainDaughter);
    }

    private static void print(Book book) {
        System.out.println("Автор: " + book.getAuthor().getName() + " " + book.getAuthor().getSurname() + ", название: " + book.getTitle() + ", год издания: " + book.getYear());

    }
}
