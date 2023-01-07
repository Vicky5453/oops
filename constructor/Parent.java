
public class Parent             // constructor chaining 
{

public Parent()        // constructor               // third call
{
System.out.println("parent constructor");
}

public Parent(int a)   // constructor overload         // second call
{
this();
System.out.println("parent single args");
}
}
