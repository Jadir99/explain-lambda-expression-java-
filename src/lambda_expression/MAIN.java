package lambda_expression;

public class MAIN {
	public static void main(String [] args) {
		
		MyInterface myInterface = new MyInterface() {
            @Override
            public int getValue() {
                return 17;
            }
        };
        System.out.println(myInterface.getValue());
	}	
}
