import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String veggieInput, veganInput, gfInput;
        String r1, r2, r3, r4, r5;

        r1 = "Joe's Gourmet Burgers";// none of them
        r2 = "Main Street Pizza Company"; //not vegan
        r3 = "Corner Cafe";//yes to all
        r4 = "Mama's fine Italian";
        r5 = "The Chef's Kitchen"; //yes to all

        Scanner input = new Scanner(System.in);

        System.out.print("Vegetarian? ");
        veggieInput = input.next();
        System.out.print("Vegan? ");
        veganInput = input.next();
        System.out.print("Gluten-Free? ");
        gfInput = input.next();

        boolean ve = veggieInput.equalsIgnoreCase("y");
        boolean va = veganInput.equalsIgnoreCase("y");
        boolean gf = gfInput.equalsIgnoreCase("y");

        if(ve){
            if(va){
                if(gf){
                    System.out.println(r3 + " " + r5 + " is gluten-free, vegan, vegetarian");
                }else {
                    System.out.println(r4 + " is vegan and vegetarian");
                }
            }else{
                if (gf){
                    System.out.println(r2 + " is gluten-free and vegetarian");
                }else{
                    System.out.println("Restaurant is vegetarian only");
                }
            }
        } else {
            if (va){
                if(gf){
                    System.out.println("Restaurant is vegan and gluten-free");
                }
                else{
                    System.out.println("Restaurant is vegan only");
                }
            }else{
                if (gf){
                    System.out.println("Restaurant is gluten-free only");
                }else{
                    System.out.println(r1 + " is not vegetarian vegan or gluten-free");
                }
            }
        }


    }
}
