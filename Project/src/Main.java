import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Item item = new Item();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dc ID :");
        item.itemId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap Ten: ");
        item.Name = scanner.nextLine();
        System.out.println("Nhap san pham: ");
        item.Producer = scanner.nextLine();
        System.out.println("Nhap gia: ");
        item.Price = scanner.nextInt();
        System.out.println("Ket qua:");
        System.out.println(item.toString());
    }
}
