import java.util.ArrayList;
import java.util.List;

abstract class HABITANTS {

    List<ANIMAL> inhabitants;

    public HABITANTS() {
        inhabitants = new ArrayList<>();
    }

  
    public void addAnimal(ANIMAL anm) {
        inhabitants.add(anm);
    }

    
    public abstract void simulateInteractions();
}


class BirdPlace extends HABITANTS {
    @Override
    public void simulateInteractions() {
        for (ANIMAL anm : inhabitants) {
            anm.makeSound();
            if (anm instanceof Flyable flyable) {
                flyable.fly();
            }
            anm.eat();
            anm.sleep();
        }
    }

    void feedanimals() {
    }
}

// Aquarium habitat for fish
class Aquarium extends HABITANTS {
    @Override
    public void simulateInteractions() {
        for (ANIMAL anm : inhabitants) {
            anm.makeSound();
            if (anm instanceof Swimmable swimmable) {
                swimmable.swim();
            }
            anm.eat();
            anm.sleep();
        }
    }

    void feedanimals() {
    }
}

// Savannah habitat for mammals
class MamalHabitat extends HABITANTS {
    @Override
    public void simulateInteractions() {
        for (ANIMAL anm : inhabitants) {
            anm.makeSound();
            anm.eat();
            anm.sleep();
        }
    }

    void feedanimals() {
    }
}

// Jungle habitat for primates
class Jungle extends HABITANTS{
    @Override
    public void simulateInteractions() {
        for (ANIMAL anm: inhabitants) {
            anm.makeSound();
            if (anm instanceof Climber climber) {
                climber.climb();
            }
           anm.eat();
           anm.sleep();
        }
    }
}

