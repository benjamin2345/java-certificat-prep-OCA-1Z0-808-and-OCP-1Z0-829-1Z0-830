public class Dog {

    private String name = "chip";

    public Dog() {
        name = "Teddy";
        System.out.println("Inside the constructor...");
    }

    {
        System.out.println("Inside the initializer block...");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.name);
    }
}


