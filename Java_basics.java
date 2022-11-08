/*
*Java is an Object Oriented Programming language.
*Every function, constant and variable must appear in a class.
*To declare a variable, you have to declare its scope,
*its type, and optionally its value assigned to it using the = operator.
*The final keyword is used to create a constant.
*/
public class Tests {
    public int radiusOfCircle = 44;
    public final float VALUE_OF_PI = 3.1425;
    public static int add(int a, int b){
        return a + b;
    }
  
//This single line comment in java.
  
  public static float areaOfCircle(){
      return VALUE_OF_PI * radiusOfCircle * radiusOfCircle;
  }
/*
*To create a function (also called a method), we must define
*if it is public, protected, static, private or none. Then, we must specify its return
*type. This is followed by the function name and parameters
*in brackets. The parameter name must be preceeded by its type.
*/
    public int multi(int a, int b){
        if(b == 1){
          return a;
        }
        else{
          return add(a,multi(a, b-1));
        }
    }
}
/*
*The return statement simply tells us what the function can
*produce and how the variables are used to produce this
*result. There, variables and functions can be called as
*seen in the previous method.
*/
