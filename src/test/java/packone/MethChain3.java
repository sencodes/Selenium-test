package packone;

/**
 * Created by SenthilKumar on 27/01/2016.
 */
public class MethChain3 {

    public static void main(String[] args){

        Stud3 s3 = new Stud3();
        s3.setNameAndAge("SenK",56).setId(998521).disp();
    }

}


class Stud3{

    String name;
    int age;
    int id;

    public Stud3 setNameAndAge(String name, int age){
        this.name = name;
        this.age = age;
        return this;

    }

    public Stud3 setId(int id){
        this.id = id;
        return this;
    }

    public void disp(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Id is "+id);
    }
}
