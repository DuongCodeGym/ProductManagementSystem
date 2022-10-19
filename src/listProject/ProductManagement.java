package listProject;

import java.util.List;
import java.util.ArrayList;

public class ProductManagement {
    private List<Product> products = new ArrayList<>();

    public ProductManagement() {
    }

    public void add(Product p) {
        products.add(p);
    }

    public void remove(int id) {
        Product p = searchByID(id);
       // int index = products.indexOf(p);
        if(p!=null){
            products.remove(p);
        }
    }
    public void update(int id,Product newProduct){
        Product p = searchByID(id);
        p.setName(newProduct.getName());
        p.setPrice(newProduct.getPrice());
    }
    public Product searchByID (int id){
        for(Product p: products){
            if(p.getId()==id) return p;
        }
        return null;
    }
    public Product searByName(String name){
        for(Product p: products){
            if(p.getName().equals(name)) return p;
        }
        return null;
    }

    @Override
    public String toString() {
        return  products.toString();

    }
}
