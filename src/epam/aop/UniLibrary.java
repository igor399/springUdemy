package epam.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We get book from UniLibrary " );
    }

    public void returnBook() {
        System.out.println("We return book to UniLibrary");
    }

    public void getMagazine() {
        System.out.println("We get magazine from UniLibrary ");
    }

    public void returnMagazine() {
        System.out.println("We return magazine to UniLibrary");
    }

    public void addBook(){
        System.out.println("Add book to the library");
    }

    public void addMagazine(){
        System.out.println("Add magazine to the library");
    }
}
