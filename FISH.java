class FISH extends ANIMAL implements Swimmable {

    FISH(String name, int age, double weight) {
         super(name, age, weight);
    }
    @Override
    public void swim() {
        System.out.println("fish do swimming");
    }

    @Override
    public void eat() {
        System.out.println("fish are eating sea weeds");
    }

    @Override
    public void sleep() {
        System.out.println("fish now sleeping");
    }
    @Override
    public void makeSound() {
        System.out.println("bup blup blup blop");
    }
}