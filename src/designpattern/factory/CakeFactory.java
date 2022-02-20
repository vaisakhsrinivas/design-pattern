package designpattern.factory;

/**
 * Created by vaisakh on 19/02/22.
 */
public class CakeFactory implements Factory {

    public Cake createCake (String cakeName) {

        Cake cake = null;

        if (cakeName.equals("BlackForest")){
            cake = new BlackForest();
        }

        return cake;
    }
}
