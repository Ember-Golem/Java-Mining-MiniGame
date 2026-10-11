import java.util.ArrayList;
import java.util.Random;

public class Blocks {

    private String b;
    private String ctool;

    public Blocks(String b ,String ctool) {
        this.b = b;
        this.ctool = ctool;
    }

    public String getB() {
        return b;
    }

    public String getCtool() {
        return ctool;
    }

    static ArrayList<Blocks> blocks = new ArrayList<>();
    static Random rand =   new Random();

    static {

        blocks.add(new Blocks("Dirt","Shovel"));
        blocks.add(new Blocks("Cobweb","Sword"));
        blocks.add(new Blocks("Gravel","Shovel"));
        blocks.add(new Blocks("Stone","Pickaxe"));
        blocks.add(new Blocks("Granite","Pickaxe"));


    }

    //generate random block
    public static int randomb(){

        return rand.nextInt(blocks.size());

    }

}