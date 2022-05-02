package kea.spring2022.sorting;

public class Ball implements Sammenlignbar,Comparable<Ball> {
    private int brightness;

    public Ball() {
        this((int) Math.floor(Math.random() * 16));
    }

    public Ball(int brightness) {
        this.brightness = brightness % 16;
    }

    public boolean brighterThan(Ball otherBall) {
        if (otherBall.brightness > this.brightness) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return Integer.toString(brightness);
    }

    @Override
    public boolean sorteresEfter(Sammenlignbar andetObjekt) {
        return brighterThan((Ball) andetObjekt);
    }

    @Override
    public int compareTo(Ball o) {
        return this.brightness-o.brightness;
    }
}
