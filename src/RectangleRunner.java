public class RectangleRunner {
    public static void main(String[] args){
        Rectangle plot1 = new Rectangle(150,200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        plot1.setWidth(75);
        plot3.setWidth(75);
        plot2.setLength(75);
        plot2.setWidth(75);

        System.out.println("These 3 plots require " + (plot1.getArea() + plot2.getArea() + plot3.getArea()) + " square feet of land.") ;


    }
}
