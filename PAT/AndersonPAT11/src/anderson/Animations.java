/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anderson;

import javax.swing.ImageIcon;

/**
 * Handles animations arrays and the images required to create animations in the game
 * @author Kian
 */
public class Animations {
    

    /**
     * Returns an image out of the image array, used for animating the saw to make it appear to be spinning.
     * @param i the number of the image that is going to be selected
     * @return image requested 
     */
    public ImageIcon sawImageArr(int i)
    {
        ImageIcon[] saws = new ImageIcon[]{(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/saw1.PNG"))),
                            (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/saw2.PNG"))),
                            (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/saw3.PNG")))};
        return saws[i];
    }
    

    /**
     * Returns an image out of the image array, used for animating the player, when moving right.
     * @param i the number of the image that is going to be selected.
     * @return the image requested.
     */
    public ImageIcon playerRightImageArr(int i)
    {
        ImageIcon[] playerRight = new ImageIcon[]{(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite1.PNG"))),
                                                    (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite2.PNG"))),    
                                                    (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite3.PNG"))), 
                                                    (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite4.PNG"))), 
                                                    (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite5.PNG"))), 
                                                    (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite6.PNG")))}; 
        return playerRight[i];
    }


    /**
     * Returns an image out of the image array, used for animating the player, when moving left.
     * @param i The number of the image that is going to be selected.
     * @return The image requested.
     */
    public ImageIcon playerLeftImageArr(int i)
    {
        ImageIcon[] playerLeft = new ImageIcon[]{(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite1R.png"))), 
                                                    (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite2R.png"))), 
                                                    (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite3R.png"))), 
                                                    (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite4R.png"))), 
                                                    (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite5R.png"))), 
                                                    (new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite6R.png")))};
        return playerLeft[i];
    }
    
    
}
