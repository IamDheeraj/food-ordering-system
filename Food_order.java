package food_order;

import java.util.Scanner;

public class Food_order {
	      static Bill object=new Bill();
          static Starter object1=new Starter();
          static Main_course object2=new Main_course();
          static Desert object3=new Desert();
          static Drinks  object4=new Drinks();
	public static void main(String[] args) {
		    int item,choice;
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("\t Welcome To My Hotel !\n\n\n ");
				
				do{
				System.out.println(" 1 : Starter \n 2 : Main Course \n 3 : Deserts  \n 4 : Drinks");
				item=sc.nextInt();
				switch (item)
				{
				case 1 :
				{
				    object1.item();
				}
				break;
				case 2 :
				{
					object2.item();
				}
				break;
				case 3 :{
					object3.item();
				}
				break;
				case 4 :
				{
					object4.item();
				
				}
				}
				System.out.println("Do you want add another item\n");
				System.out.println(" 1 Yes\n 2 NO\n");
				 
				choice=sc.nextInt(); 
				}while(choice==1);
			//	object1.total;
			System.out.println(object1.total);
			}
	}
		
}


