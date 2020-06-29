package com.first.nested;

public class Graphics {
	public void display(IDrawable drawable) {
		drawable.draw();
	}
}

class UseGraphics{
	public static void main(String[] args) {
		Graphics g = new Graphics();
		g.display(new IDrawable() {
			@Override
			public boolean draw() {
				// TODO Auto-generated method stub
				System.out.println("anonymous inner class");
				return false;
			}
		});
	}
}