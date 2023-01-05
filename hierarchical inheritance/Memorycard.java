package lenovo;        //hierarchical inheritance // first child class 
import hp.*;
public class Memorycard extends Hardisk
                                      {
public static void main (String [] args)
                                      {
Memorycard m = new Memorycard();
m.limitstore();
m.storeimage();
m.storevideo();
}

}
