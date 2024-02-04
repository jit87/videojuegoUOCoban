package edu.uoc.uocoban.model.entities;

import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;


public class Wall extends MapItem{

    public Wall(Position position) {
        super(position, Sprite.WALL);
    }

    @Override
    public boolean isPathable() {
        return false;
    }







}
