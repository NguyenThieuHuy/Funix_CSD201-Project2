package AS2;
import java.io.IOException;
import java.util.*;

public class AS2_Main {

  public static void showMenu() {
    System.out.println("Choose one of this options:");
    System.out.println("Product list:");
    System.out.println("1. Load data from file and display");
    System.out.println("2. Input & add to the end");
    System.out.println("3. Display data");
    System.out.println("4. Save product list to file");
    System.out.println("5. Search by ID");
    System.out.println("6. Delete by ID");
    System.out.println("7. Sort by ID");
    System.out.println("8. Convert to Binary");
    System.out.println("9. Load to stack and display");
    System.out.println("10. Load to queue and display");
    System.out.println("0. Exit");
  }   
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    OperationToProduct o = new OperationToProduct();
    MyList<Product> list = new MyList<Product>();
    MyQueue<Product> queue = new MyQueue<Product>();
    MyStack<Product> stack = new MyStack<Product>();
    String path = "lib/data.csv";
    boolean repeate = true;
    int key;
    showMenu();
    do {
      System.out.print("\nChoose from the list: ");
      key = sc.nextInt();  
      switch (key) {
        case 1:
          //display
          o.getAllItemsFromFile(path, list);
          o.displayAll(list);
          break;

        case 2:
          o.addLast(list);
          break;

        case 3:
          //display
          o.displayAll(list);
          break;

        case 4:
          o.writeAllItemsToFile(path, list);
          break;

        case 5:
          o.searchByCode(list);
          break;

        case 6:
          o.deleteByCode(list);
          break;

        case 7:
          o.sortByCode(list,list.length());
          break;

        case 8:
          if (list.isEmpty() == true) {
            System.out.println("Your list is empty!!!");
            break;
          }
          o.bin_num = "";
          System.out.println(o.convertToBinary(list.head.info.getQuantity()));
          break;

        case 9:
          o.getAllItemsFromFile(path, queue);
          //display
          Node<Product> currentqNode = queue.head;
          if (queue.head == null) {
              System.out.println("Your queue is empty!!!");;
          }
          else {
              System.out.printf("| %5s","Bcode");
              System.out.printf("| %50s", "Title");
              System.out.printf("| %15s", "Quantity");
              System.out.printf("| %15s", "Price\n");
              while (currentqNode.next != null) {
                  currentqNode.info.display();
                  currentqNode = currentqNode.next;
              }
              queue.tail.info.display();
          }
          break;

        case 10:
          o.getAllItemsFromFile(path, stack);
          //display
          Node<Product> currentsNode = stack.head;
          if (stack.head == null) {
              System.out.println("Your stack is empty!!!");;
          }
          else {
              System.out.printf("| %5s","Bcode");
              System.out.printf("| %50s", "Title");
              System.out.printf("| %15s", "Quantity");
              System.out.printf("| %15s", "Price\n");
              while (currentsNode.next != null) {
                  currentsNode.info.display();
                  currentsNode = currentsNode.next;
              }
              currentsNode.info.display();
            }
          break;

        case 0:
          repeate = false;
          break;

        default:
          break;
      }
    } while (repeate == true);
    sc.close();
  }
}