package solution;
public class FeralCat extends Feline
{
    public FeralCat(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    public void makeNoise()
    {
        System.out.println("meow...");
        setHungerLevel(getHungerLevel() - 3);
    }
    public void eat()
    {
        System.out.println("pick...");
        setHungerLevel(getHungerLevel() - 3);
    }
}