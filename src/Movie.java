import java.util.ArrayList;

public interface Movie {

	int GetRating();
	int GetID();
	String GetTitle();
	ArrayList<Category> GetCategories();
	
	enum Category {
		HORROR,
		COMEDY,
		ACTION,
		WESTERN,
		CRIME,
		MYSTERY
	}

}
