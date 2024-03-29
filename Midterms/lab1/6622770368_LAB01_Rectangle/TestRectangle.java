public class TestRectangle {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle();
        box1.printBasicInfo();
        System.out.println(box1.findPerimeter());
        System.out.println(box1.findDiagonal());
        if (box1.isSquare()) {
        	System.out.println("It is a square box.\n");
        } else {
        	System.out.println("It is not a square box.\n");
        }
        
        Rectangle box2 = new Rectangle(3, 5);
        box1.printBasicInfo();
        System.out.println(box2.findPerimeter());
        System.out.println(box2.findDiagonal());
        if (box2.isSquare()) {
        	System.out.println("It is a square box.");
        } else {
        	System.out.println("It is not a square box.");
        }
        
    }
}
