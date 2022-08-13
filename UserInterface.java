

//UserInterface
//Yuxin Sun
//CS202-program4
//write the function that used in main and input function
import java.util.Scanner;



public class UserInterface {
    final String OS;
    protected Scanner input;

    public UserInterface()
    {
        OS=System.getProperty("os.name");
        input =new Scanner(System.in);
    }
    public int choose_menu()
    {
        int choose_function;
        System.out.print("Please enter the function you want to work\n" +
                "1 is add a object\n" +
                "2 is remove a object\n" +
                "3 is display all objects in the list\n");
        choose_function = input.nextInt();
        input.nextLine();
        return choose_function;
    }
    protected boolean again()
    {
        System.out.println(" 0 for quit the system, others for leave:");
        int check=input.nextInt();
        return check!=0;
    }


}
