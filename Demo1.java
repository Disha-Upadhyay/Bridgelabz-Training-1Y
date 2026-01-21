public class Demo1{
static int x = 19;
int z = 20;

public static void m2(){
    int y = 10;
	System.out.println("m2 local variable"+y);
}
public static void m1(){
    int y = 30;
	System.out.println("m1 local variable y"+y);
	m2();
}
public static void main(String[] args){  // command line arguement
    int y = 40;
	System.out.println("HelloWorld");
	System.out.println("main static variable x"+x);
	System.out.println("main local variable y"+y);
	m1();
	Demo1 obj = new Demo1();
	System.out.println("object-level-variable"+obj.z);
	
	System.out.println(args[0]);
	System.out.println(args[0]+args[1]);
	System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
}
}
    