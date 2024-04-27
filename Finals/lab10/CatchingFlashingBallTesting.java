import javax.swing.JFrame;

class CatchingFlashingBallTesting {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // create an object of this frame
        CatchingFlashingBall cl = new CatchingFlashingBall(); // import the CatchingFlashingBall class or ensure it is in the correct package
        frame.add(cl); // add JPanel into JFrame

        frame.setTitle("My Catching FlashBall"); // set Title of this frame
        frame.setSize(600, 400); // set a frame's resolution
        frame.setLocationRelativeTo(null); // set a location at center the frame
        frame.setVisible(true); // set visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}