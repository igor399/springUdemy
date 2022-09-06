package epam.spring;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Constr Person created");
    }

    public Person(Pet pet) {
        this.pet = pet;
    }
//pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("PetSetter created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hi my Pet");
        pet.say();
    }
}
