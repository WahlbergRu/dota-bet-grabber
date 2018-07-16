package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Teamfight {
    private long start;
    private long end;
    private long lastDeath;
    private long deaths;
    private TeamfightPlayer[] players;

    @JsonProperty("start")
    public long getStart() { return start; }
    @JsonProperty("start")
    public void setStart(long value) { this.start = value; }

    @JsonProperty("end")
    public long getEnd() { return end; }
    @JsonProperty("end")
    public void setEnd(long value) { this.end = value; }

    @JsonProperty("last_death")
    public long getLastDeath() { return lastDeath; }
    @JsonProperty("last_death")
    public void setLastDeath(long value) { this.lastDeath = value; }

    @JsonProperty("deaths")
    public long getDeaths() { return deaths; }
    @JsonProperty("deaths")
    public void setDeaths(long value) { this.deaths = value; }

    @JsonProperty("players")
    public TeamfightPlayer[] getPlayers() { return players; }
    @JsonProperty("players")
    public void setPlayers(TeamfightPlayer[] value) { this.players = value; }

    public static class Team {
        private long teamID;
        private String name;
        private String tag;
        private String logoURL;

        @JsonProperty("team_id")
        public long getTeamID() { return teamID; }
        @JsonProperty("team_id")
        public void setTeamID(long value) { this.teamID = value; }

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
}
