package Practice;

import org.junit.Before;

/**
 * Created by SenthilKumar on 11/02/2016.
 */
public class Enum1 {

    public static void main(String[] args){
        Beer b = Beer.KF;
        System.out.println(b);

        switch (b){
            case KF:
                System.out.println("Kingfisher");
                break;
            case KO:
                System.out.println("KnockOut");
                break;
        }

        Beer[] c = Beer.values();
        for (Beer x1:c){
            System.out.println(x1);
        }
    }
}


enum Beer{
    KF,KO,RC;
}