package designpattern.factory;
import java.util.Scanner;

/**
 * Created by vaisakh on 19/02/22.
 */
public class CakeTest {

    public static void  main (String args[]){

        Cake cake = null;

        System.out.println("Available flavors for the cake : BlackForest/BlueBerry/Strawberry");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        scanner.close();

        Factory factory = new CakeFactory();
        cake = factory.createCake(choice);
        cake.aboutCake();
        cake.recipe();
        cake.packCake();

    }
}
