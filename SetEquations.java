import java.util.ArrayList;
import java.util.Collections;

public class SetEquations extends StoreSets{

    public SetEquations(){
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // Displays contents of given set
    public void displaySet(){
        System.out.print("{ ");
        for (int i = 0; i < this.set.size(); i++)
            System.out.print(this.set.get(i) + " ");
        System.out.println("}");
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // Displays unions of two sets
    public void displayUnion(){
        System.out.print("Union between A and B is: { ");
        for (int i = 0; i < set.size(); i++)
            System.out.print(set.get(i) + " ");
        System.out.println("}");
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // Creates union of two sets. Also creates intersection of two sets
    public void unionAB(StoreSets A, StoreSets B){
        for (int i = 0; i < A.set.size(); i++){
            set.add(A.set.get(i));
        }
        for (int i = 0; i < B.set.size(); i++){
            if (set.contains(B.set.get(i))){
                intersection.add(B.set.get(i));
            }
            else{
                set.add(B.set.get(i));
            }
        }
        displayUnion();
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // Displays the intersect of two sets
    public void displayIntersect(){
        System.out.print("The intersection between A and B is: { ");
        for (int i = 0; i < intersection.size(); i++)
            System.out.print(intersection.get(i) + " ");
        System.out.println("}");
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // Creates the complement between given set and Universal set
    public void complement(StoreSets X, StoreSets U){
        for (int i = 0; i < U.set.size(); i++){
            complement.add(i);
        }
        for (int i = 0; i < X.set.size(); i++){
            if (complement.contains(X.set.get(i))){
                complement.remove(Integer.valueOf(X.set.get(i)));
            }
        }
        sort(complement);
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // Displays the complement of a given set
    public void displayComplement(){
        System.out.print("The complement between B and U is: { ");
        for (int i = 0; i < complement.size(); i++)
            System.out.print(complement.get(i) + " ");
        System.out.println("}");
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // displays the product of two sets. (the set used to access the function, and the set in argument)
    public void product(StoreSets A){
        System.out.print("The product (A∩B)×A: { ");
        for (int i = 0; i < intersection.size(); i++){
            for (int j = 0; j < A.set.size(); j++){
                System.out.print("(" + intersection.get(i) + "," + A.set.get(j) + ") ");
            }
        }
        System.out.println("}");
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // Sorts array list
    public void sort(ArrayList<Integer> x){
        Collections.sort(x);
    }
}
