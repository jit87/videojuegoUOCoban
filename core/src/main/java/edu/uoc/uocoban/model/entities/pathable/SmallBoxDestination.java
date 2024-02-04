package edu.uoc.uocoban.model.entities.pathable;

import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;

public class SmallBoxDestination extends Destination implements Mutable {

    public SmallBoxDestination(Position position) {
        super(position, Sprite.SMALL_BOX_DESTINATION);
    }



    @Override
    public void mutate() {
        setSprite(Sprite.SMALL_BOX_DESTINATION);
    }



}
