import java.util.*;
class Product{
    int id;
    String Name;
    float Price;
    Product(int id, String Name, float Price){
        this.id = id;
        this.Name = Name;
        this.Price = Price;
    }
}
public class Test1 {
    public static void main(String[] args) {
        List<Product> PL = new ArrayList<Product>();
        PL.add(new Product(1, "HP", 56000f));
        PL.add(new Product(1, "Asus", 80000f));
        PL.add(new Product(1, "Lenevo", 30000f));
        PL.add(new Product(1, "MackBook", 110000f));
        PL.add(new Product(1, "Dell", 40000f));
        PL.add(new Product(1, "MSI", 70000f));
        System.out.println("Filtered Products are: ");
        PL.stream()
        .filter(p->p.Price > 70000)  //Filtering Price
        .map(pm->pm.Price) //Fetching Price
        .forEach(System.out::println); //Printing the filtered list

    }
}
