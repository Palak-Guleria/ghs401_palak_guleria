
public class pick3
{   
    public static void main() {
        int[] myArray = new int[100];
        
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = i*5;
            System.out.println("Item " + (i) + " is " + myArray[i] + ".");
        }
    }    
}
