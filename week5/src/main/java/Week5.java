import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Week5 {
    static Connection connection = null;
    static PreparedStatement statement = null;
    public static void main(String[] args) {
        makeConnection();

        Brand brand = new Brand(0, "Adidas");
        Category category = new Category(0, "Casual");
        Product product1 = new Product(0, "Shoes", "for jogging", 0, 0, 100);
        Product product2 = new Product(1, "T shirt", "oversize", 0, 0, 200);
        addBrandToDb(brand);
        addCategoryToDb(category);
        addProductToDb(product1);
        addProductToDb(product2);
        printAllProducts();
    }

    private static void makeConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:7744/shop", "root", "password");
            if(connection != null) {
                System.out.println("connection successful");
            }
        }
        catch (Exception ex) {
            System.out.println("connection failed");
            ex.printStackTrace();
        }
    }

    private static void addProductToDb(Product product) {
        try {
            String query = "INSERT INTO product (id, title, description, categoryId, brandId, cost) VALUES(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setInt(1, product.getId());
            statement.setString(2, product.getTitle());
            statement.setString(3, product.getDescription());
            statement.setInt(4, product.getCategoryId());
            statement.setInt(5, product.getBrandId());
            statement.setInt(6, product.getCost());
            statement.executeUpdate();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void addBrandToDb(Brand brand) {
        try {
            String query = "INSERT INTO brand (id, title) VALUES(?, ?)";
            statement = connection.prepareStatement(query);
            statement.setInt(1, brand.getId());
            statement.setString(2, brand.getTitle());
            statement.executeUpdate();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void addCategoryToDb(Category category) {
        try {
            String query = "INSERT INTO category (id, title) VALUES(?, ?)";
            statement = connection.prepareStatement(query);
            statement.setInt(1, category.getId());
            statement.setString(2, category.getTitle());
            statement.executeUpdate();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printAllProducts() {
        try {
            String query = "SELECT * FROM product";
            statement = connection.prepareStatement(query);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Product product = new Product(
                        set.getInt("id"),
                        set.getString("title"),
                        set.getString("description"),
                        set.getInt("categoryId"),
                        set.getInt("brandId"),
                        set.getInt("cost"));

                System.out.println(product);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
