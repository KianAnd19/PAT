/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anderson;

import java.awt.event.*;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Level 2 Game Screen
 * @author Kian
 */
class Level2Screen extends javax.swing.JFrame implements Runnable
{

    Character player = new Character(540, 800, 0);
    boolean gameClosed = false;
    double initialPosX;
    double lastPosX;
    int currency = 0;
    boolean chestCollided = false;
    long startTime, finishTime;

    /**
     * Creates new form GameScreen
     */
    public Level2Screen()
    {
        initComponents();

        //setting up key listener
        KeyListener listener = new Level2Screen.MyKeyListener();
        addKeyListener(listener);
        setFocusable(true);

        //sets the initial location of the sprite
        sprite.setLocation(player.getX(), player.getY());
        startTime = System.currentTimeMillis();

        //runs when the window is closed, used to stop the thread
        WindowListener exitListener = new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                gameClosed = true;
                System.exit(0);
            }
        };

        this.addWindowListener(exitListener);
        player.setFalling(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        userMessage = new javax.swing.JLabel();
        lblCurrency2 = new javax.swing.JLabel();
        lblCurrency1 = new javax.swing.JLabel();
        lblCurrency = new javax.swing.JLabel();
        platformCollide = new javax.swing.JLabel();
        platformCollide1 = new javax.swing.JLabel();
        platformCollide2 = new javax.swing.JLabel();
        platformCollide3 = new javax.swing.JLabel();
        ground = new javax.swing.JLabel();
        sprite = new javax.swing.JLabel();
        obstacleCollide = new javax.swing.JLabel();
        obstacleCollide1 = new javax.swing.JLabel();
        obstacleCollide2 = new javax.swing.JLabel();
        obstacleCollide3 = new javax.swing.JLabel();
        obstacleCollide4 = new javax.swing.JLabel();
        platform = new javax.swing.JLabel();
        platform2 = new javax.swing.JLabel();
        platform3 = new javax.swing.JLabel();
        foreground2 = new javax.swing.JLabel();
        foreground1 = new javax.swing.JLabel();
        foreground = new javax.swing.JLabel();
        finish = new javax.swing.JLabel();
        chest = new javax.swing.JLabel();
        platform1 = new javax.swing.JLabel();
        obstacle = new javax.swing.JLabel();
        obstacle1 = new javax.swing.JLabel();
        obstacle2 = new javax.swing.JLabel();
        obstacle3 = new javax.swing.JLabel();
        obstacle4 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Game Screen");
        getContentPane().setLayout(null);

        userMessage.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        userMessage.setForeground(new java.awt.Color(255, 255, 255));
        userMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(userMessage);
        userMessage.setBounds(370, 30, 1330, 70);

        lblCurrency2.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lblCurrency2.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrency2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrency2.setText("Level 2:");
        getContentPane().add(lblCurrency2);
        lblCurrency2.setBounds(-170, 10, 560, 50);

        lblCurrency1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lblCurrency1.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrency1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrency1.setText("Get Chests for 50 Currency");
        getContentPane().add(lblCurrency1);
        lblCurrency1.setBounds(30, 720, 560, 50);

        lblCurrency.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lblCurrency.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrency.setText("Currency: 0");
        getContentPane().add(lblCurrency);
        lblCurrency.setBounds(1610, 20, 280, 30);
        getContentPane().add(platformCollide);
        platformCollide.setBounds(800, 790, 430, 10);
        getContentPane().add(platformCollide1);
        platformCollide1.setBounds(2510, 740, 430, 10);
        getContentPane().add(platformCollide2);
        platformCollide2.setBounds(1930, 590, 430, 10);
        getContentPane().add(platformCollide3);
        platformCollide3.setBounds(1570, 770, 430, 10);
        getContentPane().add(ground);
        ground.setBounds(10, 990, 3880, 50);

        sprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite1.PNG"))); // NOI18N
        getContentPane().add(sprite);
        sprite.setBounds(70, 870, 130, 130);
        getContentPane().add(obstacleCollide);
        obstacleCollide.setBounds(1800, 900, 60, 50);
        getContentPane().add(obstacleCollide1);
        obstacleCollide1.setBounds(1010, 730, 60, 50);
        getContentPane().add(obstacleCollide2);
        obstacleCollide2.setBounds(2300, 540, 60, 50);
        getContentPane().add(obstacleCollide3);
        obstacleCollide3.setBounds(2490, 900, 60, 50);
        getContentPane().add(obstacleCollide4);
        obstacleCollide4.setBounds(1190, 910, 60, 50);

        platform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/platform.PNG"))); // NOI18N
        getContentPane().add(platform);
        platform.setBounds(1900, 570, 500, 110);

        platform2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/platform.PNG"))); // NOI18N
        getContentPane().add(platform2);
        platform2.setBounds(1530, 740, 500, 110);

        platform3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/platform.PNG"))); // NOI18N
        getContentPane().add(platform3);
        platform3.setBounds(2470, 710, 500, 110);

        foreground2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/ground.png"))); // NOI18N
        getContentPane().add(foreground2);
        foreground2.setBounds(3840, -20, 1930, 1080);

        foreground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/ground.png"))); // NOI18N
        getContentPane().add(foreground1);
        foreground1.setBounds(1920, -20, 1930, 1080);

        foreground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/ground.png"))); // NOI18N
        getContentPane().add(foreground);
        foreground.setBounds(0, -10, 1960, 1080);

        finish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/finish.png"))); // NOI18N
        getContentPane().add(finish);
        finish.setBounds(3590, 480, 100, 500);

        chest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/chest.png"))); // NOI18N
        getContentPane().add(chest);
        chest.setBounds(1450, 880, 140, 120);

        platform1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/platform.PNG"))); // NOI18N
        getContentPane().add(platform1);
        platform1.setBounds(760, 760, 500, 110);

        obstacle.setBackground(new java.awt.Color(0, 0, 0));
        obstacle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/saw1.PNG"))); // NOI18N
        getContentPane().add(obstacle);
        obstacle.setBounds(1160, 870, 120, 140);

        obstacle1.setBackground(new java.awt.Color(0, 0, 0));
        obstacle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/saw1.PNG"))); // NOI18N
        getContentPane().add(obstacle1);
        obstacle1.setBounds(980, 690, 120, 140);

        obstacle2.setBackground(new java.awt.Color(0, 0, 0));
        obstacle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/saw1.PNG"))); // NOI18N
        getContentPane().add(obstacle2);
        obstacle2.setBounds(2270, 490, 120, 140);

        obstacle3.setBackground(new java.awt.Color(0, 0, 0));
        obstacle3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/saw1.PNG"))); // NOI18N
        getContentPane().add(obstacle3);
        obstacle3.setBounds(1770, 860, 120, 140);

        obstacle4.setBackground(new java.awt.Color(0, 0, 0));
        obstacle4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/saw1.PNG"))); // NOI18N
        getContentPane().add(obstacle4);
        obstacle4.setBounds(2460, 860, 120, 140);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/level2Background.PNG"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(-10, -150, 5820, 1370);

        setSize(new java.awt.Dimension(1926, 1103));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    @Override
    public void run()
    {
        initialPosX = foreground.getLocation().getX();
        long time = System.currentTimeMillis();
        CollisionDetection c = new CollisionDetection();

        int e = 0, f = 0, y = 0;

        //first location of the character used to control the chracter movement
        double referenceLocation = sprite.getLocation().getX();
        Animations animation = new Animations();

        while (!gameClosed)
        {
            if (System.currentTimeMillis() - time > 3)
            {
                //loop runs approx 30 times per second

                //character move
                if (foreground.getLocation().getX() == initialPosX)
                {
                    if (player.getDirection() == 5)
                    {
                        player.move();
                        sprite.setLocation(player.getX(), player.getY());
                    } else if (player.getDirection() == -5)
                    {
                        player.move();
                        sprite.setLocation(player.getX(), player.getY());
                    }
                }

                //world move
                if (sprite.getLocation().getX() > referenceLocation)
                {
                    //refreshes locations every game tick
                    for (int i = 0; i < 24; i++)
                    {
                        refreshLocations(labelsArr(i));

                    }
                }

                //keeps player jumping and handles collisions with the floor
                if (player.isJumping() || player.isFalling())
                {
                    player.moveVert();

                    //grounds
                    if (c.checkCollision(sprite, ground) || c.checkCollision(sprite, platformCollide1)
                            || c.checkCollision(sprite, platformCollide) || c.checkCollision(sprite, platformCollide2)
                            || c.checkCollision(sprite, platformCollide3))
                    {
                        player.setFalling(false);
                    }

                    sprite.setLocation(player.getX(), player.getY());
                }

                //grounds
                if (c.checkCollision(sprite, ground) == false && c.checkCollision(sprite, platformCollide) == false
                        && c.checkCollision(sprite, platformCollide1) == false && c.checkCollision(sprite, platformCollide2) == false
                        && c.checkCollision(sprite, platformCollide3) == false)
                {
                    player.setFalling(true);
                }

                //obstacles
                if (c.checkCollision(sprite, obstacleCollide1) || c.checkCollision(sprite, obstacleCollide)
                        || c.checkCollision(sprite, obstacleCollide2) || c.checkCollision(sprite, obstacleCollide3)
                        || c.checkCollision(sprite, obstacleCollide4))
                {

                    userMessage.setText("You Died");

                    //thread sleeps for 1 second
                    try
                    {
                        //amount of time in milliseconds
                        Thread.sleep(1000);
                    } catch (InterruptedException ex)
                    {
                    }

                    //players positions is reset to beginning
                    player.setX(800);
                    player.setY(500);
                    lastPosX = foreground.getLocation().getX();

                    //all objects in level are reset to their initial position
                    for (int i = 0; i < 24; i++)
                    {
                        resetLocations(labelsArr(i));
                    }

                }

                //chest
                if (c.checkCollision(sprite, chest) && chestCollided == false)
                {
                    chest.setVisible(false);
                    currency += 50;
                    lblCurrency.setText("Currency: " + currency);
                    chestCollided = true;
                }

                //finish
                if (c.checkCollision(sprite, finish))
                {
                    finishTime = System.currentTimeMillis();
                    UserArray u = new UserArray();
                    u.editTimes(0, 1, "" + (finishTime - startTime)/1000);
                    currency += 100;
                    lblCurrency.setText("Currency: " + currency);
                    gameClosed = true;
                    new Level2Screen().dispose();

                }

                //animatates saws every game tick
                for (int i = 0; i < 5; i++)
                {
                    animateSaws(sawArr(i), animation.sawImageArr(f));
                }

                //animates character every 6 game ticks
                if (y == 0)
                {
                    //uses left image set
                    if (player.getDirection() == -5 && !player.isJumping() && !player.isFalling())
                    {
                        sprite.setIcon(animation.playerLeftImageArr(e));
                    }

                    //uses right image set
                    if (player.getDirection() == 5 && !player.isJumping() && !player.isFalling())
                    {
                        sprite.setIcon(animation.playerRightImageArr(e));
                    }
                }

                //controls
                f++;
                if (f == 3)
                {
                    f = 0;
                }

                e++;
                if (e == 6)
                {
                    e = 0;
                }

                y++;
                if (y == 7)
                {
                    y = 0;
                }

                //gets the current milli time of system
                time = System.currentTimeMillis();
            }

        }

    }

    public class MyKeyListener implements KeyListener
    {

        @Override
        public void keyTyped(KeyEvent e)
        {

        }

        @Override
        public void keyPressed(KeyEvent e)
        {

            lblCurrency1.setText("");
            //Left
            if (e.getKeyCode() == KeyEvent.VK_A && player.getDirection() != -5 && !gameClosed)
            {
                userMessage.setText("");
                sprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite1R.png")));
                player.setRight();
            }

            //Right
            if (e.getKeyCode() == KeyEvent.VK_D && player.getDirection() != 5 && !gameClosed)
            {
                userMessage.setText("");
                sprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anderson/Images/sprite1.PNG")));
                player.setLeft();
            }

            //Jump
            if (e.getKeyCode() == KeyEvent.VK_SPACE && !player.isJumping() && !player.isFalling())
            {
                player.setJumping(true);
                Timer jumpTimer = new Timer("Jumping");

                TimerTask stopJump = new TimerTask()
                {
                    public void run()
                    {
                        player.setJumping(false);
                        player.setFalling(true);

                    }
                };
                jumpTimer.schedule(stopJump, 350);
            }

            //game is closed
            if (gameClosed)
            {
                new LevelSelectScreen().setVisible(true);
                dispose();
            }

        }

        @Override
        public void keyReleased(KeyEvent e)
        {
            if (e.getKeyCode() == KeyEvent.VK_A && player.getDirection() == -5)
            {
                player.stop();
            }
            if (e.getKeyCode() == KeyEvent.VK_D && player.getDirection() == 5)
            {
                player.stop();
            }

        }
    }

    //refreshes locations of all labels on the screen
    public void refreshLocations(JLabel x)
    {
        int d = -1 * player.getDirection();

        x.setLocation((int) x.getLocation().getX() + d, (int) x.getLocation().getY());
    }

    //restets locations of all labels on the screen
    public void resetLocations(JLabel x)
    {
        int i = (int) (initialPosX - lastPosX);
        x.setLocation((int) x.getLocation().getX() + i, (int) x.getLocation().getY());
    }

    //array of all labels on the screen
    public JLabel labelsArr(int i)
    {
        JLabel[] labels = new JLabel[]
        {
            obstacle, obstacle1, obstacle2, obstacle3, obstacle4, obstacleCollide, obstacleCollide1, obstacleCollide2, obstacleCollide3, obstacleCollide4,
            platformCollide1, platformCollide2, platformCollide3, platform, platform1, platform2, platform3,
            foreground1, ground, platformCollide, foreground, chest, finish, foreground2
        };
        return labels[i];
    }

    //array of all saws on screen
    public JLabel sawArr(int i)
    {
        JLabel[] labels = new JLabel[]
        {
            obstacle, obstacle1, obstacle2, obstacle3, obstacle4
        };
        return labels[i];
    }

    //sets icon of every saw on the screen according to the parameters
    public void animateSaws(JLabel x, ImageIcon i)
    {
        x.setIcon(i);
    }

    public static void main(String args[])
    {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Level2Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Level2Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Level2Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Level2Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel chest;
    private javax.swing.JLabel finish;
    private javax.swing.JLabel foreground;
    private javax.swing.JLabel foreground1;
    private javax.swing.JLabel foreground2;
    private javax.swing.JLabel ground;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JLabel lblCurrency1;
    private javax.swing.JLabel lblCurrency2;
    private javax.swing.JLabel obstacle;
    private javax.swing.JLabel obstacle1;
    private javax.swing.JLabel obstacle2;
    private javax.swing.JLabel obstacle3;
    private javax.swing.JLabel obstacle4;
    private javax.swing.JLabel obstacleCollide;
    private javax.swing.JLabel obstacleCollide1;
    private javax.swing.JLabel obstacleCollide2;
    private javax.swing.JLabel obstacleCollide3;
    private javax.swing.JLabel obstacleCollide4;
    private javax.swing.JLabel platform;
    private javax.swing.JLabel platform1;
    private javax.swing.JLabel platform2;
    private javax.swing.JLabel platform3;
    private javax.swing.JLabel platformCollide;
    private javax.swing.JLabel platformCollide1;
    private javax.swing.JLabel platformCollide2;
    private javax.swing.JLabel platformCollide3;
    private javax.swing.JLabel sprite;
    private javax.swing.JLabel userMessage;
    // End of variables declaration//GEN-END:variables
}