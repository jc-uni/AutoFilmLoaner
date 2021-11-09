import java.util.ArrayList;

public class The_Summoning implements Movie{
    @Override
    public int GetRating() {return 5;}

    @Override
    public int GetID() {return 468219;}

    @Override
    public String GetTitle() {return "The Summoning";}

    @Override
    public ArrayList<Category> GetCategories() {
        var categories = new ArrayList<Category>();
        categories.add(Category.HORROR);
        return categories;
    }

}
