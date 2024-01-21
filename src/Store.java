import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Filter;

public class Store {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(8, 256, 10, "grey", "Dell");
        Laptop l2 = new Laptop(16, 256, 10, "black", "Lenovo");
        Laptop l3 = new Laptop(8, 512, 10, "grey", "Acer");
        Laptop l4 = new Laptop(32, 1024, 11, "black", "Redmi");
        Set<Laptop> laptops = new HashSet<>(Arrays.asList(l1, l2, l3, l4));
        List<Laptop> filterLaptops = (List<Laptop>) Laptop.filterResult((HashSet<Laptop>) laptops);
        System.out.println("Ноутбуки, удовлетворяющие требованиям: ");
        System.out.println(filterLaptops);

    }
}
