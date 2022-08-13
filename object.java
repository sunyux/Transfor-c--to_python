//object class
//Yuxin Sun
//CS202-program4
 //base class of the program
//include the name of the object
//the abstract base class

abstract class object extends UserInterface {

    protected String object_name;
    protected object next;
    //default constructor
    object(){
        next=null;
    }
    public object(object to_copy)
    {
        object_name=to_copy.object_name;
        next=null;
    }
    //virtual function
    public abstract void read_in();
    public object set_next(object current)
    {
        this.next=current;
        return this.next;

    }

    public object get_next()
    {
        return this.next;
    }
    //virtual display function
    protected abstract void display();

}
