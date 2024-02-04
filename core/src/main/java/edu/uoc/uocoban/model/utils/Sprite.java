package edu.uoc.uocoban.model.utils;

public enum Sprite {

    BIG_BOX('b',"big_box.png"),
    BIG_BOX_DESTINATION('B',"big_box_destination.png"),
    BIG_BOX_ON_DESTINATION('8',"big_box_on_destination.png"),
    PATH('.',"path.png"),
    PLAYER('@',"player.png"),
    SMALL_BOX('s',"small_box.png"),
    SMALL_BOX_DESTINATION('S',"small_box_destination.png"),
    SMALL_BOX_ON_DESTINATION('$',"small_box_on_destination.png"),
    WALL('#',"wall.png");

    private final char symbol;

    private final String imageSrc;

    Sprite(char symbol, String imageSrc) {
        this.symbol = symbol;
        this.imageSrc = imageSrc;
    }


    public char getSymbol() {
        return symbol;
    }

    public String getImageSrc() {
        return imageSrc;
    }



}
