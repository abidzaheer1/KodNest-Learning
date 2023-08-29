
public class AmstrongNumber {
   int amsCal(int a ) {
			int cal = 0;
			int LastDigi =0;
			while(a!=0) {
				LastDigi = a%10;
				a=a/10;
				cal = cal+(LastDigi*LastDigi*LastDigi);	
			}
			return cal;
		 }
   }

