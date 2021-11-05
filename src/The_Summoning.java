import java.util.ArrayList;

public class The_Summoning implements Movie{
    @Override
    public int getRating() {
        return 5;
    }

    @Override
    public int getID() {
        return 468219;
    }

    @Override
    public String getTitle() {
        return "The Summoning";
    }

    @Override
    public ArrayList<Category> getCategories() {
        ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(Category.HORROR);
        return categories;
    }

}
