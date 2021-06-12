package homework4;

public class Player extends User{
    private String name;
    private long id;
    private String pass;
    private String mail;
    private int phone;
    private String location;
    Owner owner;

    public String getName() {
        return name;
    }    
    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Player(){
        this.name=null;
        this.id=0;
        this.ground=null;
        this.location=null;
        this.mail=null;
        this.owner=null;
        this.pass=null;
        this.phone=0;
    }
    
    public void Book(){
        
    }     
}