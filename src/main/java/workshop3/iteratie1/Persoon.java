package workshop3.iteratie1;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/26/13
 * Time: 7:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Persoon {

    private String name;
    private Shape favoriteShape;

    public Persoon(String name, Shape favoriteShape) {
        this.name = name;
        this.favoriteShape = favoriteShape;
    }

    public void setFavoriteShape(Shape favoriteShape) {
        this.favoriteShape = favoriteShape;
    }

    @Override
    public String toString(){
        return name + " his favorite shape is " + favoriteShape;
    }
}
