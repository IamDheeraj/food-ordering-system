package food_order;

import java.util.Scanner;

class Desert {
	Scanner sc=new Scanner(System.in);
	int choice,total;
	String menu_item;
  void item() {
	  System.out.println(" 1 : ice-cream \t\t Rs 20");
	  System.out.println(" 2 : Carrot pooding \t Rs 30");
	  System.out.println(" 3 : Kulfi \t\t Rs 40");
	  System.out.println(" 4 : Gulaab Jamun \t Rs 50");
	  System.out.print(" choose option : \n");
	  choice=sc.nextInt();
	  switch(choice) {
	  case 1 :
			System.out.println("ice-cream \t Rs 20 \n");
			menu_item="ice-cream \t Rs 20";
			total+=20;
			break;
		case 2 :
			System.out.println("Carrot pooding  \t Rs 30 \n");
			menu_item="Carrot pooding \t Rs 30";
			total+=30;
			break;
		case 3 :
			System.out.println("kulfi \t Rs 40 \n");
			menu_item="kulfi \t Rs 40";
			total+=40;
			break;
		case 4 :
			System.out.println("Gulab jamun \t Rs 50 \n");
			menu_item="Gulab jamun \t Rs 50";
			total+=50;
	  }
  }
}
