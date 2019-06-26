final public class Book extends Product {

    private String author;
    private int pages;
    protected static int count = 0;

    // constructors

    public Book() {
        this.setCode("");
        this.setDescription("");
        this.setPrice(0);

        this.author = "";
        this.pages = 0;
        count++;
    }

    public Book(String pCode, String pDesc, double pPrice, String pAuthor, int pPage) {
        this.setCode(pCode);
        this.setDescription(pDesc);
        this.setPrice(pPrice);

        this.author = pAuthor;
        this.pages = pPage;
        count++;
    }

    // getters and setters


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return  "Code:               " + this.getCode() + "\n" +
                "Description:        " + this.getDescription() + "\n" +
                "Price:              " + this.getFormattedPrice(this.getPrice()) + "\n" +
                "Author:             " + this.author + "\n" +
                "Pages:              " + this.pages;
    }

    // Define an abstract method of super class
    public int getItemCount() {
        return count;
    }
}

