import java.util.ArrayList;

public class False_Oats implements Movie{
    @Override
    public int getRating() {
        return 9;
    }

    @Override
    public int getID() {
        return 987654;
    }

    @Override
    public String getTitle() {
        return "False Oats";
    }

    @Override
    public ArrayList<Category> getCategories() {
        ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(Category.WESTERN);
        categories.add(Category.CRIME);
        return categories;
    }

}
