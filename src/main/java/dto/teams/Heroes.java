package dto.teams;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Heroes {
    private long heroID;
    private String localizedName;
    private long gamesPlayed;
    private long wins;

    @JsonProperty("hero_id")
    public long getHeroID() { return heroID; }
    @JsonProperty("hero_id")
    public void setHeroID(long value) { this.heroID = value; }

    @JsonProperty("localized_name")
    public String getLocalizedName() { return localizedName; }
    @JsonProperty("localized_name")
    public void setLocalizedName(String value) { this.localizedName = value; }

    @JsonProperty("games_played")
    public long getGamesPlayed() { return gamesPlayed; }
    @JsonProperty("games_played")
    public void setGamesPlayed(long value) { this.gamesPlayed = value; }

    @JsonProperty("wins")
    public long getWINS() { return wins; }
    @JsonProperty("wins")
    public void setWINS(long value) { this.wins = value; }
}

