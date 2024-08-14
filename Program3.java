//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
 class program3thing {
public static void main(String[] args){
 Scanner Width = new Scanner(System.in);
 Scanner Height= new Scanner(System.in);
 System.out.println("enter width ");
 int width = Width.nextInt();
 System.out.println("enter Height");
 int height = Height.nextInt();
 System.out.println("the width is "+ width);
 System.out.println("the height is" + height);
 int area = (width * height);
 int perimeter = (2 * width) + (2 * height);
 System.out.println("the area is " + area);
 System.out.println("the perimeter is " + perimeter);

 }
}
//Paste console output below:
/*


*/
