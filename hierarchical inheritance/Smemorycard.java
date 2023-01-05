package lenovo;          // hierarchical inheritance //second child class  
import hp.*;
public class Smemorycard extends Hardisk
                                       {
public static void main (String [] args)
                                       {
Smemorycard m = new Smemorycard();
m.limitstore();
m.storeimage();
m.storevideo();
}

}
