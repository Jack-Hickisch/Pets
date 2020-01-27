public class Tester {
    public static void main( String[] args ) {

        Pet[] pets = new Pet[6]; 

        pets[0] = new Dog("Jerry");
        pets[1] = new Cat("Larry");
        pets[2] = new Yorkie("Fred");
        pets[3] = new TalkingCat("Jimmothy");
        pets[4] = new TalkingCat("Timmothy");
        pets[5] = new Horse("Dave");

        PetOwner petOwner0 = new PetOwner(pets);

        pets[0].feed();
        pets[0].walk();
        pets[0].pet();
        System.out.println(pets[0].isHappyResponse());

        pets[1].feed();
        System.out.println(pets[1].isHappyResponse());

        for (int i = 0; i < 10; i++)
        {
            pets[2].pet();
        }
        pets[2].walk();
        pets[2].feed();
        System.out.println(pets[2].isHappy());

        pets[3].feed();
        System.out.println(pets[3].isHappyResponse()); // working here

        pets[4].feed();
        System.out.println(pets[4].isHappyResponse());

        pets[5].feed();
        pets[5].walk();
        pets[5].pet();
        pets[5].ride();
        //pets[5].brush();

        System.out.println(pets[5].isHappy());

        System.out.println(petOwner0.isHappy());
    }
}