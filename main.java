//test the function without data structure
//main
//Yuxin Sun
//CS202-program4


public class main extends UserInterface {

    public static void main(String[] args) {

        list a_list;
        a_list = new list();
        do {
            switch (a_list.choose_menu()) {
                case 1 -> a_list.add_object();
                case 2 -> a_list.delete();
                case 3 -> a_list.display();
            }
        } while (a_list.again());
    }
}
