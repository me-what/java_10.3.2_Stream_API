import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream.filter(p->p.getPrice()<50000).forEach(p->System.out.println(p.getName()));
    }
}