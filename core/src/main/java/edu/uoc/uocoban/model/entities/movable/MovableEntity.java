package edu.uoc.uocoban.model.entities.movable;

import edu.uoc.uocoban.model.entities.MapItem;
import edu.uoc.uocoban.model.utils.Direction;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;
import edu.uoc.uocoban.model.Level;

public abstract class MovableEntity extends MapItem {


private Level level;

protected MovableEntity(Position position, Sprite sprite, Level level) {
    super(position, sprite);
    this.level = level;
}



//////////////////////////////// Getters //////////////////////////////
public Level getLevel() {
    return level;
}


public abstract boolean move(Direction direction);




//////////////////////////////// Setters  //////////////////////////////

private void setLevel(Level level) {
    this.level = level;
}









}
