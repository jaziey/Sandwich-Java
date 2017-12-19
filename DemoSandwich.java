import java.util.Scanner;

public class DemoSandwich {

	public static void main(String[] args) {
		 
		Sandwich tuna = new Sandwich();
		Scanner keyboard = new Scanner(System.in);
		String meat;
		double price;
		String have;
		String want;
		
		System.out.println(" Welcome to my sandwich shop");
		System.out.println("Do you want your bread toasted? ");
		want = keyboard.nextLine();
		if (want.equals("Yes") || (want.equals("yes")) || want.equals("YES"))
			tuna.setToasted(true);
		else
			tuna.setToasted(false);
		
		System.out.println("Enter The brand of tuna you want to eat ");
	//	System.out.println("We may have Starkist");
		meat = keyboard.nextLine();
		tuna.setMeat(meat); 
		System.out.println("Hey Milo! Do we have " + tuna.getMeat() + " for the customer?");
		if(tuna.getMeat().equals("Starkist")) {
			System.out.println("Great, coming right up");
		}else {
		 System.out.println("\nSorry, we only have Starkist right now.");
		}
		tuna.setBread("wheat");
		
		System.out.println("Oh! we have " + tuna.getBread() + " bread. \nI know you prefer " + tuna.getBread() + " to white.");
        System.out.println("What is the sandwich price on your coupon? \nWe are running a half off special today.");
        price = keyboard.nextDouble();
        tuna.setPrice(price);
        System.out.println("Ok, $" + (tuna.getPrice())/2 + " it is! ");
        System.out.println("Milo! one " + tuna.getMeat() + " sandwich, on " + tuna.getBread()+ " bread, ");
        if(tuna.isToasted() == true) {
        System.out.print(" toasted");
        }else
        	System.out.print("un-toasted");
        
       
		
	}

}

 