package dto.teams;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Team {
    private long teamID;
    private double rating;
    private long wins;
    private long losses;
    private long lastMatchTime;
    private String name;
    private String tag;
    private String logoURL;

    @JsonProperty("team_id")
    public long getTeamID() { return teamID; }
    @JsonProperty("team_id")
    public void setTeamID(long value) { this.teamID = value; }

    @JsonProperty("rating")
    public double getRating() { return rating; }
    @JsonProperty("rating")
    public void setRating(double value) { this.rating = value; }

    @JsonProperty("wins")
    public long getWINS() { return wins; }
    @JsonProperty("wins")
    public void setWINS(long value) { this.wins = value; }

    @JsonProperty("losses")
    public long getLosses() { return losses; }
    @JsonProperty("losses")
    public void setLosses(long value) { this.losses = value; }

    @JsonProperty("last_match_time")
    public long getLastMatchTime() { return lastMatchTime; }
    @JsonProperty("last_match_time")
    public void setLastMatchTime(long value) { this.lastMatchTime = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("tag")
    public String getTag() { return tag; }
    @JsonProperty("tag")
    public void setTag(String value) { this.tag = value; }

    @JsonProperty("logo_url")
    public String getLogoURL() { return logoURL; }
    @JsonProperty("logo_url")
    public void setLogoURL(String value) { this.logoURL = value; }
}
