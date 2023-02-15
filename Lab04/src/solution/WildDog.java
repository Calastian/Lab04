package solution;
public class WildDog extends Canine{
    public WildDog(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    public void makeNoise()
    {
        System.out.println("Bark...");
        setHungerLevel(getHungerLevel() - 3);
    }
    public void eat()
    {
        System.out.println("slop...");
        setHungerLevel(getHungerLevel() - 3);
    }
}