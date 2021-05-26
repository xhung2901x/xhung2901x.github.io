

public class Person implements Comparable {
    public String name;
    public int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        Person other = (Person) o;
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
    
    
}
