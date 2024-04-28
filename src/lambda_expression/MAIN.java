package lambda_expression;
import java.lang.Math;
public class MAIN {
	public static void main(String [] args) {
		

		// MyInterface myInterface = new MyInterface() {
//		     @Override
//		     public int getValue() {
//		         return 17;
//		     }
		// };
		// System.out.println(myInterface.getValue());

		// //with out parametres 

		// MyInterface inter=()-> (int)(Math.random()*4);
		// System.out.println(inter.getValue());
        
		
		
        //with  parametres 
        
        MyInterface inter=(a,b)-> {
        	int s=a+b;	
        	return s;
        };
        System.out.println(inter.getValue(5,7));
        		
	}	
}
