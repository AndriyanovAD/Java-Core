package HW1;

public class Course {

    int[] course = new int[2];

    public Course(int distance1, int distance2) {
        course[0] = distance1;
        course[1] = distance2;

    }

    public void doCourse(Team team) {
        for (Athlete athlete: team.competitors){
            for (int distance: course) {
                if (athlete.maxRun >= distance) {
                    athlete.isWinner = true;
                } else {
                    athlete.isWinner = false;
                    break;
                }
            }
        }
    }
}
