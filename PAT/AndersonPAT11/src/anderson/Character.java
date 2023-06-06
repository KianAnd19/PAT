/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anderson;

/**
 * Controls the character movement on the screen.
 * @author Kian
 */
public class Character {

    private int x;
    private int y;
    private int direction;
    private boolean jumping;
    private boolean falling;
    
    //constructor

    /**
     * Constructor for the character class
     * @param x The x position for the character.
     * @param y The y position for the character.
     * @param direction The direction the character must face.
     */
    public Character(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        jumping = false;
        falling = false;
    }

    //getters

    /**
     * Accessor for y position of character.
     * @return x position of character.
     */
    public int getX() {
        return x;
    }

    /**
     * Accessor for y position of character.
     * @return y position of character.
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y position of the Character.
     * @param i The y position for the character to be set to.
     */
    public void setY(int i) {
        x = i;
    }

    /**
     * Sets the x position of the Character.
     * @param i The x position for the Character to be set to.
     */
    public void setX(int i) {
        y = i;
    }

    /**
     * Accessor for the direction of the Character.
     * @return The direction that Character currently is.
     */
    public int getDirection() {
        return direction;
    }

    //setters

    /**
     * Set the Direction of the Character to Left.
     */
    public void setLeft() {
        direction = 5;
    }

    /**
     * Sets the Direction of the Character to the Right.
     */
    public void setRight() {
        direction = -5;
    }

    //makes charcter stop

    /**
     * Makes the Character stop moving whichever direction.
     */
    public void stop() {
        direction = 0;
    }

    //controls character horizontal movement

    /**
     * Makes the Character move depending on which direction they are facing.
     */
    public void move() {
        x += direction;
    }

    //controls character vertical movement

    /**
     * Controls the Character's vertical movement.
     */
    public void moveVert() {
        if (jumping) {
            y -= 5;
        } else if (falling) {
            y += 5;
        }
    }

    //jumping and falling getters

    /**
     * Checks if the character is jumping.
     * @return A boolean of whether the character is jumping or not.
     */
    public boolean isJumping() {
        return jumping;
    }

    /**
     * Checks if the Characters if falling.
     * @return A boolean of whether the character is falling or not.
     */
    public boolean isFalling() {
        return falling;
    }

    //jumping and falling setters

    /**
     * Makes the character start to jump.
     * @param j Boolean whether the character is jumping.
     */
    public void setJumping(boolean j) {
        jumping = j;
    }

    /**
     * Makes the character start to fall.
     * @param f Boolean whether the character is falling.
     */
    public void setFalling(boolean f) {
        falling = f;
    }

}
