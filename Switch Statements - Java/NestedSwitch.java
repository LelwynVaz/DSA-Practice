import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int employeeID = in.nextInt();
        System.out.print("Enter Department: ");
        String department = in.next();


        switch (employeeID) {
            case 1:
                System.out.println("Lelwyn Vaz");
                break;
            case 2:
                System.out.println("Kunal Kushwaha");
                break;
            case 3:
                System.out.println("Enployee No 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No valid department");
                }
                break;
        
            default:
                System.out.println("Enter correct employeeID");
        }
    }
}
