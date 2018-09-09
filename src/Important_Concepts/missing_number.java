package Important_Concepts;

public class missing_number {

	public static void main(String[] args) {
		int a []={-1,0,1,2,3,5,6,7,8,9,10};
		
		int sum =0;
		
		for (int i=0;i<a.length;i++){
			
			sum = sum + a[i];
			
		}System.out.println("sum is---> "+sum);
      
       int sum1=0;
       for (int j=-1;j<=10;j++){
    	   
    	   sum1= sum1+j;
       }
       System.out.println("the expected sum is --->"+sum1);
       
       int missingnumis= sum1-sum;
       System.out.println("the missing number is --->"+missingnumis);
	}

}
