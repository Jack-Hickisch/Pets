public class Yorkie extends Dog
{
    private int pettedCount = 0;

    public Yorkie (String name)
    {
        super(name);
    }

    public void pet()
    {
        pettedCount += 1;
    }

    public boolean getPetted()
    {
        return pettedCount >= 10;
    }

    public boolean isHappy()
    {
        if (getFed() && pettedCount >= 10 && getWalked())
        {
            return true;
        }
        return false;
    }
}