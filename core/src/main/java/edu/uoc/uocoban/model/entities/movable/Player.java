package edu.uoc.uocoban.model.entities.movable;

import edu.uoc.uocoban.model.entities.MapItem;
import edu.uoc.uocoban.model.entities.pathable.Path;
import edu.uoc.uocoban.model.utils.Direction;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.Level;
import edu.uoc.uocoban.model.utils.Sprite;

public class Player extends MovableEntity{


public Player(Position position, Level level) {
    super(position, Sprite.PLAYER, level);
}


public boolean isPathable(){
    return false;
}



public boolean move(Direction direction){

//This obtains the current position
int destinationX = getPosition().getX();
int destinationY = getPosition().getY();

int axisX;
int axisY;

Position currentPosition = new Position(destinationX,destinationY);

//This updates de direction
axisX = destinationX + direction.getX();
axisY = destinationY + direction.getY();

//This is the position that address de direction
Position position = new Position(axisX,axisY);

//Obtains the item
MapItem destinationItemMap = getLevel().getMapItem(position);

//Creates a Path item with current position
Path PathItem = new Path(currentPosition);

//If by a Path then
if(destinationItemMap instanceof Path) {
    //Replace the original position by a Path item
    this.getLevel().addMapItem(PathItem);
    //The Path item to which the player is moving to must be removed
    this.getLevel().removeMapItem(destinationItemMap);
    //Updates the position of player
    this.setPosition(position);
    return true;
//If occupied by a Box
} else if(destinationItemMap instanceof Box){
    //The player tries to move the box
    boolean IsMoved = ((Box) destinationItemMap).move(direction);
        //If is possible to move it then
        if(IsMoved){
            //Replace the original position by a Path item
            this.getLevel().addMapItem(PathItem);
            //Updates the position of player
            this.setPosition(position);
            return true;
        }

    }

    return false;
}





}
