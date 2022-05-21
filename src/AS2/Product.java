package AS2;
/**
* Product class
*/
public class Product {

    private String bcode;
    private String title;
    private Integer quantity;
    private double price;

    /**
     * Default constructor
     */
    public Product() {
        bcode = null;
        title = null;
        quantity = null;
        price = 0.0;
    }
   
    /**
     * Constructor method to initialize a product
     * @param bcode    Product's bar code
     * @param title    Product's title
     * @param quantity Product's quantity
     * @param price    Product's price
     */
    public Product(String bcode, String title, Integer quantity, double price) {
        this.bcode = bcode;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }
   
    /**
     * Convert this product to String for printing
     */
    @Override
    public String toString() {
        return bcode +" "+ title +" "+ quantity +" "+ price;
    }
   }