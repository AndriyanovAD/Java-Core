package HW1;

public class Main {

    public static void main(String[] args) {


        Athlete athlete1 = new Athlete("Sergey", 10);
        Athlete athlete2 = new Athlete("Andrey", 15);
        Athlete athlete3 = new Athlete("Maria", 8);
        Athlete athlete4 = new Athlete("Svetlana", 12);

        Course courses = new Course(10, 12);


        Team team = new Team("First team", athlete1, athlete2, athlete3, athlete4);

        team.teamInfo();

        System.out.println("");
        courses.doCourse(team);

        System.out.println("");


        team.teamWinnerInfo();
    }
}

