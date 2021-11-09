import java.util.ArrayList;
import java.util.Scanner;

public class AutoFilmRental {

	public AutoFilmRental() {

		var allMovies = new ArrayList<Movie>();
		allMovies.add(new Indiana_Bones());
		allMovies.add(new False_Oats());
		allMovies.add(new The_Summoning());
		allMovies.add(new Hooblaphant_and_Friends());

		System.out.println("Velkommen");
		System.out.println("Lei en film:");

		for(int i=0;i<allMovies.size();i++){
			System.out.println("Tast " +i +" for " +allMovies.get(i).GetTitle());
		}

		var scanner = new Scanner(System.in);
		int selectedFilm = Integer.parseInt(scanner.nextLine());

		System.out.println("Du har valgt: " +allMovies.get(selectedFilm).GetTitle());
		System.out.println("Det er en");

		for(int i = 0;i<allMovies.get(selectedFilm).GetCategories().size();i++){
			System.out.println(allMovies.get(selectedFilm).GetCategories().get(i));
		}
		System.out.println("film.");
		System.out.println("Ha en god filmopplevelse!");

		}

	}

