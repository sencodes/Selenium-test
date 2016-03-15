package Practice;

/**
 * Created by SenthilKumar on 01/02/2016.
 */
public class EnumExample {

    public static void main(String[] args){

        PlanTest p1 = new PlanTest(PlanTest.planets.Venus);
        p1.planetdesc();


    }

}

class PlanTest{



    public enum planets{
        Mercury,Venus,Earth,Mars
    }

    planets pla1;

    PlanTest(planets pla1){
        this.pla1 = pla1;
    }

    public void planetdesc(){
        switch (pla1) {
            case Mercury:
                System.out.println("Planet is One");
                break;
            case Venus:
                System.out.println("Planet is Two");
                break;

            default:
                System.out.println("Planet is default");

        }

    }


}
