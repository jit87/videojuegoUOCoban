package edu.uoc.uocoban.model.entities.pathable;

import edu.uoc.uocoban.model.entities.MapItem;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;

public class Path extends MapItem {


    public Path(Position position) {
        super(position,Sprite.PATH);
    }

    @Override
    public boolean isPathable() {
        return true;
    }




}
