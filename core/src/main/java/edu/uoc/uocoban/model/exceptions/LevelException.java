package edu.uoc.uocoban.model.exceptions;

public class LevelException extends Exception {

     public static final String SIZE_ERROR = "[ERROR] There is a problem with the height/width of the level";
     public static final String MAX_MOVEMENTS_ERROR = "[ERROR] The maximum number of movements should be greater than zero";
     public static final String BOX_ERROR = "[ERROR] There are no boxes in the level";
     public static final String BOX_DESTINATION_ERROR = "[ERROR] There are not enough destinations for the boxes in the level";
     public static final String PLAYER_ERROR = "[ERROR] There must be one player for each level";
     public static final String PARSING_LEVEL_FILE_ERROR = "[ERROR] There was some problem parsing the level file";

     public LevelException(String message) {
          super(message);
     }




}
