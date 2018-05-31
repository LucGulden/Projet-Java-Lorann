package view;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class CustomJPanel extends JPanel {

    private Image map[][];
    private String score;
    /**
     * CONSTRUCTOR
     */
    public CustomJPanel(Image map[][], int score) {
        this.map = map;
        this.score = "SCORE : "+(new DecimalFormat("00000").format(score));
        this.setBackground(Color.BLACK);
    }

    /**
     * GETTERS and SETTERS
     */
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = "SCORE : "+score;
    }

    /**
     * METHODS
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[0].length; y++) {
                g.drawImage(map[x][y],x*32,y*32,32,32,null);
            }
        }
        Font fonte = new Font("Felix Titling",Font.BOLD,30);
        g.setFont(fonte);
        g.setColor(Color.WHITE);
        g.drawString(score,10,this.getHeight()-10);
    }
}
