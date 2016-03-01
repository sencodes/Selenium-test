package packone;

/**
 * Created by SenthilKumar on 27/01/2016.
 * See in youtube - Method Chaining - https://www.youtube.com/watch?v=5ClM14coGAg
 */
public class MethChain1 {

    public static void main(String[] args){

        Stud1 s1 = new Stud1();
        s1.setNameAndAge("Senthil",33);
        s1.setId(15999);
        s1.disp();
    }

}


class Stud1{

    String name;
    int age;
    int id;

    public void setNameAndAge(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void setId(int id){
        this.id = id;
    }

    public void disp(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Id is "+id);
    }
}
