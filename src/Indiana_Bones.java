import java.util.ArrayList;

public class Indiana_Bones implements Movie{

	@Override
	public int GetRating() {return 8;}

	@Override
	public int GetID() {return 123456;}

	@Override
	public String GetTitle() {
		return "Indiana Bones";
	}

	@Override
	public ArrayList<Category> GetCategories() {
		var categories = new ArrayList<Category>();
		categories.add(Category.COMEDY);
		categories.add(Category.ACTION);
		categories.add(Category.MYSTERY);
		return categories;
	}



}
