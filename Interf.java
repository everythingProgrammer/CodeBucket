

interface Drawable{
	static final int a = 1;
	int b = 2;
	void draw();
	static int cube() {
		return 1;
	}
}

public class Interf implements Drawable {
	int a = 0;
	public void draw() {
		System.out.println(Drawable.cube());
	}
}
