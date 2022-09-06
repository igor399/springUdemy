package epam.spring;

class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Constr Dog is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Гау");
    }
}
