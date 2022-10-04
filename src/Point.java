public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.y = y;
        this.x = x;
    }
    public Point(int value) {
        x = value;
        y = value;
    }
    public Point() {
        x = 0;
        y = 0;
    }
    public int getX() {
        return x;
    }

    public int getY() { return y; }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String coordinate() {
        return "(" + getX() + "," + getY() + ")";
    }
    public String quadrant(){
        x = getX();
        y = getY();
        if (x == 0) {
            if (y == 0) {
                return "at origin";
            } else {
                return "on axis";
            }
        } else {
            if (x < 0) {
                if (y < 0) {
                    return "III";
                } else {
                    if (y == 0) {
                        return "on axis";
                    } else {
                        return "II";
                    }
                }
            } else {
                if (y < 0) {
                    return "IV";
                } else {
                    if (y == 0) {
                        return "on axis";
                        } else {
                        return "I";
                                }
                        }

                    }
                }
            }
        }


