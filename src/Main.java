import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int score = 0;
       int index;
       String block ="";
       String ctool;
       String etool;
       int tool_index;
       Scanner scanner = new Scanner(System.in);

   while (Tools.dura()) {
       index = Blocks.randomb();
       block = Blocks.blocks.get(index).getB();
       ctool = Blocks.blocks.get(index).getCtool();
       System.out.println("\nYou found "+ block);
       System.out.print("Pick a tool(Pickaxe/Sword/Shovel): ");
       etool = scanner.next();
       if (etool.equalsIgnoreCase("Pickaxe")){tool_index=2;}
       else if (etool.equalsIgnoreCase("Sword")){tool_index=0;}
       else if (etool.equalsIgnoreCase("Shovel")){tool_index=1;}
       else {
           System.out.println("\nInvalid Tool, Every tool lost some durability");
           tool_index = 3;
           Tools.tools.get(0).cDurability();
           Tools.tools.get(1).cDurability();
           Tools.tools.get(2).cDurability();
           continue;
       }
       if (etool.equalsIgnoreCase(ctool)) {
           score++;
           Tools.tools.get(tool_index).cDurability();
           System.out.println("Correct Tool");
           System.out.println(ctool + " lost 5 durability");
           System.out.println("remaining durability: " + Math.max(0,Tools.tools.get(tool_index).getDurability()));

       } else {
           Tools.tools.get(tool_index).iDurability();
           System.out.println("Wrong tool");
           System.out.println(Tools.tools.get(tool_index).getT() + " lost 20 durability");
           System.out.println("remaining durability: " + Math.max(0,Tools.tools.get(tool_index).getDurability()));
       }


   }
        System.out.println("Final Score: "+ score);

    }
}