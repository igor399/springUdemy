package epam.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("We get book from UniLibrary " + book.getName());
    }

    protected String returnBook() {
        System.out.println("We return book to UniLibrary");
        return "OK";
    }

    public void getMagazine(int a, double k) {
        System.out.println("We get magazine from UniLibrary ");
    }
}
