import javax.swing.JOptionPane;
public class high_low
{
    public static void main() {
        int HI = 0;
        int LO = 0;
        int AR = 0;
        int EN = 0;

        int[] nums = new int[10];
        try{
            HI =Integer.parseInt(JOptionPane.showInputDialog("Enter a high number"));
            LO= Integer.parseInt(JOptionPane.showInputDialog("Enter a low number"));
            AR= Integer.parseInt(JOptionPane.showInputDialog("Enter the length of your array"));
        }
        catch(NumberFormatException e)
        {
        }
        finally
        {
        
        if (HI>LO)
        {
            for(int i=0;i<AR;i++)
            {
                nums[i]=(int)(Math.random()*(HI-LO+1)+LO);
                if (nums[i]%2==1){
                    System.out.println("Element #"+i+ " in the array is "+nums[i] + " which is odd");

                }
                else
                {
                    System.out.println("Element #"+i+ " in the array is "+nums[i] + " which is even");
                    EN++;
                }
              
            }
            System.out.println("The array has " + EN+" even numbers and " +(AR-EN)+ " odd numbers.");
        }
        else 
        {
            System.out.println("Number Error");
        }
        }
    }
}
