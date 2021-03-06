package fr.dubois.space.invader;

import android.graphics.Bitmap;

public class Alien extends Sprite{
	
	boolean direction;

	public Alien(Bitmap bitmap, float x, float y) {
		super(bitmap, x, y);
	}
	@Override
	public void act() {
		if(direction){
			if(x >= 450)
			{
				direction = false;
				y += 20;
			} 
			else{
				x += 10;
			} 
		}
		else
		{			
			if(x <= 0)
			{				
				direction = true;				
				y += 20;			
			} 
			else
			{
				x -= 10;
			}
		}
	}

}
