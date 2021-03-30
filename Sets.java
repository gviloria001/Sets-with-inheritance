public class Sets {
    public static void main(String[] args){
        StoreSets setU = new StoreSets(10);
        ///////////////////////////////////////////////////////////////////////////////////
        //// Set A interface
        StoreSets setA = new StoreSets();
        setA.getInput();
        ///////////////////////////////////////////////////////////////////////////////////
        //// Set B interface
        StoreSets setB = new StoreSets();
        setB.getInput();


        ///////////////////////////////////////////////////////////////////////////////////
        //// Displays both sets A and B
        System.out.print("Set A contains:");
        setA.displaySet();
        System.out.print("Set B contains:");
        setB.displaySet();
        System.out.println("=====================================================");


        ///////////////////////////////////////////////////////////////////////////////////
        //Create / display union
        SetEquations setAB = new SetEquations();
        setAB.unionAB(setA, setB);

        ///////////////////////////////////////////////////////////////////////////////////
        //display intersect between A and B
        setAB.displayIntersect();

        ///////////////////////////////////////////////////////////////////////////////////
        //display complement between B and U
        SetEquations setBU = new SetEquations();
        setBU.complement(setB, setU);
        setBU.displayComplement();

        ///////////////////////////////////////////////////////////////////////////////////
        //display product of (intersection of set A and set B) and A           ex:(A∩B)×A.
        setAB.product(setA);

    }
}
