abstract class ANIMAL{
    String name;
    int age;
    double weight;
public ANIMAL(String name, int age, double weight){
    this.name = name;
    this.age =  age;
    this.weight = weight;
}
    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
}
