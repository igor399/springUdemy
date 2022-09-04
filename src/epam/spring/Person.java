package epam.spring;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hi my Pet");
        pet.say();
    }
}
