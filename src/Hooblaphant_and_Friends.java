import java.util.ArrayList;

public class Hooblaphant_and_Friends implements Movie{

    @Override
    public int GetRating() {
        return 6;
    }

    @Override
    public int GetID() {
        return 963741852;
    }

    @Override
    public String GetTitle() {
        return "Hooplaphant & Friends";
    }

    @Override
    public ArrayList<Category> GetCategories() {

        ArrayList<Category> categories = new ArrayList<>();
        categories.add(Category.KIDS);

        return categories;
    }
}
