package AS2;
import java.util.*;

public class AS2_Main {

    public static void showMenu() {
   
      System.out.println("Choose one of this options:");
   
      System.out.println("Product list:");
   
      System.out.println("1. Load data from file and display");
   
      System.out.println("2. Input & add to the end.");
   
      System.out.println("3. Display data");
   
      System.out.println("4. Save product list to file.");
   
      System.out.println("5. Search by ID");
   
      System.out.println("6. Delete by ID");
   
      System.out.println("7. Sort by ID.");
   
      System.out.println("8. Convert to Binary");
   
      System.out.println("9. Load to stack and display");
   
      System.out.println("10. Load to queue and display.");
   
      System.out.println("0. Exit");
   
    }
   
    
   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      showMenu();
      int key = sc.nextInt();
      boolean repeate = true;
      do {
        switch (key) {
          case 1:
            break;
  
          case 2:
            break;
  
          case 3:
            break;
  
          case 4:
            break;
  
          case 5:
            break;
  
          case 6:
            break;
  
          case 7:
            break;
  
          case 8:
            break;
  
          case 9:
            break;
  
          case 10:
            break;
  
          case 0:
            break;
  
          default:
            repeate = false;
            break;
        }
      } while (repeate = true);
      sc.close();
    }
    }