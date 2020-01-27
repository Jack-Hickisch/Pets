public class Cat extends Pet
{
    public Cat (String name)
    {
        super(name);
    }

    // overwriting
    public String isHappyResponse()
    {
        if (getFed() && !getPetted() && !getWalked())
        {
            return "meow";
        }
        return "hiss";
    }

    public boolean isHappy()
    {
        if (getFed() && !getPetted() && !getWalked())
        {
            return true;
        }
        return false;
    }
}