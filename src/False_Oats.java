import java.util.ArrayList;

public class False_Oats implements Movie{
    @Override
    public int GetRating() {
        return 9;
    }

    @Override
    public int GetID() {
        return 987654;
    }

    @Override
    public String GetTitle() {
        return "False Oats";
    }

    @Override
    public ArrayList<Category> GetCategories() {
        var categories = new ArrayList<Category>();
        categories.add(Category.WESTERN);
        categories.add(Category.CRIME);
        return categories;
    }

}
