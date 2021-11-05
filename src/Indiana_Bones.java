import java.util.ArrayList;

public class Indiana_Bones implements Movie{

	@Override
	public int getRating() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 123456;
	}

	@Override
	public String getTitle() {
		return "Indiana Bones";
	}

	@Override
	public ArrayList<Category> getCategories() {

		ArrayList<Category> categories = new ArrayList<Category>();

		categories.add(Category.COMEDY);
		categories.add(Category.ACTION);
		categories.add(Category.MYSTERY);
		return categories;
	}



}
