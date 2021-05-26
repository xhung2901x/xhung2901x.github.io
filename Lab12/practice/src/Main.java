import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) {
        // su dung lop vo danh
        Sayable sayable = new Sayable() {

            @Override
            public String say() {
                // TODO Auto-generated method stub
                return "Hello!!!";
            }

        };
        System.out.println(sayable.say());

        // Su dung Lambda

        Sayable sayableUsingLambda = () -> {
            return "Hello lambda!!!";
        };
        System.out.println(sayableUsingLambda.say());

        // su dung lambda co 1 tham so
        Sayable2 sayable2 = (str) -> {
            return str;
        };
        System.out.println(sayable2.say("meo meo!!!"));

        // su dung lambda co nhieu tham so

        AddNumber addNumber = (a, b) -> {
            return a + b;
        };
        System.out.println("Tong hai so: " + addNumber.add2Number(5, 9));

        // su dung lop vo danh de tinh tong 2 so:
        AddNumber addNumber2 = new AddNumber() {

            @Override
            public int add2Number(int a, int b) {
                // TODO Auto-generated method stub
                return a + b;
            }
        };
        System.out.println(addNumber2.add2Number(10, 20));

        //ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Hung");
        list.add("Linh");
        list.add("Tam");
        list.add("Quan");

        //dung for each in thong tin
        for (String s : list) {
            System.out.println(s);
        }

        //dung Lambda in thong tin
        

        Collections.sort(list, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2);
            }
        
        });
        System.out.println("Danh sach sau khi sap xep: ");
        list.forEach(n -> System.out.println(n));

        //Su dung method reference 
        System.out.println("Su dung method reference: ");
        list.forEach(System.out::println);

        //Sap xep su dung Lambda
        Collections.sort(list, (String o1, String o2) -> {
            return o1.compareTo(o2);
        });
        System.out.println("list sau khi sap xep: ");
        list.forEach(n -> System.out.println(n));

        //in danh sach Person
        ArrayList <Person> danhSachPerson = new ArrayList<>();
        danhSachPerson.add(new Person("Hung", 28));
        danhSachPerson.add(new Person("Quan", 26));
        danhSachPerson.add(new Person("Nam", 24));
        Collections.sort(danhSachPerson, (p, p2) -> p.compareTo(p2));
        System.out.println("sap xep person");
        danhSachPerson.forEach(n -> System.out.println(n.toString()));
        
    }
}
