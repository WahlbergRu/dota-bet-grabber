package dto.teams;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Players {
    private long accountID;
    private String name;
    private long gamesPlayed;
    private long wins;
    private Boolean isCurrentTeamMember;

    @JsonProperty("account_id")
    public long getAccountID() { return accountID; }
    @JsonProperty("account_id")
    public void setAccountID(long value) { this.accountID = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("games_played")
    public long getGamesPlayed() { return gamesPlayed; }
    @JsonProperty("games_played")
    public void setGamesPlayed(long value) { this.gamesPlayed = value; }

    @JsonProperty("wins")
    public long getWINS() { return wins; }
    @JsonProperty("wins")
    public void setWINS(long value) { this.wins = value; }

    @JsonProperty("is_current_team_member")
    public Boolean getIsCurrentTeamMember() { return isCurrentTeamMember; }
    @JsonProperty("is_current_team_member")
    public void setIsCurrentTeamMember(Boolean value) { this.isCurrentTeamMember = value; }
}

