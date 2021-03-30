import java.util.ArrayList;
import java.util.Scanner;
public class StoreSets {
    protected ArrayList<Integer> set = new ArrayList<>();
    protected int validNum;
    private Scanner cin = new Scanner(System.in);
    protected ArrayList<Integer> intersection = new ArrayList<>();
    protected ArrayList<Integer> complement = new ArrayList<>();



    ///////////////////////////////////////////////////////////////////////////////////
    // Default Constructor, generates dynamic array
    public StoreSets(){
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // Overridden Constructor, generates int[10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }
    public StoreSets(int override){
        for (int i = 0; i < override; i++){
            set.add(i);
        }
    }


    public void displaySet(){
        System.out.print("{ ");
        for (int i = 0; i < this.set.size(); i++)
            System.out.print(this.set.get(i) + " ");
        System.out.println("}");
    }

    public void getInput(){
        System.out.println("Fill set");
        System.out.println("Enter element. There can be no duplicate elements in set. Enter -99 to finish filling");
        for (int i = 0; i < 11; i++) {
            validNum = cin.nextInt();
            while (set.contains(validNum) || validNum > 9) {
                if (validNum == -99)
                    break;
                System.out.println("Please enter either -99 to exit or enter a unique number between 0 - 9 at index: " + i);
                validNum = cin.nextInt();
            }
            /*sort(set);*/
            if (validNum == -99)
                break;
            set.add(validNum);
        }
    }
}
