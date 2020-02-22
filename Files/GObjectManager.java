package me.dilan.videogame.utilities;

import java.util.ArrayList;
import java.util.List;

import me.dilan.videogame.GObject;

public class GObjectManager {

	public List<GObject> objects = new ArrayList<GObject>();
	
	public void addObject(GObject object) {
		objects.add(object);
	}
	
	public void removeObject(GObject object) {
		objects.remove(object);
	}
	
}
