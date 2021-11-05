import java.util.ArrayList;

public interface Movie {

	int getRating();
	int getID();
	String getTitle();
	ArrayList<Category> getCategories();
	
	enum Category {
		HORROR,
		COMEDY,
		ACTION,
		WESTERN,
		CRIME,
		MYSTERY
	}

}
