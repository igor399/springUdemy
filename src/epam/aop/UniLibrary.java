package epam.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We get book from UniLibrary " );
        System.out.println("-------------------------------------");
    }

    public void returnBook() {
        System.out.println("We return book to UniLibrary");
        System.out.println("-------------------------------------");
    }

    public void getMagazine() {
        System.out.println("We get magazine from UniLibrary ");
        System.out.println("-------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return magazine to UniLibrary");
        System.out.println("-------------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("Add book to the library ");
        System.out.println("-------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Add magazine to the library");
        System.out.println("-------------------------------------");
    }
}
