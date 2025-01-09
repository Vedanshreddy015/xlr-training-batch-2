public class bowler {
    
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    
    public bowler() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    
    public bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    
    public void computeBowlingAverage() {
        if (wickets == 0) {
            System.out.println("Bowling average cannot be calculated as wickets are zero.");
        } else {
            double bowlingAverage = (double) runsConceded / wickets;
            System.out.println("Bowling Average: " + bowlingAverage);
        }
    }

    
    public static void main(String[] args) {
        
        bowler bowler = new bowler("Sachin", 10, 5, 750, 463);
        bowler.computeBowlingAverage(); // Expected output: Bowling Average: 46.3
    }
}
