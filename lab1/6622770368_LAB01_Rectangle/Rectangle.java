public class Rectangle {
    int width, length;

    Rectangle() {
        width = 1;
        length = 1;
    }

    Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    double findArea() {
        return width * length;
    }

    double findPerimeter() {
        return 2 * (width + length);
    } 

    double findDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
    }

    boolean isSquare() {
        return width == length;
    }

    void printBasicInfo() {
        System.out.println("The width is " + width);
        System.out.println("The length is " + length);
    }
}