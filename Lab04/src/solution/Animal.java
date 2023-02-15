package solution;
public abstract class Animal
{
   private String name;
   private Zoo zoo;
   private int hungerLevel;

   public Animal(Zoo myZoo, String animalName)
   {
    this.hungerLevel = 0;
    this.zoo = myZoo;
    this.name = animalName;
   } 

   public int getHungerLevel()
   {
        return hungerLevel;
   }

   public void setHungerLevel(int hunger)
   {
        if (hunger >= 10)
        {
            this.hungerLevel = 10;
        }
        else if (hunger <= 0)
        {
            this.hungerLevel = 0;
        }
        else
        {
            this.hungerLevel = hunger;
        }
       
   }

   public String getName()
   {
   return name;
   }
   
   public void setName(String animalName)
   {
        this.name = animalName;
   }

    public void sleep()
    {
        System.out.println("Sleeping....");
        setHungerLevel(10);
        
    }

    public void roam()
    {
        System.out.println("Moving around....");
        setHungerLevel(1);
    }

    public abstract void makeNoise();
   

    public abstract void eat();
  

}