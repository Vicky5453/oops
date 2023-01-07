
public class Child extends Parent
{
public static void main (String [] args)
{
//Child ch = new Child();
Child ch1 = new Child(5);
}

public Child()       // constructor
{
System.out.println("child constructor");
}

public Child(int a)     // constructor overload      // first call
{
super(a);        // Explicit call
System.out.println("child single args");
}
}

