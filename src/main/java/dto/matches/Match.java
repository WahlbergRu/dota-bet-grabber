package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Match {
    private long matchID;
    private long barracksStatusDire;
    private long barracksStatusRadiant;
    private Chat[] chat;
    private long cluster;
    private Map<String, Long> cosmetics;
    private long direScore;
    private long direTeamID;
    private DraftTiming[] draftTimings;
    private long duration;
    private long engine;
    private long firstBloodTime;
    private long gameMode;
    private long humanPlayers;
    private long leagueid;
    private long lobbyType;
    private long matchSeqNum;
    private long negativeVotes;
    private Objective[] objectives;
    private PicksBan[] picksBans;
    private long positiveVotes;
    private long[] radiantGoldAdv;
    private long radiantScore;
    private long radiantTeamID;
    private boolean radiantWin;
    private long[] radiantXPAdv;
    private Object skill;
    private long startTime;
    private Teamfight[] teamfights;
    private long towerStatusDire;
    private long towerStatusRadiant;
    private long version;
    private long replaySalt;
    private long seriesID;
    private long seriesType;
    private League league;
    private Teamfight.Team direTeam;
    private Teamfight.Team radiantTeam;
    private MatchPlayer[] players;
    private long patch;
    private long region;
    private Map<String, Long> allWordCounts;
    private MyWordCounts myWordCounts;
    private long matchThrow;
    private long loss;
    private String replayURL;

    @JsonProperty("match_id")
    public long getMatchID() { return matchID; }
    @JsonProperty("match_id")
    public void setMatchID(long value) { this.matchID = value; }

    @JsonProperty("barracks_status_dire")
    public long getBarracksStatusDire() { return barracksStatusDire; }
    @JsonProperty("barracks_status_dire")
    public void setBarracksStatusDire(long value) { this.barracksStatusDire = value; }

    @JsonProperty("barracks_status_radiant")
    public long getBarracksStatusRadiant() { return barracksStatusRadiant; }
    @JsonProperty("barracks_status_radiant")
    public void setBarracksStatusRadiant(long value) { this.barracksStatusRadiant = value; }

    @JsonProperty("chat")
    public Chat[] getChat() { return chat; }
    @JsonProperty("chat")
    public void setChat(Chat[] value) { this.chat = value; }

    @JsonProperty("cluster")
    public long getCluster() { return cluster; }
    @JsonProperty("cluster")
    public void setCluster(long value) { this.cluster = value; }

    @JsonProperty("cosmetics")
    public Map<String, Long> getCosmetics() { return cosmetics; }
    @JsonProperty("cosmetics")
    public void setCosmetics(Map<String, Long> value) { this.cosmetics = value; }

    @JsonProperty("dire_score")
    public long getDireScore() { return direScore; }
    @JsonProperty("dire_score")
    public void setDireScore(long value) { this.direScore = value; }

    @JsonProperty("dire_team_id")
    public long getDireTeamID() { return direTeamID; }
    @JsonProperty("dire_team_id")
    public void setDireTeamID(long value) { this.direTeamID = value; }

    @JsonProperty("draft_timings")
    public DraftTiming[] getDraftTimings() { return draftTimings; }
    @JsonProperty("draft_timings")
    public void setDraftTimings(DraftTiming[] value) { this.draftTimings = value; }

    @JsonProperty("duration")
    public long getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(long value) { this.duration = value; }

    @JsonProperty("engine")
    public long getEngine() { return engine; }
    @JsonProperty("engine")
    public void setEngine(long value) { this.engine = value; }

    @JsonProperty("first_blood_time")
    public long getFirstBloodTime() { return firstBloodTime; }
    @JsonProperty("first_blood_time")
    public void setFirstBloodTime(long value) { this.firstBloodTime = value; }

    @JsonProperty("game_mode")
    public long getGameMode() { return gameMode; }
    @JsonProperty("game_mode")
    public void setGameMode(long value) { this.gameMode = value; }

    @JsonProperty("human_players")
    public long getHumanPlayers() { return humanPlayers; }
    @JsonProperty("human_players")
    public void setHumanPlayers(long value) { this.humanPlayers = value; }

    @JsonProperty("leagueid")
    public long getLeagueid() { return leagueid; }
    @JsonProperty("leagueid")
    public void setLeagueid(long value) { this.leagueid = value; }

    @JsonProperty("lobby_type")
    public long getLobbyType() { return lobbyType; }
    @JsonProperty("lobby_type")
    public void setLobbyType(long value) { this.lobbyType = value; }

    @JsonProperty("match_seq_num")
    public long getMatchSeqNum() { return matchSeqNum; }
    @JsonProperty("match_seq_num")
    public void setMatchSeqNum(long value) { this.matchSeqNum = value; }

    @JsonProperty("negative_votes")
    public long getNegativeVotes() { return negativeVotes; }
    @JsonProperty("negative_votes")
    public void setNegativeVotes(long value) { this.negativeVotes = value; }

    @JsonProperty("objectives")
    public Objective[] getObjectives() { return objectives; }
    @JsonProperty("objectives")
    public void setObjectives(Objective[] value) { this.objectives = value; }

    @JsonProperty("picks_bans")
    public PicksBan[] getPicksBans() { return picksBans; }
    @JsonProperty("picks_bans")
    public void setPicksBans(PicksBan[] value) { this.picksBans = value; }

    @JsonProperty("positive_votes")
    public long getPositiveVotes() { return positiveVotes; }
    @JsonProperty("positive_votes")
    public void setPositiveVotes(long value) { this.positiveVotes = value; }

    @JsonProperty("radiant_gold_adv")
    public long[] getRadiantGoldAdv() { return radiantGoldAdv; }
    @JsonProperty("radiant_gold_adv")
    public void setRadiantGoldAdv(long[] value) { this.radiantGoldAdv = value; }

    @JsonProperty("radiant_score")
    public long getRadiantScore() { return radiantScore; }
    @JsonProperty("radiant_score")
    public void setRadiantScore(long value) { this.radiantScore = value; }

    @JsonProperty("radiant_team_id")
    public long getRadiantTeamID() { return radiantTeamID; }
    @JsonProperty("radiant_team_id")
    public void setRadiantTeamID(long value) { this.radiantTeamID = value; }

    @JsonProperty("radiant_win")
    public boolean getRadiantWin() { return radiantWin; }
    @JsonProperty("radiant_win")
    public void setRadiantWin(boolean value) { this.radiantWin = value; }

    @JsonProperty("radiant_xp_adv")
    public long[] getRadiantXPAdv() { return radiantXPAdv; }
    @JsonProperty("radiant_xp_adv")
    public void setRadiantXPAdv(long[] value) { this.radiantXPAdv = value; }

    @JsonProperty("skill")
    public Object getSkill() { return skill; }
    @JsonProperty("skill")
    public void setSkill(Object value) { this.skill = value; }

    @JsonProperty("start_time")
    public long getStartTime() { return startTime; }
    @JsonProperty("start_time")
    public void setStartTime(long value) { this.startTime = value; }

    @JsonProperty("teamfights")
    public Teamfight[] getTeamfights() { return teamfights; }
    @JsonProperty("teamfights")
    public void setTeamfights(Teamfight[] value) { this.teamfights = value; }

    @JsonProperty("tower_status_dire")
    public long getTowerStatusDire() { return towerStatusDire; }
    @JsonProperty("tower_status_dire")
    public void setTowerStatusDire(long value) { this.towerStatusDire = value; }

    @JsonProperty("tower_status_radiant")
    public long getTowerStatusRadiant() { return towerStatusRadiant; }
    @JsonProperty("tower_status_radiant")
    public void setTowerStatusRadiant(long value) { this.towerStatusRadiant = value; }

    @JsonProperty("version")
    public long getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(long value) { this.version = value; }

    @JsonProperty("replay_salt")
    public long getReplaySalt() { return replaySalt; }
    @JsonProperty("replay_salt")
    public void setReplaySalt(long value) { this.replaySalt = value; }

    @JsonProperty("series_id")
    public long getSeriesID() { return seriesID; }
    @JsonProperty("series_id")
    public void setSeriesID(long value) { this.seriesID = value; }

    @JsonProperty("series_type")
    public long getSeriesType() { return seriesType; }
    @JsonProperty("series_type")
    public void setSeriesType(long value) { this.seriesType = value; }

    @JsonProperty("league")
    public League getLeague() { return league; }
    @JsonProperty("league")
    public void setLeague(League value) { this.league = value; }

    @JsonProperty("dire_team")
    public Teamfight.Team getDireTeam() { return direTeam; }
    @JsonProperty("dire_team")
    public void setDireTeam(Teamfight.Team value) { this.direTeam = value; }

    @JsonProperty("radiant_team")
    public Teamfight.Team getRadiantTeam() { return radiantTeam; }
    @JsonProperty("radiant_team")
    public void setRadiantTeam(Teamfight.Team value) { this.radiantTeam = value; }

    @JsonProperty("players")
    public MatchPlayer[] getPlayers() { return players; }
    @JsonProperty("players")
    public void setPlayers(MatchPlayer[] value) { this.players = value; }

    @JsonProperty("patch")
    public long getPatch() { return patch; }
    @JsonProperty("patch")
    public void setPatch(long value) { this.patch = value; }

    @JsonProperty("region")
    public long getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(long value) { this.region = value; }

    @JsonProperty("all_word_counts")
    public Map<String, Long> getAllWordCounts() { return allWordCounts; }
    @JsonProperty("all_word_counts")
    public void setAllWordCounts(Map<String, Long> value) { this.allWordCounts = value; }

    @JsonProperty("my_word_counts")
    public MyWordCounts getMyWordCounts() { return myWordCounts; }
    @JsonProperty("my_word_counts")
    public void setMyWordCounts(MyWordCounts value) { this.myWordCounts = value; }

    @JsonProperty("throw")
    public long getMatchThrow() { return matchThrow; }
    @JsonProperty("throw")
    public void setMatchThrow(long value) { this.matchThrow = value; }

    @JsonProperty("loss")
    public long getLoss() { return loss; }
    @JsonProperty("loss")
    public void setLoss(long value) { this.loss = value; }

    @JsonProperty("replay_url")
    public String getReplayURL() { return replayURL; }
    @JsonProperty("replay_url")
    public void setReplayURL(String value) { this.replayURL = value; }
}
