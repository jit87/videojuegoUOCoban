package edu.uoc.uocoban.model.entities.pathable;

import edu.uoc.uocoban.model.entities.MapItem;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;
import edu.uoc.uocoban.model.entities.movable.Box;

public abstract class Destination extends MapItem implements Mutable {


private Box box;


protected Destination(Position position, Sprite sprite) {
    super(position, sprite);
}

///////////////////// Getters ////////////////////

public Box getBox(){
 return box;
}


@Override
public boolean isPathable() {

    //If destination is empty, then is pathable
    boolean DestinationVal = isEmpty();

    if(DestinationVal){
        return true;
    } else
        return false;


}

//Is empty if the reference to the containing box is null
public boolean isEmpty(){
     if(box==null){
         return true;
     } else
         return false;

}



/////////////////////////////  Setters  ////////////////////////////

public void setBox(Box box){
    this.box = box;
    mutate();
}




}
