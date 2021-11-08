import java.util.ArrayList;
import java.util.Scanner;

public class AutoFilmRental {

	public AutoFilmRental() {
		System.out.println("Velkommen");
		System.out.println("Lei en film:");
		System.out.println("1 for Bones, 2 for Oats og 3 for Summoning");
		Scanner scanner=new Scanner(System.in);
		String str = scanner.nextLine();

		ArrayList<Movie> allMovies = new ArrayList<>();
		allMovies.add(new Indiana_Bones());
		allMovies.add(new False_Oats());
		allMovies.add(new The_Summoning());

		int selectedFilm=0;

		System.out.println("Du har valgt:");
		if(str.equals("1")){
			System.out.println(allMovies.get(0).GetTitle());
			selectedFilm = 0;
		}
		else if(str.equals("2")){
			System.out.println(allMovies.get(1).GetTitle());
			selectedFilm = 1;
		}
		else if (str.equals("3")){
			System.out.println(allMovies.get(2).GetTitle());
			selectedFilm = 2;
		}
		System.out.println("Det er en");

		for(int i = 0;i<allMovies.get(selectedFilm).GetCategories().size();i++){
			System.out.println(allMovies.get(selectedFilm).GetCategories().get(i));
		}
		System.out.println("film.");

		}

	}

