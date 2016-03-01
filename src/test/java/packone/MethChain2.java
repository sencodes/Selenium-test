package packone;

import org.junit.Test;

/**
 * Created by SenthilKumar on 27/01/2016.
 */
public class MethChain2 {

    //public static void main(String[] args){
    @Test
    public void testmain(){
        Stud2 s2 = new Stud2("Sen",34);
        //s1.setNameAndAge("Senthil",33);
        //s2.setId(15999);
        //s2.disp();
        s2.setId(991).disp();
    }

}


class Stud2{

    String name;
    int age;
    int id;

    public Stud2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Stud2 setId(int id){
        this.id = id;
        System.out.println(this);
        return this;
    }

    public void disp(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Id is "+id);
    }
}
