import java.util.ArrayList;
import java.util.Scanner;

public class AutoFilmRental {

	public AutoFilmRental() {
		System.out.println("Velkommen");
		System.out.println("Lei en film:");
		System.out.println("1 for Bones, 2 for Oats og 3 for Summoning");
		Scanner scanner=new Scanner(System.in);
		String str = scanner.nextLine();


		Indiana_Bones film = new Indiana_Bones();
		ArrayList<Movie> Chosen = new ArrayList<>();
		Chosen.add(new Indiana_Bones());
		Chosen.add(new False_Oats());
		Chosen.add(new The_Summoning());

		int filmSelector=0;

		System.out.println("Du har valgt:");
		if(str.equals("1")){
			System.out.println(Chosen.get(0).getTitle());
			filmSelector = 0;
		}
		else if(str.equals("2")){
			System.out.println(Chosen.get(1).getTitle());
			filmSelector = 1;
		}
		else if (str.equals("3")){
			System.out.println(Chosen.get(2).getTitle());
			filmSelector = 2;
		}
		System.out.println("Det er en");

		for(int i = 0;i<Chosen.get(filmSelector).getCategories().size();i++){
			System.out.println(Chosen.get(filmSelector).getCategories().get(i));
		}
		System.out.println("film.");

		}

	}

