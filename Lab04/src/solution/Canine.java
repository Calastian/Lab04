package solution;
public abstract class Canine extends Animal{
    public Canine(Zoo myZoo, String name)
    {
        super(myZoo,name);
    }
    @Override
    public void roam()
    {
        System.out.println("like canines roam in packs...");
        setHungerLevel(getHungerLevel() + 1);
    }
}