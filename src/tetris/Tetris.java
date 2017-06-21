package tetris;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Tetris extends JFrame {

    JLabel statusbar, titleBar;

    public Tetris() {

        statusbar = new JLabel(" 0");
        titleBar = new JLabel("Left/Right = Move, Up = Rotate, "
                + "Down = Faster, Space = Drop, P = Pause ");
        add(titleBar, BorderLayout.NORTH);
        
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);
        board.start();

        setSize(400, 800);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public JLabel getStatusBar() {
       return statusbar;
   }

    public static void main(String[] args) {

        Tetris game = new Tetris();
        game.setLocationRelativeTo(null);
        game.setVisible(true);

    } 
}
