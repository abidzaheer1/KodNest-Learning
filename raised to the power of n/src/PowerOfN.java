
public class PowerOfN {
       int power(int a , int  n) {
    	   int res = 1;
    	   for(int i=1;i<=n;i++){
    		  res = res*n;  
    	   }
    	   return res;
       }
}