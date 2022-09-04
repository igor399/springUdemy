package epam.spring;

class Dog implements Pet {
    public Dog() {
        System.out.println("Constr Dog is created");
    }

    @Override
    public void say() {
        System.out.println("Гау");
    }
}
