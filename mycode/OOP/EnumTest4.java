public class EnumTest4 {
    public static void main(String[] args) {
        for (SoccerTeam team : SoccerTeam.values()) {
            System.out.println("Team: " + team.getTeamName() + ", Country: " + team.getCountry());
        }
    }
}
