public class TestPuzzle
{   
    public static void main(String[] args)
    {
        Puzzle test = new Puzzle();

        
        System.out.println(test.getTenRolls());
        System.out.println(test.getRandomLetter());
        System.out.println(test.generatePassword());
        System.out.println(test.getNewPasswordSet(3));
    }
}