package edu.uoc.uocoban.model.entities.movable;


import edu.uoc.uocoban.model.entities.MapItem;
import edu.uoc.uocoban.model.utils.Direction;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;
import edu.uoc.uocoban.model.Level;
import edu.uoc.uocoban.model.entities.pathable.*;


public abstract class Box extends MovableEntity {


private boolean delivered;



protected Box(Position position, Sprite sprite, Level level) {
    super(position, sprite, level);
    //setDelivered(false);
}




//////////////////////////////////// Getters  ///////////////////////////////


public boolean isDelivered() {
    return delivered;
}


@Override
public boolean isPathable() {
    return false;
}


@Override
public boolean move(Direction direction){

int destinationX;
int destinationY;

//This obtains the current position
destinationX = getPosition().getX();
destinationY = getPosition().getY();

int axisX = destinationX;
int axisY = destinationY;

//This updates de direction
axisX = destinationX + direction.getX();
axisY = destinationY + direction.getY();

//This is the position that address de direction
Position position = new Position(axisX,axisY);

//Obtains the item and then uses it to checks if the destination is empty (not occupied by another box) and is a Destination type
MapItem destinationItemMap = getLevel().getMapItem(position);

if (destinationItemMap.isPathable() && (destinationItemMap instanceof Destination destination)) {
    //Checks if the type of destination is the same as the box
    if (this.getClass().getSimpleName().equals("SmallBox") && destination instanceof SmallBoxDestination
        || this.getClass().getSimpleName().equals("BigBox") && destination instanceof BigBoxDestination) {
        //the Box is removed from the level map
        this.getLevel().removeMapItem(this);
        //the Box is marked as delivered
        setDelivered(true);
        //The box assigned to the Destination.
        destination.setBox(this);
        //New position occupied
        this.setPosition(position);
        //successfully move
        return true;
    }
    // Checks if the destination is a Path
    } else if (destinationItemMap instanceof Path) {
        //Remove the Path from the level map
        this.getLevel().removeMapItem(destinationItemMap);
        //Updates the position of the box
        this.setPosition(position);
        //successfully move
        return true;
    }

    return false;

}

/////////////////////////////////////// Setters /////////////////////////////

private void setDelivered(boolean delivered) {
    this.delivered = delivered;
}




}
