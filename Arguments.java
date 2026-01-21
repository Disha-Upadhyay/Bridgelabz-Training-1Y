public class Arguments{
static int x = 19;
int z = 20;

void m3(){
System.out.println("m3 static var x "+x); //90
System.out.println("m3 object level var x "+z); //20
}
public static void m2(){
    int y = 10;
	System.out.println("m2 static variable x before "+x); //80
	x = 90;
	Arguments obj = new Arguments();
    System.out.println("object level var "+z); //20
	System.out.println("m2 static variable x after "+x); //90
	System.out.println("m2 local variable  "+y); //10
}
public static void m1(){
    int y = 30;
	System.out.println("m1 static variable x"+x); //70
	System.out.println("m1 local variable "+y); //30
	x = 80;
	m2();
}
public static void main(String[] args){  // command line arguement
    int y = 40;
	System.out.println("HelloWorld");
	System.out.println("main static variable x"+x);
	System.out.println("main local variable y"+y);
	x = 70;
	m1();
	Arguments obj = new Arguments();
	System.out.println("object-level-variable"+obj.z);
	obj.m3();
	System.out.println(args[0]);// for run this type java Demo1 1 2
	
	System.out.println(args[0]+args[1]);
	System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
}
}
    