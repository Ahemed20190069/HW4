package homework4;
import java.util.Scanner;

public class PlayGround {
    Scanner scan  = new Scanner(System.in);
    
    private static String name;
    private static int price;
    private int time;
     
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getPeriod() {
        return time;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setPeriod(int period) {
        this.time = period;
    }
    public PlayGround(){}
    
}