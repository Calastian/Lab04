package solution;
import java.util.ArrayList;
public class Zoo implements AnimalLocation
{
    private String name;
    private double latitude;
    private double longitude;
    private ArrayList<Animal> zooAnimals;

    public Zoo(String name, double lat, double lon)
    {
        this.name = name;
        this.latitude = lat;
        this.longitude = lon;
        zooAnimals = new ArrayList<>();
    }
    public double getLatitude()
    {
        return latitude;
    }
    public double getLongitude()
    {
        return longitude;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getNumOfAnimals()
    {
       return zooAnimals.size();
    }
    public void addAnimal(Animal animal)
    {
        zooAnimals.add(animal);
    }
    public void testAnimals()
    {
        System.out.printf("Name of Zoo: %s\nLocation of Zoo "+
        "latitude: %.2f\n Longitude of Zoo: %.2f\nNumber of Animals: %d\n", getName(), getLatitude(), getLongitude(), getNumOfAnimals());
        for (Animal animal: zooAnimals)
        {
            animal.sleep();
            animal.makeNoise();
            animal.eat();
            animal.roam();
            if (animal instanceof Pet)
            {
                ((Pet)animal).play();
                ((Pet)animal).beFriendly();
            }
        }
    }
    public static void main(String[] args)
    {

        Zoo zoo = new Zoo("NewYork", 1000, 2000);
        Wolf wolf = new Wolf(zoo, "wolf");
        WildDog wildDog = new WildDog(zoo, "wildDog");
        Lion lion = new Lion(zoo, "lion");
        Hippo hippo = new Hippo(zoo, "hippo");
        FeralCat feralCat = new FeralCat(zoo, "feralcat");
        Dog dog = new Dog(zoo, "dog");
        Coyote coyote = new Coyote(zoo, "coyote");
        Cat cat = new Cat(zoo, "cat");
       zoo.addAnimal(wolf);
        zoo.addAnimal(wildDog);
        zoo.addAnimal(lion);
        zoo.addAnimal(hippo);
        zoo.addAnimal(feralCat);
        zoo.addAnimal(dog);
        zoo.addAnimal(coyote);
        zoo.addAnimal(cat);
        zoo.testAnimals();
    }
}
