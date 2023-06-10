import java.util.Scanner;
public class Encapsulation
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
	int age = read.nextInt();
	Pupil pupil = new Pupil();
	pupil.setAge(age);
    }
}
class Pupil
{
    private int age;
    void setAge(int age)
    {
        if (age >6)
	    System.out.println("Welcome");
	else
	    System.out.println("Sorry");
    }
}
