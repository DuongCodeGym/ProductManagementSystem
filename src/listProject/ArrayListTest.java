package listProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args){
        List<Integer> lists = new ArrayList<>();

        lists.add(5);//0
        lists.add(3);//2
        lists.add(1,2);//1
        //lists.remove(1);
        System.out.println(lists.get(1));

        lists.set(1,6);

        System.out.println(lists);

        List<String> stringLists = new ArrayList<>();
        stringLists.add("Thanh");
        stringLists.add("Mai");
        stringLists.add("Tung");
        stringLists.add(1,"An");

        System.out.println(stringLists);

        List<Product> products = new ArrayList<>();
        Product p1 = new Product(1,"Iphone 11", 1000.0);
        Product p2 = new Product(2,"Iphone 14",2000.0);
        Product p3 = new Product(3,"Samsung Galaxy S", 1500.0 );

        products.add(p1);
        products.add(p2);
        products.add(p3);

        System.out.println(products);
    }

}
