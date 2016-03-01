package packone;

/**
 * Created by SenthilKumar on 30/11/2014.
 */
class Onetest {

public static void main(String[] args) {

    Person p1 = new Person();
    p1.name = "Anderson";
    p1.age = 2;
    System.out.println("Name of person 1 is "+p1.name);
    System.out.println("Age of person 1 is "+ p1.age);

    Person p2 = new Person();
    p2.name = "Bell";
    System.out.println("Name of person 2 is "+p2.name);

    String xc = "India";
    String bling = p1.printname(xc);
    System.out.println(bling);

    int retireage = 65;
    p1.agecalc(retireage);
    System.out.println("");
    


}
}



class Person{

    String name;
    int age;

    String printname(String z1){
        System.out.println("Name is "+ z1);
        return z1;
    }

    void agecalc(int retage){
        int ret = retage - age;
        return;

    }

}