package designpattern.factory;

/**
 * Created by vaisakh on 19/02/22.
 */
public class BlackForest extends Cake {

    public BlackForest(){
        setName("Blk Forest");
        setPrice(450);
        setType("Eggless");
    }

    public void recipe(){
        System.out.println("---BlackForest Recipe---");
        System.out.println("Sieve together Maida and Cocoa powder");
        System.out.println("Add Milk and Vanilla essence");
        System.out.println("Top with Whipped Cream and Cherries");
        System.out.println("Chill and Serve");
    }

    public void myFans() {
        System.out.println("Both adults and Kids love me");

    }
}
