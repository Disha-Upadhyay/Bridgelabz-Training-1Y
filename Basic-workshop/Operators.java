public class Operators{
    public static void main(String[] args){
	
	int i=0;
	System.out.println("val"+i);
	i++;
	System.out.println("Val a"+i++);//1
	System.out.println("Val b"+i);//2
	++i;
	System.out.println("Val c"+i++);//3
	System.out.println("Val d"+i++);//4
	int z=i + i++ + ++i +i + ++i + i++;
	System.out.println(z);//40
	System.out.println(i);//9
	//int x = i - i++ - --i + i - ++i + i++;
	//System.out.println(x);
	//System.out.println(i);
	
	
	
	
	for(i=0;i<10;i++){
		System.out.println("i:"+i);
	}
	int j = 10;
	while(j>0){
		System.out.println("j: "+j);
		j--;
	}
	int k = 10;
	do{
		System.out.println("k : "+k);
		k--;
	}while(k>0);
	
	}
}