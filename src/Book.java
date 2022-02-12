public class Book {
    private String name;
    private String author;
    private int price;
    private int quantity;
    private double weight;

    public Book() {
    }

    public Book(String name, String author, int price, int quantity, double weight) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }
    public double getTotalPrice(){
        double price1 = price*quantity;
        return price1;
    }
    public double getTotalWeight(){
        double weight1 = weight*quantity;
        return weight1;
    }
    public String findBook(){
        return name;
    }

}
