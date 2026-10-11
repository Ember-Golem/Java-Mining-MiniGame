import java.util.ArrayList;
import java.util.Scanner;

public class Tools {
    Scanner scanner = new Scanner(System.in);

    private String t;
    private int durability;

    public Tools(String t, int durability){

        this.t = t;
        this.durability = durability;

    }

    public String getT() {
        return t;
    }

    public int getDurability() {
        return durability;
    }

    public void cDurability() {
        this.durability = durability-5;
    }

    public void iDurability() {
        this.durability = durability-20;
    }

    static ArrayList<Tools> tools = new ArrayList<>();

    static {

        tools.add(new Tools("Sword",50));
        tools.add(new Tools("Shovel",50));
        tools.add(new Tools("Pickaxe",50));

    }
    public static boolean dura(){
        boolean durbool = true;

        for (int i = 0; i < tools.size();i++) {

            if ((tools.get(i)).getDurability() <= 0){
                String Btool = (tools.get(i).getT());
                System.out.println(Btool + " broke");
                System.out.println("durability");
                durbool = false;
                break;
            }else {
                durbool = true;
            }
        }

        return durbool;

    }


}