package Practice;

/**
 * Created by SenthilKumar on 18/02/2016.
 */
public class ObjectAsParam1 {

    public static void main(String[] args) {
        Box b1 = new Box(5, 10);
        Box b2 = new Box(6,10);
        //Box b3 = b1;
        Box b3 = new Box(b1);

        if(b1.isEqual1(b3))
            System.out.println("b3 and b1 are equal");
        else
            System.out.println("b3 and b1 are not equal");

        if(b1.isObjectsEqual(b1,b2))
            System.out.println("b1 and b2 are equal");
        else System.out.println("b1 and b2 are not equal");

    }


}


class Box{

    int width;
    int height;

    Box(int w, int h){
       this.width = w;
        this.height = h;
    }

    Box(Box y){
        this.width = y.width;
        this.height = y.height;
    }

    public boolean isEqual1(Box x){
        if((this.width==x.width) && (this.height==x.height))
            return true;
        else
            return false;
    }

    boolean isObjectsEqual(Box z1, Box z2){
        if((z1.width==z2.width) && (z1.height==z2.height))
            return true;
        else
            return false;
    }

}