public class CustomerProduct implements User, Product {
    private String login;
    private String password;
    private String name;
    private double price;
    private int rating;

    public CustomerProduct(String login, String password, String name, double price, int rating) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    public void buy() {
        System.out.println(login + " has bought " + name);
    }
}
