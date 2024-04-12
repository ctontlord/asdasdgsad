class BIRD extends ANIMAL implements Flyable {

    public BIRD(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    public void fly() {
        System.out.println("bird flying");
    }

    @Override
    public void eat() {
        System.out.println("bird now eating something");
    }

    @Override
    public void sleep() {
        System.out.println("bird go sleep now");
    }
    @Override
    public void makeSound() {
        System.out.println("chirp twitt chirp");
    }
}

