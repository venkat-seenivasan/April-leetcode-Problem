// Count Symmetric Integers


public class Leetcode_2843
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int low=1000;
		int high=1099;
		int count=0;
		for(int i=low; i<=high; i++) {
			String strNumber = String.valueOf(i);
			if(strNumber.length()%2==0){
			    int mid=strNumber.length()/2;
			    
			    String left=strNumber.substring(0,mid);
			    String right=strNumber.substring(mid);
                
                // int num1 = Integer.parseInt(left);
                // int num2 = Integer.parseInt(right);
                
                int x=0;
                int y=0;
                
                // int res1=0;
                // int res2=0;
                // while(num1 >0 || num2 >0){
                //     x=x+num1%10;
                //     y=y+num2%10;
                    
                //     num1=num1/10;
                //     num2=num2/10;
                    
                // }
                for (int j = 0; j < mid; j++) {
                    x = x + (left.charAt(j) - '0');
                    y = y + (right.charAt(j) - '0');
                }
                if(x == y){
                    count =count+1;
                }
//dfjd
			}
		}
		 System.out.println(count);

	}
}