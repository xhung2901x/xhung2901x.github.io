import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // ArrayList <Integer> arr = new ArrayList<Integer>();

        // for (int i = 0; i <= 100; i++) {
        //     arr.add(i);
        // }
        // System.out.println(arr);

        // ArrayList <Integer> soChan = new ArrayList<Integer>();

        // for (int i = 0; i <= 100; i++) {
        //     if(i%2==0){
        //         soChan.add(i);
        //         System.out.println(soChan);
        //     }
        // }
            
            // ArrayList <Person> person = new Person(); 
            // Scanner sc = new Scanner(System.in);

            // System.out.println("Nhap vao so nguoi: ");
            // int n = sc.nextInt();
            // sc.nextLine();
            // System.out.println("Nhap vao name : ");
            // String name = sc.nextLine();
            // System.out.println("Nhap vao tuoi : ");
            // int age = sc.nextInt();
            // sc.nextLine();

            // for (int i = 0; i < n; i++) {
            //     person.add(name, age);
            // }

            // for (Person persons : person) {
            //     System.out.println(person.toString());
            // }

                File myfile = new File("hung.txt");
                myfile.createNewFile();

                FileWriter fileWriter = new FileWriter(myfile);
                fileWriter.write("java core");
                fileWriter.close();
    }
}
