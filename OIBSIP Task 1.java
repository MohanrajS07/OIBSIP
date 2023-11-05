package OIBSIP;

import java.util.Scanner;
class ReservationSystem{
	String LoginId;
	String Password;
	  public void register() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("\nLogin Id: ");
	        this.LoginId = sc.nextLine();
	        System.out.print("\nPassword: ");
	        this.Password = sc.nextLine();
	        while(Password.length()< 6){
	            System.out.println("Enter a Strong password");
	            this.Password=sc.nextLine();
	            System.out.println("\nRegistration completed.,kindly login");}
	        }
	        public boolean login() {
	            boolean isLogin = false;
	            Scanner sc = new Scanner(System.in);
	            while ( !isLogin ) {
	                System.out.print("\nEnter Your Login Id: ");
	                String LoginID = sc.nextLine();
	                if ( LoginID.equals(LoginId) ) {
	                    while ( !isLogin ) {
	                        System.out.print("\nEnter Your Password: ");
	                        String password = sc.nextLine();
	                        if ( password.equals(Password) ) {
	                            System.out.print("\nLogin successful!!!");
	                            isLogin = true;
	                        }
	                        else {
	                            System.out.println("\nIncorrect Password");
	                        }
	                    }
	                }
	                else {
	                    System.out.println("\nLogin Id not found");
	                }
	            }
	            return isLogin;
	        }
}
public class Online_Reservation_System {
		private static boolean[] seats = new boolean[10];
		
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
				System.out.println("1.Register \n2.Exit");
				System.out.println("Enter the Choice");
				int choice=scanner.nextInt();
				if(choice==1) {
					ReservationSystem r=new ReservationSystem();
					r.register();
					r.login();
				
				}
				 else {
				    	System.exit(0);;
				    }
		        while (true) {
		            System.out.println("\nPlease select an option:");
		            System.out.println("1. View Seat Map");
		            System.out.println("2. Reserve Seat");
		            System.out.println("3. Cancel Reservation");
		            System.out.println("4. Exit");

		            
		            int option = scanner.nextInt();

		            switch (option) {

		                case 1:
		                    viewSeatMap();
		                    break;

		                case 2:
		                    reserveSeat();
		                    break;

		                case 3:
		                    cancelReservation();
		                    break;

		                case 4:
		                    System.exit(0);

		                default:
		                    System.out.println("Invalid option!");
		            }
		        }
		    }

		    private static void viewSeatMap() {
		        System.out.println("\nCurrent Seat Map:");
		        for (int i = 0; i < seats.length; i++) {
		            if (seats[i]) {
		                System.out.print("X "); 
		            } else {
		                System.out.print((i + 1) + " "); 
		            }
		        }
		        System.out.println();
		    }

		    private static void reserveSeat() {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("\nEnter seat number (1-10): ");
		        int seatNumber = scanner.nextInt();
		        if (seatNumber < 1 || seatNumber > 10) {
		            System.out.println("Invalid seat number!");
		        } else if (seats[seatNumber - 1]) {
		            System.out.println("Seat already reserved!");
		        } else {
		            seats[seatNumber - 1] = true;
		            System.out.println("Seat reserved!");
		        }
		    }

		    private static void cancelReservation() {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("\nEnter seat number (1-10): ");
		        int seatNumber = scanner.nextInt();
		        if (seatNumber < 1 || seatNumber > 10) {
		            System.out.println("Invalid seat number!");
		        } else if (!seats[seatNumber - 1]) {
		            System.out.println("Seat not reserved!");
		        } else {
		            seats[seatNumber - 1] = false; 
		            System.out.println("Reservation canceled!");
		        }
		    
		   
		    }

}
