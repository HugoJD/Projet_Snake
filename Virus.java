package com.example.myapplication;

public class Virus extends Personnages {

    private final float posx;
    private final float posy;
    private final float width;
    private final float height;
    private final int life;
    private final int speed;

    public Virus(float posx, float posy, float width, float height, int life, int speed) {

        this.posx = posx ;
        this.posy = posy ;

        this.width = width ;
        this.height = height ;

        this.life = life ;
        this.speed = speed ;

    }
}
