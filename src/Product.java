import java.text.NumberFormat;

abstract class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
        count++;
    }

    // Get and set accessors for the code, description, and price instance variables
    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "Code:               " + this.code + "\n" +
                "Description:        " + this.description + "\n" +
                "Price:              " + this.getFormattedPrice(this.price) + "\n";
    }

    public String getFormattedPrice(double valD) {
        // Use the NumberFormat class to format the price to 2 decimal places

        return NumberFormat.getCurrencyInstance().format(valD);
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }

    // Create an abstract method - i.e. all subclass should define this method
    abstract int getItemCount();
}