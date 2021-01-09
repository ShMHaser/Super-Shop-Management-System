package shopchiefpro;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

 class User{
        String username;
        String password;
        String type;
        public User(){
            
        }
        public User(String username, String password, String type)
        {
            this.username = username;
            this.password = password;
            this.type = type;
        }
        public String getUsername()
        {
            return this.username;
        }
        public String getPassword()
        {
            return this.password;
        }
        
        
        
        
    };
public class UserDatabase {
    
   
    
    User logged_user = null;
    String file_name = "user_data";
    ArrayList<User> users = new ArrayList<User>(); 
    
    public UserDatabase()
    {
        this.load_data();
    }
    
    private void load_data()
    {
        try{
       File f = new File("res/"+file_name+".txt");
       Scanner fs = new Scanner(f);
       
       while(fs.hasNextLine()){
           String line = fs.nextLine();
           String[] as = line.split("\t");
           
           User user = new User(as[0], as[1], as[2]);
           
           this.users.add(user);
       }
       } catch(Exception e)
       {
           System.out.println("File Not FOUND!");
       }
    }
    
    private void save_data()
    {
         try {

            FileWriter file = new FileWriter("res/"+file_name+".txt",false);

            for (int i = 0; i < this.users.size(); i++) {
                User user = this.users.get(i);
                file.write(user.username+"\t" + user.password+"\t"+user.type + "\n");
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    
    public User get_user(String username)
    {
        for (int i = 0; i<this.users.size(); i++)
        {
            
            if (this.users.get(i).getUsername().equals(username)){
                return this.users.get(i);
            }
        }
        
        return null;
    }
    
    public void make_user(String username, String password, String type){
        
        User user = new User(username, password, type); 
        this.users.add(user);
        this.save_data();
        
        
    }
    
    public void delete_user(String username)
    {
        for (int i = 0; i<this.users.size(); i++)
        {
            
            if (this.users.get(i).getUsername().equals(username)){
                this.users.remove(this.users.get(i));
                break;
            }
        }
        this.save_data();
    }
    
    public boolean check_logged_in()
    {
        return this.logged_user != null;
        
    }
    
    public User get_current_user(){
        return this.logged_user;
    }
    
    public User login(String username, String password){
        User user = this.get_user(username);
       if ( user != null){
           if (user.getPassword().equals(password)){
               this.logged_user = user;
               return user;
       }
    }
       return null;
    }
       
    
   
    protected void finalize()
    {
        this.save_data();
    }
    
    
}
