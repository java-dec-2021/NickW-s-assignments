public class Mammal
{
    protected int energylevel;

    
    Mammal(int energylevel)
    {
        this.energylevel=energylevel;
    }
    
    public void displayenergy()
    {
        System.out.println("Energy Level :"+ energylevel);
    }
}