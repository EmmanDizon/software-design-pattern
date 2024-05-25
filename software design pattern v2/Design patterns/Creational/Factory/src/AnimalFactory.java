public class AnimalFactory {
    public static Animal getAnimal(AnimalType type) {
        if(type == AnimalType.CAT) {
            return new Cat();
        }
        else if (type == AnimalType.DOG) {
            return new Dog();
        }

        return null;
    }
}
