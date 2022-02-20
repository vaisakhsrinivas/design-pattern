package designpattern.factory;

/**
 * Created by vaisakh on 19/02/22.
 */
public class CakeTest {

    public static void  main (String args[]){

        Cake cake = null;
        Factory factory = new CakeFactory();
        cake = factory.createCake("BlackForest");
        cake.aboutCake();;
        cake.recipe();

    }
}
