import processing.core.PApplet;

public class OopsProcessing extends PApplet {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;
    public static final int DIAMETER = 50;
    public static final int TOTALBALLS = 4;
    Ball[] ball;

    public static void main(String[] args) {
        PApplet.main("OopsProcessing",args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
        ball=new Ball[TOTALBALLS];
        for (int ballNumber=0;ballNumber<TOTALBALLS;ballNumber++){
            ball[ballNumber]=new Ball(this,ballNumber+1);
        }
    }

    @Override
    public void draw() {
        for (Ball ballitr:ball){
            ballitr.drawCircle();
            ballitr.ballSpeed();
        }
    }
}