package com.company;
import java.util.ArrayList;
/**
 *  This class team to create a team and its player
 * @author Anas Hamada
 * @version 1.0
 * @since June 2021
 */
public class Team
{
    private ArrayList<Player> playerTeam = new ArrayList<Player>();
    private int numberofteam=0;
    //////////////////////////methods///////////////////////////////
    /**
     * The addplayer method is to add objects of players into the team
     * @param player the value of the player object will be added in the arraylist
     */
    public void addPlayer(Player player)
    {
        numberofteam++;
        playerTeam.add(player);
    }
}