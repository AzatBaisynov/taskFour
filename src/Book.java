public class Book {
    private String code;
    private double price;
    private int year;

    public Book(String code, double price, int year) {
        this.code = code;
        this.price = price;
        this.year = year;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" + code + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
