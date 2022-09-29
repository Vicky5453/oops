class laptop1
{
String modelName="256";
void playgames()
{
System.out.println(modelName);
}
}
class store
{
public static void main(String [] args)
{
laptop1 hp=new laptop1();
System.out.println(hp.modelName);
hp.playgames();
}
}

