
package dto.teams;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Matches {
    private long matchID;
    private boolean radiantWin;
    private boolean radiant;
    private long duration;
    private long startTime;
    private long leagueid;
    private String leagueName;
    private long cluster;
    private long opposingTeamID;
    private String opposingTeamName;
    private String opposingTeamLogo;

    @JsonProperty("match_id")
    public long getMatchID() { return matchID; }
    @JsonProperty("match_id")
    public void setMatchID(long value) { this.matchID = value; }

    @JsonProperty("radiant_win")
    public boolean getRadiantWin() { return radiantWin; }
    @JsonProperty("radiant_win")
    public void setRadiantWin(boolean value) { this.radiantWin = value; }

    @JsonProperty("radiant")
    public boolean getRadiant() { return radiant; }
    @JsonProperty("radiant")
    public void setRadiant(boolean value) { this.radiant = value; }

    @JsonProperty("duration")
    public long getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(long value) { this.duration = value; }

    @JsonProperty("start_time")
    public long getStartTime() { return startTime; }
    @JsonProperty("start_time")
    public void setStartTime(long value) { this.startTime = value; }

    @JsonProperty("leagueid")
    public long getLeagueid() { return leagueid; }
    @JsonProperty("leagueid")
    public void setLeagueid(long value) { this.leagueid = value; }

    @JsonProperty("league_name")
    public String getLeagueName() { return leagueName; }
    @JsonProperty("league_name")
    public void setLeagueName(String value) { this.leagueName = value; }

    @JsonProperty("cluster")
    public long getCluster() { return cluster; }
    @JsonProperty("cluster")
    public void setCluster(long value) { this.cluster = value; }

    @JsonProperty("opposing_team_id")
    public long getOpposingTeamID() { return opposingTeamID; }
    @JsonProperty("opposing_team_id")
    public void setOpposingTeamID(long value) { this.opposingTeamID = value; }

    @JsonProperty("opposing_team_name")
    public String getOpposingTeamName() { return opposingTeamName; }
    @JsonProperty("opposing_team_name")
    public void setOpposingTeamName(String value) { this.opposingTeamName = value; }

    @JsonProperty("opposing_team_logo")
    public String getOpposingTeamLogo() { return opposingTeamLogo; }
    @JsonProperty("opposing_team_logo")
    public void setOpposingTeamLogo(String value) { this.opposingTeamLogo = value; }
}
