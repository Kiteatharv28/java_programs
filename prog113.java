class Person{

        void display(){

                Sring name="Atharv";
                int age=20;
		System.out.println("Name :"+name);
	        System.out.println("Age:"+ age);
        }
}

class Employee{

        void display(){

                String name="Atharv";
                int age=20;
                int salary=50000;
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary:"+salary);
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

