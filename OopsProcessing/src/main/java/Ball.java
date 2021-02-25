import processing.core.PApplet;

public class Ball {
    private PApplet pApplet;
    public final int DIAMETER=OopsProcessing.DIAMETER;
    public final int totalBall=OopsProcessing.TOTALBALLS;
    public int ballSpeed;
    public int x,y;
    public Ball(PApplet pApplet, int ballNo){
        this.pApplet = pApplet;
        this.ballSpeed=ballNo;
        x=0;
        y = (ballNo * OopsProcessing.HEIGHT) /(totalBall+1);
    }

    public void drawCircle(){
        pApplet.ellipse(x,y,DIAMETER,DIAMETER);
    }

    public void ballSpeed() {
        this.x+=ballSpeed;
    }
}