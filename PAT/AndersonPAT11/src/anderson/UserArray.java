/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anderson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Handles the all the users information in an array.
 *
 * @author Kian
 */
public class UserArray {

    private User[] userArr = new User[50];
    private int size;

    /**
     * Constructor for the UserArray class, reads the text file into an array.
     */
    public UserArray()  {

        try {
            Scanner sc = new Scanner(new File("Users.txt"));
            while (sc.hasNextLine()) {
                
                String[] aArr = (sc.nextLine()).split("\\|");
                userArr[size] = new User(aArr[0], aArr[1], aArr[2], Integer.parseInt(aArr[3]));
                
                size++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserArray.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += userArr[i].toString() + "\n";

        }
        return s;
    }

    /**
     * Updates the text file from the array.
     */
    public void update() {
        try {
            BufferedWriter writer = null;

            writer = new BufferedWriter(new FileWriter(".\\Users.txt"));
            writer.write(toString());
            writer.close();
        } catch (IOException ex) {

        }

    }

    /**
     * Gets the users position from the username.
     *
     * @param name The user to be found.
     * @return The position of the user.
     */
    public int getUser(String name) {
        int i = 0;
        boolean flag = false;
        int pos = -1;
        while (i < size && flag == false) {
            if (name.equals(userArr[i].getUsername())) {
                flag = true;
                pos = i;
            }
            i++;
        }
        return pos;
    }

    /**
     * Deletes a user from the database.
     *
     * @param me The username of the user to be deleted.
     */
    public void delete(String me) {
        int temp = getUser(me);

        if (temp > 0) {
            shiftLeft(temp);
        }

    }

    /**
     * Gets the username of a user from a position in the array.
     *
     * @param pos The position of user in the array.
     * @return The username of the user.
     */
    public String getName(int pos) {
        return userArr[pos].getUsername();
    }

    /**
     * Gets the password of the user from a position in the array.
     *
     * @param pos The position of the user in the array.
     * @return The password of the user.
     */
    public String getPassword(int pos) {
        return userArr[pos].getPassword();
    }

    /**
     * Gets the best time for a user on a specific level.
     *
     * @param pos The position of the user in the array.
     * @param level The level for which the best time is being requested.
     * @return The best time for the user of that level.
     */
    public String getBestTimes(int pos, int level) {
        String[] sArr = (userArr[pos].getBestTimes()).split("\\#");
        return sArr[level];
    }

    /**
     * Gets the level a user is currently on.
     *
     * @param pos The position of the user in the array.
     * @return The level the user is currently on.
     */
    public int getLevel(int pos) {
        return userArr[pos].getLevel();
    }

    /**
     * Edits the times of the user if the new times is better than the existing
     * time.
     *
     * @param pos The position of the user in the array.
     * @param level The level which has just been completed.
     * @param time The time taken by the user to complete the level.
     */
    public void editTimes(int pos, int level, String time) {
        String[] sArr = (userArr[pos].getBestTimes()).split("\\#");
        String times = userArr[pos].getBestTimes();

        if (sArr[level].equals("Not completed") || Integer.parseInt(time) < Integer.parseInt(sArr[level])) {

            switch (level) {
                case 0:
                    times = time + "#" + sArr[1] + "#" + sArr[2];
                    break;

                case 1:
                    times = sArr[0] + "#" + time + "#" + sArr[2];
                    break;

                case 2:
                    times = sArr[0] + "#" + sArr[1] + "#" + time;
                    break;
            }
        }

        userArr[pos].setBestTimes(times);
        update();

    }

    /**
     * Returns a boolean if the user exists on the database, and if the username
     * and password match. Also makes the user the current user.
     *
     * @param user The username the user has entered.
     * @param password The password the user has entered.
     * @return A boolean whether the entered credentials are valid.
     */
    public boolean login(String user, String password) {
        if (userArr[getUser(user)].getPassword().equals(password)) {
            makeCurrent(user);
            return true;

        } else {
            return false;
        }

    }

    /**
     * Shifts the array right from a desired position.
     *
     * @param position The position from which to shift from.
     */
    public void shiftRight(int position) {
        System.out.println(size);
        userArr[size] = new User(userArr[size - 1].getUsername(), userArr[size - 1].getPassword(), userArr[size - 1].getBestTimes(), userArr[size - 1].getLevel());
        for (int i = size - 1; i >= position; i--) {
            userArr[i].setUser(userArr[i - 1].getUsername(), userArr[i - 1].getPassword(), userArr[i - 1].getBestTimes(), userArr[i - 1].getLevel());

        }
        size++;
    }

    /**
     * Shifts the array left from a desired position.
     *
     * @param position The position from which to shift from.
     */
    public void shiftLeft(int position) {
        for (int i = position; i < size - 1; i++) {
            userArr[i] = userArr[i + 1];

        }
        size--;
    }

    /**
     * Adds a user to the text file and array.
     *
     * @param x The username of the user.
     * @param y The password of the user.
     * @param z The times of the user.
     * @param a The level that the user is currently on.
     */
    public void addUser(String x, String y, String z, int a) {
        shiftRight(1);
        userArr[0].setUser(x, y, z, a);
        update();
    }

    public void makeCurrent(String user) {
        String tempName = userArr[getUser(user)].getUsername();
        String tempPassword = userArr[getUser(user)].getPassword();
        String tempBestTime = userArr[getUser(user)].getBestTimes();
        int tempLevel = userArr[getUser(user)].getLevel();
        delete(user);
        addUser(tempName, tempPassword, tempBestTime, tempLevel);
        update();
    }

}
