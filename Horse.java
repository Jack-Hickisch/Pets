public class Horse extends Pet
{
    private boolean brushed = false;
    private boolean ridden = false;

    public Horse(String name)
    {
        super(name);
    }

    public void brush()
    {
        brushed = true;
    }

    public void ride()
    {
        ridden = true;
    }

    public boolean getBrushed()
    {
        return brushed;
    }

    public boolean getRidden()
    {
        return ridden;
    }

    public boolean isHappy()
    {
        if (brushed && ridden && getFed() && getWalked() && getPetted())
        {
            return true;
        }
        return false;
    }
}