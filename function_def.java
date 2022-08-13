//function_def
//Yuxin Sun
//CS202-program4
//define a function
//just the deference of a class

public class function_def extends object {
    //define a function
    protected String return_type;//just for the c++
    protected String function_name;
    protected String argument_type;//for c++
    protected int pass_by;//for c++
    protected String argument_name;

    //default constructor
    function_def() {
        return_type = null;
        function_name = null;
        argument_type = null;
        pass_by = 0;
        argument_name = null;
    }

    //copy constructor
    public function_def(function_def to_copy) {
        object_name = to_copy.object_name;//the object class
        return_type = to_copy.return_type;
        function_name = to_copy.function_name;
        argument_type = to_copy.argument_type;
        pass_by = to_copy.pass_by;
        argument_name = to_copy.argument_name;
    }
    //read in function(add a function deference)


    @Override
    public void read_in() {
        System.out.print("Please enter the name of the object name\n");
        object_name = input.nextLine();
        System.out.print("You will define a function after add all information \n");
        System.out.print("Please enter the function name\n");
        function_name = input.nextLine();
        System.out.print("Please enter the return type of the function\n");
        return_type = input.nextLine();
        System.out.print("Sorry the system only can add less than one argument in the function\n");
        System.out.print("""
                Please enter the passing type of the argument
                0 is no argument
                1 is passing by value
                2 is passing by reference
                3 is passing by pointer
                Please enter your choose(0-3)
                """);
        pass_by = input.nextInt();
        input.nextLine();
        if (pass_by != 0) {
            System.out.print("Please enter the argument type of the function\n");
            argument_type = input.nextLine();
            System.out.print("Please enter the argument name of the function\n");
            argument_name = input.nextLine();
        }
        System.out.print("Success!  You define the function " + function_name + "\n");
    }

    public void display() {
        String pass_type = null;
        if (pass_by == 1) {
            pass_type = " ";
        }
        if (pass_by == 2) {
            pass_type = "& ";
        }
        if (pass_by == 3) {
            pass_type = "* ";
        }
        System.out.print(object_name + " is a function definitions\n");
        if (pass_by == 0) {
            System.out.print("The C++ version is ");
            System.out.print(return_type + " " + function_name + " ( ) \n");
            System.out.print("The python version is ");
            System.out.print("def " + function_name + " ( ):\n");
        }
        if (pass_by != 0) {
            System.out.print("The C++ version is \n");
            System.out.print(return_type + " " + function_name + " ( " + argument_type + " " + pass_type + " " + argument_name + " )\n");
            System.out.print("The python version is \n");
            System.out.print("def " + function_name + " ( "+ argument_name+" ):\n");
        }
    }
}
