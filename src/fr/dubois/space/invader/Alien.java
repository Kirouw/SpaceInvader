package fr.dubois.space.invader;

import android.graphics.Bitmap;

public class Alien extends Sprite{

	public Alien(Bitmap bitmap, float x, float y) {
		super(bitmap, x, y);
	}
	@Override
	public void act() {
			x = x+5;
			if(x >= 200)
			{
				x = x;
				y = y-1;
			}
	}

}
