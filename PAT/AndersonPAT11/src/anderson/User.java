/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anderson;
/**
 * Handles the user information for a specific user.
 * @author Kian
 */
public class User
{
    private String username;
    private String password;
    private String bestTimes;
    private int level;

    /**
     * Constructor for the user class.
     * @param user The username of the user.
     * @param password The password of the user.
     * @param bestTimes The times of the user.
     * @param level The level that the user is currently busy with.
     */
    public User(String user, String password, String bestTimes, int level)
    {
        this.username = user;
        this.password = password;
        this.bestTimes = bestTimes;
        this.level = level;
    }

    /**
     * Gets the username of the user.
     * @return The username of the user.
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * Gets the password of the user.
     * @return The password of the user.
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Gets the best times of the user.
     * @return The best times of the user.
     */
    public String getBestTimes()
    {
        return bestTimes;
    }

    /**
     * Gets the level that the user is currently on.
     * @return The level that the user is currently on.
     */
    public int getLevel()
    {
        return level;
    }

    /**
     * Sets the username of the user.
     * @param user The desired new username.
     */
    public void setUsername(String user)
    {
        this.username = user;
    }

    /**
     * Sets the password of the user.
     * @param password The desired password of the user.
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * Sets the best times of the user.
     * @param bestTimes
     */
    public void setBestTimes(String bestTimes)
    {
        this.bestTimes = bestTimes;
    }

    /**
     * Sets the level of the user.
     * @param level The desired level of the user.
     */
    public void setLevel(int level)
    {
        this.level = level;
    }
    
    public String toString()
    {
        return username + "|" +password + "|" + bestTimes + "|" + level;
    }
    
    /**
     * Sets all the variables of the user in one method.
     * @param a The username of the user.
     * @param b The password of the user.
     * @param c The best times of the user.
     * @param d The level of the user.
     */
    public void setUser(String a,String b,String c,int d)
    {
        username = a;
        password = b;
        bestTimes = c;
        level = d;
                
    }
                    
}
