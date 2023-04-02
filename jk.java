import java.util.Scanner; // import the Scanner class 

class jk{
  public static void main(String[] args) {
    Scanner kuchbhi = new Scanner(System.in);
    
    String yourname;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    yourname = kuchbhi.nextLine();   
    

    System.out.print("Enter an integer :")
    Scanner number  = new Scanner(System.in);
    int number = input.nextInt();
    System.out.println("Enter password" + number); 
    
    
    System.out.println("Username is: " + yourname); 
    System.out.println("password is: " + number); 
    System.out.println("your username lenght is ="+ yourname.length());    
    System.out.println("your password lenght is ="+ number.length());    
  }
}
