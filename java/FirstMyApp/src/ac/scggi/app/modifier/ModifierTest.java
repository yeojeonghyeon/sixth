package ac.scggi.app.modifier;
//public class ModifierTest extends FinalModifier { 상속 불가능
public class ModifierTest {
	public static void main(String[] args) {
		AbstractModifier a = new AbstractModifier();
		FinalModifier b = new FinalModifier();
		NoModifier n = new NoModifier();
		PublicModifier p = new PublicModifier();
	}
}
