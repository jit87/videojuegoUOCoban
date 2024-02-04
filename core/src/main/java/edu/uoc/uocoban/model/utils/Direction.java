package edu.uoc.uocoban.model.utils;

public enum Direction {

    DOWN(20, 0, 1),
    LEFT(21, -1, 0),
    RIGHT(22, 1, 0),
    UP(19, 0, -1);

    private final int keyCode;

    private final int x;

    private final int y;


    Direction(int keyCode, int x, int y) {
        this.keyCode = keyCode;
        this.x = x;
        this.y = y;
    }

    public static Direction getDirectionByKeyCode(int keyCode){

        Direction direction = null;

        //If the code is null its returns null Direction
        if(keyCode==0){
            return null;
        } else {
            if(keyCode == 20){
                direction = DOWN;
            } else if(keyCode == 21){
                direction = LEFT;
            } else if(keyCode == 22){
                direction = RIGHT;
            } else if(keyCode == 19) {
                direction = UP;
            }

        }
         return direction;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
