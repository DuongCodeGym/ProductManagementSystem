package listProject;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductManagementMenu {

    public void displayMenu(){
        System.out.println("Quan ly San Pham");
        System.out.println("1. Add new Product");
        System.out.println("2. Update product");
        System.out.println("3. Remove product");
        System.out.println("4. Search by ID");
        System.out.println("5. Display All");
    }

    public void menu(){
        ProductManagement productManagement = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            displayMenu();
            System.out.println("Please input choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    //nhap thong so tu ban phim:
                    Product p = new Product(1, "Iphone 14", 2000.0);
                    productManagement.add(p);
                    break;
                case 2:
                    //nhap thong so tu ban phim
                    break;
                case 3:
                    System.out.println("Xin nhap vao Id de xoa:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    productManagement.remove(id);
                    break;
                case 4:
                    System.out.println("Xin nhap vao Id de Tim Kiem:");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    Product pS = productManagement.searchByID(searchId);
                    if(pS != null)  System.out.println(pS);
                    System.out.println("Khong tim thay");
                    break;
                case 5:
                    System.out.println(productManagement.toString());
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
