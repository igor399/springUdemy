package epam.spring;

class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Гау");
    }
}
