package gridLib;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 * SimpleGrid provides a canvas to draw pixel art.
 */
public class SimpleGrid
{
    
    private int numRows;
    private int numCols;
    private Color[][] cells;
    private BufferedImage[] images;
    //protected boolean visible=true;

    private static final long serialVersionUID = 1L;
    
    /**
     * Create a new square SimpleGrid
     * @param size the width and height of the SimpleGrid instance
     */
    public SimpleGrid(int size) {

        this(size, size, true);
    }
    
    /**
     * Create a new rectangular SimpleGrid
     * @param numRows the height (number of rows) of the SimpleGrid instance
     * @param numCols the width (number of cols) of the SimpleGrid instance
     */
    public SimpleGrid(int numRows, int numCols) {
        this(numRows, numCols, true);
    }

    /**
     * @return the number of rows in the SimpleGrid instance
     */
    public int getNumRows() {
        return numRows;
    }

    /**
     * @return the number of columns in the SimpleGrid instance
     */
    public int getNumCols() {
        return numCols;
    }

    /**
     * Set the color of a pixel at position (row, col)
     * @param row the row in which the pixel is
     * @param col the column in which the pixel is
     * @param color the color to set the pixel to
     */
    public void setColor(int row, int col, Color color) {
        boundsCheck(row, col, color);
        cells[row][col]=color;
        repaint();
    }
}
