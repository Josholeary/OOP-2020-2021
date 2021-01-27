package ie.tudublin;

public class Cat extends Animal
{

    private int numlives;
    public Cat(String name)
    {
        super(name);
    }

    public int toNum()
    {
        return numlives;
    }

    public int getNum()
    {
        return numlives;
    }

    public void setnumlives(int numlives)
    {
        this.numlives = numlives;
    }

    public void Kill()
    {
            numlives = numlives-1;
        if(numlives>0)
        {
            System.out.println("Ouch!");
        }
        else
        {
            System.out.println("Dead!");
        }
    }
}