/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

/**
 *
 * @author Adil
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Team1
        Player player1 = new Player();
        player1.setPlayerName("Goerge Elliot");
        Player player2 = new Player();
        player2.setPlayerName("Graham Greene");
        Player player3 = new Player();
        player3.setPlayerName("Geoffrey Chaucer");
        Player[] thePlayers = {player1, player2, player3};
        
        Team team1 = new Team();
        team1.setTeamName("The Greens");
        team1.setPlayerArray(thePlayers);
        
        Team team2 = new Team();
        team2.setTeamName("The Reds");
        team2.setPlayerArray(new Player[4]);
        team2.getPlayerArray()[0] = new Player(); 
        team2.getPlayerArray()[0].setPlayerName("Robert Service");
        team2.getPlayerArray()[1] = new Player();
        team2.getPlayerArray()[1].setPlayerName("Robbie Burns");
        team2.getPlayerArray()[2] = new Player();
        team2.getPlayerArray()[2].setPlayerName("Rafael Sabaneti");
        team2.getPlayerArray()[3] = new Player();
        team2.getPlayerArray()[3].setPlayerName("Marty Sabanini");
        
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.getPlayerArray()[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        System.out.println("Goal scored after " + 
                currGame.goals[0].theTime + " mins by " + 
                currGame.goals[0].thePlayer.getPlayerName() + " of " +
                currGame.goals[0].theTeam.getTeamName());
        
        for (Player thePlayer: team2.getPlayerArray()) {
            if (thePlayer.getPlayerName().matches(".*Sab.*")) {
                System.out.println("found: " + thePlayer.getPlayerName());
                thePlayer.getPlayerName().split(" ");
                System.out.println("Last name is: " + thePlayer.getPlayerName().split(" ")[1]);
            }
        }
    }
    
}
