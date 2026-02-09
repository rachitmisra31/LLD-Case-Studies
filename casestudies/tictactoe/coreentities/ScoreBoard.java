package casestudies.tictactoe.coreentities;

import casestudies.tictactoe.dataclasses.Player;
import casestudies.tictactoe.observer.GameObserver;

import java.util.concurrent.ConcurrentHashMap;

public class ScoreBoard implements GameObserver {

    ConcurrentHashMap<String,Integer> scores = new ConcurrentHashMap<>();

    public ScoreBoard(){
        this.scores = new ConcurrentHashMap<>();
    }
    @Override
    public void update(Game game) {
        Player winner = game.getWinner();
        if (winner != null){
            recordWin(winner);
            System.out.println("Winner updated: " + winner.getName()+" wins !");
        }
    }
    public void recordWin(Player winner){
        scores.merge(winner.getName(),1,Integer::sum);
    }

    public int getScore(String playerName){
        return scores.getOrDefault(playerName,0);
    }

    public void printScoreBoard(){
        System.out.println("\n======== SCOREBOARD ========");

        if(scores.isEmpty()){
            System.out.println("No games played yet.");
        }
        else{
            scores.forEach((playerName,score)->{
                System.out.println(playerName+": "+score);
            });
        }
        System.out.println("==============================\n");
    }
}
