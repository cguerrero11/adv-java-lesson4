package chrisg.Enums;

public enum Teams {
    MILWAUKEE_BUCKS("MIL"), CHICAGO_BULLS("CHI"), INDIANA_PACERS("IND");

    private String teams;
    Teams(String teams){
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "Team " + teams;
    }
}
