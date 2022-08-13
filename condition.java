//condition
//Yuxin Sun
//CS202-program4
//write a condition
//just the deference of a class
//includes if, else, and logical
public class condition extends object {
    //define a condition
    protected int conditional_statement ;
    protected int logical;
    protected String variable_left;
    protected String variable_right;

    //default constructor
    condition() {
        variable_left = null;
        variable_right= null;
        conditional_statement = 0;
        logical = 0;
    }

    //copy constructor
    public condition(condition to_copy) {
        object_name = to_copy.object_name;//the object class
        conditional_statement = to_copy.conditional_statement;
        variable_left = to_copy.variable_left;
        variable_right = to_copy.variable_right;
        logical = to_copy.logical;
    }
    //read in function(add a condition)


    @Override
    public void read_in() {
        System.out.print("Please enter the name of the object\n");
        object_name = input.nextLine();
        System.out.print("""
                Please choose the conditional statement
                1 is if
                2 is else
                3 is if else
                Please enter your choose(1-3)
                """);
        conditional_statement = input.nextInt();
        input.nextLine();
        if(conditional_statement !=2) {
            input.nextLine();
            System.out.print("""
                    Please choose the logical of the condition
                    1 is less than
                    2 is less than or equal to
                    3 is greater than
                    4 is greater than or equal to
                    5 is equal to\040
                    6 is not equal to
                    Please enter your choose(1-6)
                    """);
            logical = input.nextInt();
            input.nextLine();
            System.out.print("Please enter the left variable of the condition\n");
            variable_left = input.nextLine();
            System.out.print("Please enter the right variable of the condition\n");
            variable_right = input.nextLine();
        }
        System.out.print("Success!  The object "+object_name+" is created! \n");
    }

    public void display() {
        String statement_type = null;
        if (conditional_statement == 1) {
            statement_type = "if ";
        }
        if (conditional_statement == 2) {
            statement_type = "else";
        }
        if (conditional_statement == 3) {
            statement_type = "if else";
        }
        String logical_type = null;
        if(logical==1){
            logical_type="<";
        }
        if(logical==2){
            logical_type="<=";
        }
        if(logical==3){
            logical_type=">";
        }
        if(logical==4){
            logical_type=">=" ;
        }
        if(logical==5){
            logical_type="==";
        }
        if(logical==6){
            logical_type="!=";
        }
        System.out.print(object_name + " is a condition.\n");
        if ( conditional_statement== 2) {
            System.out.print("The C++ version is \n");
            System.out.print( "else" + " \n");
            System.out.print("The python version is \n");
            System.out.print("else:  " +"\n");
        }
        if (conditional_statement!= 2) {
            System.out.print("The C++ version is \n");
            System.out.print( statement_type+ " (" + variable_left + " " + logical_type +" "+ variable_right + " )\n");
            System.out.print("The python version is \n");
            System.out.print(statement_type+ " " + variable_left + " " + logical_type +" "+ variable_right + ":\n");
        }
    }
}

