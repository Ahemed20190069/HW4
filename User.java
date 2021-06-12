package homework4;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Scanner scan  = new Scanner(System.in);
       
    Player player = new Player();
    Owner owner = new Owner(); 
    PlayGround ground = new PlayGround();
    
    ArrayList<Owner> ownerList = new ArrayList();
    ArrayList<Player> playerList = new ArrayList();
       
    public User(){}    
    public void Register(){
        System.out.println("Are You 1- Owner");
        System.out.println("        2- Player");
        int choise_1 = scan.nextInt();
        if(choise_1 == 1){
            System.out.print("Name : ");
            owner.setName(scan.next());

            System.out.print("ID : ");
            owner.setId(scan.nextLong());

            System.out.print("Pass : ");
            owner.setPass(scan.next());

            System.out.print("Mail : ");
            owner.setMail(scan.next());

            System.out.print("Phone : ");
            owner.setPhone(scan.nextInt());

            System.out.print("Location : ");
            owner.setLocation(scan.next());
            
            ownerList.add(owner);
            owner.addGround();
            
        }
        else if(choise_1 == 2){
            System.out.print("Name : ");
            player.setName(scan.nextLine());

            System.out.print("ID : ");
            player.setId(scan.nextLong());

            System.out.print("Pass : ");
            player.setPass(scan.next());

            System.out.print("Mail : ");
            player.setMail(scan.nextLine());

            System.out.print("Phone : ");
            player.setPhone(scan.nextInt());

            System.out.print("Location : ");
            player.setLocation(scan.nextLine());
            
            playerList.add(player);
            
            player.Book();
        }
    }     
}