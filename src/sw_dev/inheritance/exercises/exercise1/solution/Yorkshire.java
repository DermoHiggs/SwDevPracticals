package sw_dev.inheritance.exercises.exercise1.solution;

// *****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// *****************************************************************
public class Yorkshire extends Dog
{
    public Yorkshire(String name)
    {
        super(name);
    }
    // -------------------------------------------------------------
    // Small bark -- overrides speak method in Dog
    // -------------------------------------------------------------
    public String speak()
    {
        return "woof";
    }


    //Part 2 - Solution
    //Not quite!
    public static int avgBreedWeight()
    {
        return 40; //Magic number - to be avoided!
    }
}
