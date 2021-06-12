package homework4;

import java.util.ArrayList;
import java.util.Scanner;
 
public class Owner extends User{
    Scanner scan = new Scanner(System.in);
    private String name;
    private long id;
    private String pass;
    private String mail;
    private int phone;
    private String location;
   
    
    Owner(){
        this.name=null;
        this.id=0;
        this.ground=null;
        this.location=null;
        this.mail=null;
        this.owner=null;
        this.pass=null;
        this.phone=0;
    }

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
    
    ArrayList<String> nameList = new ArrayList();
    ArrayList priceList = new ArrayList();
    ArrayList periodList = new ArrayList();
    
    public ArrayList<String> display_name(){
        return nameList;
    }
    
    public void addGround(){
        System.out.println("To Add Playground, Please enter The Info");
        
        PlayGround ground  = new PlayGround();
        
        System.out.print("Name : ");
        ground.setName(scan.nextLine());
        nameList.add(ground.getName());
        
        System.out.print("Price : ");
        ground.setPrice(scan.nextInt());
        priceList.add(ground.getPrice());
        
        System.out.print("Period : ");
        ground.setPeriod(scan.nextInt());
        periodList.add(ground.getPeriod());
        
        System.out.print("You added Name : ");
        System.out.println(ground.getName());
        System.out.print("          Price : ");
        System.out.println(ground.getPrice());
        System.out.print("          Period : ");
        System.out.println(ground.getPeriod());
    }
}