import java.lang.reflect.Method;

public class HelloWorldAnonymousClasses {
    interface HelloWorld{
        public void greet();
        public void greetSomeOne(String name);
    }
    class EnglishGreet implements HelloWorld{
        @Override
        public void greet(){
            greetSomeOne("John");
        }

        @Override
        public void greetSomeOne(String namePerson){
            namePerson = namePerson;
            System.out.println("Hello" + namePerson);
        }

        EnglishGreet englishGreet = new EnglishGreet();

        //sử dụng anynomous inner class
        HelloWorld spanishGreet = new HelloWorld(){
            String name;

            @Override
            public void greet(){
                greetSomeOne("Mando");
            }

            @Override
            public void greetSomeOne(String nameSomeOne){
                name = nameSomeOne;
                System.out.println("Hola " + name);
                Method();
            }

            
        }
    }
}
