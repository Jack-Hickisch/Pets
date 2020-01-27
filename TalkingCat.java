import java.util.*;

public class TalkingCat extends Cat
{
    public TalkingCat(String name)
    {
        super(name);
    }

    public String isHappyResponse()
    {
        String compliments[] = {"yur great", "thanks for petting me you are the best pet owner"};
        String insults[] = {"die in a hole", "be nice or i will claw u in the face"};

        Random rand = new Random();
        int n = rand.nextInt(compliments.length);

        if (isHappy())
        {
            return compliments[n];
        }
        else
        {
            return insults[n];
        }
    }
}