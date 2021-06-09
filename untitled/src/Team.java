import java.util.ArrayList;

public class Team
{
    private ArrayList<Player> playerTeam = new ArrayList<Player>();
    private int numberofteam=0;
    public void addPlayer(Player player)
    {
        numberofteam++;
        playerTeam.add(player);
    }
}