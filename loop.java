//loop
//Yuxin Sun
//CS202-program4
//write a loop
//transfer loop with c++ to python
//includes for, while


public class loop extends object{

    //variable that takes the value of the item inside the sequence on each iteration.
    protected String variable;
    protected int initial;
    protected int end;
    protected String body;
    protected int type;//while or for loop
    //default constructor
    loop()
    {
        variable=null;
        initial=0;
        end=0;
        body=null;
        type=0;
    }
    //copy constructor
    public loop(loop to_copy) {
        object_name=to_copy.object_name;
        variable = to_copy.variable;
        end=to_copy.end;
        initial=to_copy.initial;
        body=to_copy.body;
        type = to_copy.type;
    }

    //read in function(add a loop)


      @Override
      public void read_in() {


          System.out.print("Please enter the name of the object name\n");
          object_name=input.nextLine();
          System.out.print("Which kind of loop do you want to add?\n");
          System.out.print("Enter 1 to for loop\n");
          System.out.print("Enter 2 to while loop\n");
          type=input.nextInt();
          input.nextLine();
          if(type==1)
          {
              System.out.print("Please enter the name of the variable of the loop\n");
              variable=input.nextLine();
              System.out.print("Please enter the initial value (must be a number) of the variable\n");
              initial=input.nextInt();
              input.nextLine();
              System.out.print("When the variable larger or bigger than ");
              end=input.nextInt();
              input.nextLine();
              System.out.print("The loop will ended.\n");
              System.out.print("Please enter the print test (please add double quotes with string) in the loop\n");
              body=input.nextLine();
              System.out.print("Success！ You loop in c++ is .\n");
              System.out.print("for( int "+variable+" = "+initial+"; " + variable+" <= "+end+" ;" +"++"+variable+" )\n");
              System.out.print("{\n");
              System.out.print("print( "+body+" );\n");
              System.out.print("}\n");
          }
          if(type==2)
          {
              System.out.print("Please enter the name of the variable\n");
              variable=input.nextLine();
              System.out.print("Please enter the initial value (must be a number) of the variable\n");
              initial=input.nextInt();
              input.nextLine();
              System.out.print("When the variable larger or bigger than ");
              end=input.nextInt();
              input.nextLine();
              System.out.print("the loop will ended.\n");
              System.out.print("Please enter the print test (please add double quotes with string) in the loop\n");
              body=input.nextLine();
              System.out.print("Success！ You loop in c++ is .\n");
              System.out.print("int "+ variable +" = " +initial+" ;\n");
              System.out.print("while ("+variable+" <= " +end +" )");
              System.out.print("{\n");
              System.out.print("printf"+body+" );\n");
              System.out.print("++"+variable+";\n");
              System.out.print("}\n");
          }
        if(type!=1&&type!=2)
          {
              System.out.print("Sorry, we don't have this type.\n");
          }
      }

      public void display()
      {
              String loop_type=null;
              if(type==1)
                  loop_type="for loop";
              if(type==2)
                  loop_type="while loop";
              System.out.print(object_name+" is a " +loop_type+".  \n");
              if(type==1) {
                  System.out.print("The C++ version is ");
                  System.out.print("for( int " + variable + " = " + initial + "; " + variable + " <= " + end + " ;" + "++" + variable + " )\n");
                  System.out.print("{\n");
                  System.out.print("printf( " + body + " );\n");
                  System.out.print("}\n");
                  System.out.print("The Python version is \n");
                  System.out.print("for "+variable+" in range(" +initial+" ,"+end+"):\n");
                  System.out.print("     print( "+body+")\n");
              }
          if(type==2) {
              System.out.print("The C++ version is \n");
              System.out.print("int "+ variable +" = " +initial+" ;\n");
              System.out.print("while ("+variable+" <= " +end +" )");
              System.out.print("{\n");
              System.out.print("printf( "+body+" );\n");
              System.out.print("++"+variable+";\n");
              System.out.print("}\n");
              System.out.print("The Python version is \n");
              System.out.print(variable +" = " +initial +"\n");
              System.out.print("while "+variable+" <= " +end +":\n");
              System.out.print("print( "+body+" )\n");
              System.out.print(variable+"+=1\n");


          }

          }
      }
