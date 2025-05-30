package Array_star_program;

public class program5 {

	public static void main(String[] args)
	{
	  int rows = 5; // Total number of rows
    
    // Loop for each row
    for (int i = 1; i <= rows; i++) {
        // Print leading spaces
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }
        
        // Print numbers in each row
        for (int j = rows - i + 1; j <= rows; j++) {
            System.out.print(j);
        }
        
        // Move to the next line after each row
        System.out.println();
    }
}
}


