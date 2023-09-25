package Movie;
import java.util.Scanner;

public class MovieDriver {
	

	
	    public static void main(String[] args) {
	        Scanner keyboard = new Scanner(System.in);

	        
	        while (true) {
	            
	            Movie movie = new Movie();

	            
	            System.out.print("Enter the name of the movie: \n");
	            String title = keyboard.nextLine();
	            movie.setTitle(title);

	            
	            System.out.print("Enter the rating: \n");
	            String rating = keyboard.nextLine();
	            movie.setRating(rating);

	            
	            System.out.print("Enter the number of tickets sold for this movie: \n");
	            int soldTickets = keyboard.nextInt();
	            movie.setSoldTickets(soldTickets);

	           
	            keyboard.nextLine();
	            System.out.print("Do you want to enter another? (y/n): \n");
	            String response = keyboard.nextLine();

	            
	            if (!response.equalsIgnoreCase("y")) {
	            	System.out.println("Goodbye \n");
	                break;
	            }

	           
	            
	            System.out.println(movie.toString());

	            
	           
	        }

	        
	        keyboard.close();
	    }
	}


