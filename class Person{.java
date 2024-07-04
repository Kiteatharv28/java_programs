class Person{

        void display(){

                String name="Atharv";
                int age=20;
        }
}

class Employee{

        void display(){

                String name="Atharv";
                int age=20;
                int salary=50000;
        }
}

class Demo{
public static void main(String [] args){
        Employee E1=new Employee();
        E1.display();

        Person P1=new Person();
        P1.display();
}
}
