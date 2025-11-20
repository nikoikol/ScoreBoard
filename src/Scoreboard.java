public class Scoreboard {
    private String team1;
    private String team2;
    private boolean x;
    private int team1score;
    private int team2score;
    public Scoreboard(String team1, String team2){
        this.team1 = team1;
        this.team2 = team2;
    }
    public void recordPlay(int points) {
        if (points > 0)
            if (x) team2score += points;
            else team1score += points;
        else x = !x;
    }
    public String getScore(){
        if (x) return team1score + "-" + team2score + " " + team2;
        else return (team1score + "-" + team2score + " " + team1);
    }
}
