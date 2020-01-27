public class Pet
{
    private String name;
    private boolean fed = false;
    private boolean walked = false;
    private boolean petted = false;

    public Pet(String name)
    {
        this.name = name;
    }

    
    public void feed()
    {
        fed = true;
    }

    public void walk()
    {
        walked = true;
    }

    public void pet()
    {
        petted = true;
    }

    public void brush()
    {
    }

    public void ride()
    {
    }

    public boolean getFed()
    {
        return fed;
    }

    public boolean getWalked()
    {
        return walked;
    }

    public boolean getPetted()
    {
        return petted;
    }

    public String isHappyResponse()
    {
        if (fed && petted && walked)
        {
            return "WOOF!";
        }
        return "woof";
    }

    public boolean isHappy()
    {
        if (fed && petted && walked)
        {
            return true;
        }
        return false;
    }
}