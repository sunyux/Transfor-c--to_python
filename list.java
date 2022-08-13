//Yuxin Sun
//CS202-program4
//the data structure of the object class
//it will be a Linked Linear List

public class list extends UserInterface{
    private object head;
    protected String name_list;
    //default constructor
    list()
    {
        head=null;
    }
    //create a list
    public list(String name_to_add)
    {
        head=null;
        name_list=name_to_add;
    }
    //choose the type of object
    public void add_object()
    {
        object new_object=null;
        int choose;
        System.out.print("Which kind of object do you want to add?\n");
        System.out.print("Enter 1 to loop\n");
        System.out.print("Enter 2 to function deference\n");
        System.out.print("Enter 3 to for condition\n");
        choose=input.nextInt();
        input.nextLine();
        if(choose==1)
            new_object=new loop();
        if(choose==2)
            new_object=new function_def();
        if(choose==3)
            new_object=new condition();
        new_object.read_in();
        insert(new_object);
    }
    //insert a object to the list
    protected void insert(object to_add)
    {
        if(head==null)
        {
            head=to_add;
        }
        else
        {
            to_add.set_next(head);
            head=to_add;
        }

    }

    //display a list
    public void display()
    {
        if(head==null)
        { System.out.println("The list is empty!");
            return;}
        display(this.head);
    }
    public void display(object current)
    {
        if(current==null)
            return;
        current.display();
        display(current.get_next());
    }
    //display current for the delete function
    public void display_current(object current)
    {
        if(current==null)
            return;
        current.display();
    }
    //remove a object in the list
    public void delete()
    {

        System.out.print("Please enter the object name you want to delete?\n");
        String name_rm;
        name_rm=input.nextLine();
        int error=delete(name_rm,this.head);//check the item exist
        if(error==0)
         System.out.print("Sorry we don't have this item\n");
        else
            System.out.print("Delete it!\n");
    }
    protected int delete(String name_rm,object head)
    {
        if(head==null)
            return 0;
        if(head.object_name.equals(name_rm))
        {
            return delete(head)+1;
        }
        return delete(name_rm,head.get_next());
    }
    protected int delete(object current)
    {
        if(current==null)
        {
            return 0;
        }
        System.out.print("We will delete the \n");
        display_current(current);
        if(current==this.head)
        {
            if(head.get_next()!=null)
            {
                head=head.get_next();
            }
            else
            {
                head=null;
            }
        }
        else
            delete(current.get_next());

        return 1;

    }

}
