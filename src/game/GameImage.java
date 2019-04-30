package game;

import processing.core.PApplet;
import processing.core.PImage;

import java.util.HashMap;
import java.util.Map;

public enum GameImage {
    IMPERIUS_GROUND("src/game/assets/Tribes/Imperius/Imperius ground.png");

    private static Map<String, PImage> IMAGES;
    private String imageString;

    GameImage(String imageString) {
        this.imageString = imageString;
    }

    public static void loadAll(PApplet processing) {
        Map<String, PImage> images = new HashMap<>();

        for (GameImage value : GameImage.values()) {
            images.put(value.name(), processing.loadImage(value.getImageString()));
        }
        IMAGES = images;
    }

    public static PImage getImage(GameImage image) {
        return IMAGES.get(image.name());
    }

    private String getImageString() {
        return imageString;
    }
}
