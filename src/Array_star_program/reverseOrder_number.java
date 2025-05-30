package Array_star_program;

public class reverseOrder_number 
{
	public static void main(String[] args) 
	{
        int n = 4; // Number of rows
        
        // Loop through each row
        for (int i = 1; i <=n; i++) {
            // Print spaces before the numbers in each row
            for (int j =n-1; j >=i;j--)
            {
                System.out.print(" ");
            }
            
            // Print the numbers in each row
            for (int j = i; j < 2 * i; j++) {
                System.out.print(j);
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }


}
