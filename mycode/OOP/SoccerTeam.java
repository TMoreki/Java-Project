public enum SoccerTeam {
    MANCHESTER_UNITED("Manchester United", "England"),
    BARCELONA("Barcelona", "Spain"),
    REAL_MADRID("Real Madrid", "Spain"),
    BAYERN_MUNICH("Bayern Munich", "Germany");

    private final String teamName;
    private final String country;

    SoccerTeam(String teamName, String country) {
        this.teamName = teamName;
        this.country = country;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCountry() {
        return country;
    }
}