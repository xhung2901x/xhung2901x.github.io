import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.graalvm.compiler.replacements.nodes.arithmetic.IntegerAddExactNode;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Toi ten");
        
    String str = "    Hello    ";
    System.out.println(str);
    System.out.println(str.trim());
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.length()); //lay kich thuoc cua chuoi
    String s1 = "JAVA";
    String s2 = "HTML";
    System.out.println(s1.equals(s2));  //so sanh 2 chuoi (giong nhau = true; khac = false)

    enum Season 
    {
        WINTER, SUMMER, SPRING, AUTUMN
    }
    Season season = Season.SPRING;
    System.out.println(season);

    Season season2 = Season.AUTUMN;
    System.out.println(season2);

    LocalDate currentDate = LocalDate.now();
    System.out.println(currentDate);   //lay ngay hien tai

    LocalTime currentTime = LocalTime.now();
    System.out.println(currentTime);    //Lay gio hien tai

    LocalDateTime currentDateTime = LocalDateTime.now();    //lay ngay va gio
    System.out.println(currentDateTime);

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");    //dinh dang thoi gian
    String dateFormat = currentDate.format(dateTimeFormatter);
    System.out.println(dateFormat);

    final double PI = 3.14;    //khai bao Hang So

    int a = 5;                      //ep kieu du lieu tu nho sang kieu du lieu lon
    long b = a;
    System.out.println(b);

    double i = 5.6;
    int j = (int) i;
    System.out.println(j);          //ep kieu du lieu lon sang nho

    Scanner input = new Scanner(System.in);
    String name, address;
    int age;
    System.out.println("Nhap ten: ");
    name = input.nextLine();
    System.out.println("Nhap tuoi: ");
    age = input.nextInt();
    System.out.println("Nhap dia chi: ");
    address = input.nextLine();
    

    } 
}


