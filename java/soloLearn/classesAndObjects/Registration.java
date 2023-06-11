import java.util.Scanner;
public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	Guest guest = new Guest();
	guest.name = sc.nextLine();
	guest.secondName = sc.nextLine();
	guest.age = sc.nextInt();
	guest.room = sc.nextInt();
	guest.getData();
    }
}
class Guest {
    String name;
    String secondName;
    int age;
    int room;
    void getData() {
	System.out.println("My name is: "+this.name+" "+this.secondName+" i am :"+this.age+"years old and my room is: "+this.room);
    }
}
