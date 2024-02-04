package edu.uoc.uocoban.model.entities.pathable;

import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;

public class BigBoxDestination extends Destination implements Mutable {



    public BigBoxDestination(Position position) {
        super(position, Sprite.BIG_BOX_DESTINATION);
    }



    @Override
    public void mutate() {
        setSprite(Sprite.BIG_BOX_DESTINATION);
    }



}
