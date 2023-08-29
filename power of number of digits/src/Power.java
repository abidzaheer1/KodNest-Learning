
public class Power {
 int p(int a){
	int count=0;
	int num=a;
	while(a!=0) {
		a=a/10;
		count++;
		
	}
	System.out.println("no of digits : "+count);
	int res = 1;
	for(int i=1;i<=count;i++) {
		res= res*num;
	}
//	System.out.println(res);
	return res;
 }
}
