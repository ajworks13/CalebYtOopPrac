import java.util.List;

public class User{
    private String name;
    private String membership = "Bronze";
    
    boolean verified = false;
    
    void set_verified(boolean verified){
        this.verified = verified;
    }
    
    boolean get_verified(){
        return this.verified;
    }
    
    public static List<User> admins;
    
    void verify(){
        System.out.println("Verifying...");
        set_verified(true);
    }
    
    public static void print_admin_names(){
        for(User u: admins){
            System.out.println(u.get_name());
        }
    }
    
    public User(String name){
        set_name(name);
    }
    
    // overridding
    public String toString(){
        return get_name() + " " + get_membership();
    }
    
    // overriding 
    public boolean equals(User u2){
        if(get_name() == u2.get_name() 
            && get_membership() == u2.get_membership()){
            return true;
        }else{
            return false;
        }
    }
    
    // default constructor
    public User(){
        
    }
    
    // Encapsoulation
    public User(String name, String membership){
        set_name(name);
        set_membership(membership);
    }
    
    void set_name(String name){
        this.name = name;
    }
    
    void set_membership(String membership){
        this.membership = membership;
    }
    
    String get_name(){
        return this.name;
    }
    
    String get_membership(){
        return this.membership;
    }
}
