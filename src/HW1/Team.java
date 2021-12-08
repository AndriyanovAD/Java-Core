package HW1;

import HW1.Athlete;

public class Team {

    String nameOfTeam;
    Athlete[] competitors = new Athlete[4];


    public Team(String nameOfTeam, Athlete athlete1, Athlete athlete2, Athlete athlete3, Athlete athlete4) {
        this.nameOfTeam = nameOfTeam;
        competitors[0] = athlete1;
        competitors[1] = athlete2;
        competitors[2] = athlete3;
        competitors[3] = athlete4;
    }

    public void teamInfo() {
        for (Athlete athlete: competitors) {
            System.out.println("Athlete: " + athlete.name + "; \t Abilities: Max Run distance - " + athlete.maxRun + " km.");
        }
    }

    public void teamWinnerInfo() {
        for (Athlete athlete: competitors) {
            if (athlete.isWinner) {
                System.out.println("Athlete " + athlete.name + " got through all courses successfully!!!");
            }
        }
    }
}




