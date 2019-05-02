package ac.scggi.app.inheritance4;

public interface Drawable {
	boolean draw(Point p);
	default boolean testGt(int size) {
		return true;
	}
	default void showInfo(Shape sp) {
		sp.drawAll();
	}
}
