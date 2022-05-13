package s_operation;

// Using Switch statement in java demo arithmetic operations like add, sub, multiply, divide

public class Operations {
	int num1,num2;
	String operation;
	double result;
	
	Operations(int num1,int num2,String operation)
	{
		this.num1=num1;
		this.num2=num2;
		this.operation=operation;
		
		
	}
	void calculator() {
		
	switch(operation){
	case "add":
		result=num1+num2;
		System.out.println("the result is "+result);
		break;
	case "sub":
		result=num1-num2;
		System.out.println("the result is "+ result);
		break;
	case "mul":
		result=num1*num2;
		System.out.println("the result is "+ result);
		break;
	case "div":
		result=num1/num2;
		System.out.println("the result is "+ result);
		break;
	default:
		System.out.println("enter the valid operator");
		}
	}
	}
