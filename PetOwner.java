public class PetOwner
{
    private Pet[] pets = new Pet[10];

    public PetOwner(Pet[] pets)
    {
        this.pets = pets;
    }

    public void setPet(int place, Pet pet)
    {
        pets[place] = pet;
    }

    public Pet getPet(int place)
    {
        return pets[place];
    }

    public boolean isHappy()
    {
        for (Pet pet : pets)
        {
            if (!pet.isHappy())
            {
                return false;
            }
        }

        return true;
    }
}