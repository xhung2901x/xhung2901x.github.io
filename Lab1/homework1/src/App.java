import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.graalvm.compiler.replacements.StandardGraphBuilderPlugins.UnsafeGetPlugin;

public class App {
    public static void main(String[] args)  
    {
        String name2;
        String name1;
        int age1;
        int age2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap tuoi nguoi thu nhat: ");
        age1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten nguoi thu nhat: ");
        name1 = scanner.nextLine();
        System.out.println("Nhap tuoi nguoi thu hai: ");
        age2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten nguoi thu hai: ");
        name2 = scanner.nextLine();
        scanner.close();
        System.out.println("\n");
        System.out.println("Tuoi nguoi 1: " + age1);
        System.out.println("Ten nguoi 1: " + name1);
        System.out.println("Tuoi nguoi 2: " + age2);
        System.out.println("Ten nguoi 2: " + name2);;

        System.out.println("Do dai cua ten nguoi thu 1 la: " + name1.length());

        System.out.println("So sanh 2 chuoi ten nguoi thu 1 va thu 2: " + name1.equals(name2));

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormat = currentDateTime.format(dateTimeFormatter);
        System.out.println(dateFormat);

        

    }
}