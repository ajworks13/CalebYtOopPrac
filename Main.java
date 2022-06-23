import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        
        //User u = new User();
        //u.set_name("Caleb");
        
        //Interface list/general... -v- Implementation
       // ArrayList<User> users = new ArrayList<User>();
       
        Student s = new Student();
        s.set_name("student");
        Teacher t = new Teacher();
        t.set_name("teacher");
        System.out.println(t.get_membership());
        System.out.println(s.get_verified());
        s.set_membership("Gold");
        System.out.println(s.get_membership());
       
       
        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);
        User.admins.add(new User("Caleb"));
        User.admins.add(new User("Bob"));
        User.admins.add(new User("Aneudy"));
        
        for(User u: User.admins){
            u.verify();
        }
        /*
        
        for(int i = 0; i < User.admins.size(); i++){
            System.out.println(users.admins.get(i).get_name());
        }
        for(User u : User.admins){
            System.out.println(u.get_name());
        }
        
        System.out.println(users.get(0).get_name());
        
        
        
        
       // User u2 = new User("Caleb","Silver");
        */


        /*
        System.out.println(u);
        System.out.println(u == u2); // false
        System.out.println(u.equals(u2)); // false
        System.out.println(u2.get_name());
        System.out.println(u2.get_membership());
        */
    }
}
