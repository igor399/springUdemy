package epam.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We get book from UniLibrary " );
    }

    protected String returnBook() {
        System.out.println("We return book to UniLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("We get magazine from UniLibrary ");
    }
}
