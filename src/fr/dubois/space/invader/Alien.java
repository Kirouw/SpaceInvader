package fr.dubois.space.invader;

import android.graphics.Bitmap;

public class Alien extends Sprite{

	public Alien(Bitmap bitmap, float x, float y) {
		super(bitmap, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		if(x<=600)
		{
			x = x+5;
		}
		else
		{
			x = x+0;
		}
	}

}
