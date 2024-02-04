package edu.uoc.uocoban.model.entities;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;

public abstract class MapItem {
    private Position position;
    private Sprite sprite;


    protected MapItem(Position position, Sprite sprite) {
        this.position = position;
        this.sprite = sprite;
    }



    ///////////// Getters /////////////////

    public Position getPosition() {
        return position;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public abstract boolean isPathable();



    ///////////////////// Setters /////////////////
    public void setPosition(Position position) {
        if(position!=null){
            this.position = position;
        }
    }

    protected void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }





}
