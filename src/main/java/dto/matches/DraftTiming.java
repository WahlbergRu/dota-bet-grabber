package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DraftTiming {
    private long order;
    private boolean pick;
    private long activeTeam;
    private long heroID;
    private Long playerSlot;
    private long extraTime;
    private long totalTimeTaken;

    @JsonProperty("order")
    public long getOrder() { return order; }
    @JsonProperty("order")
    public void setOrder(long value) { this.order = value; }

    @JsonProperty("pick")
    public boolean getPick() { return pick; }
    @JsonProperty("pick")
    public void setPick(boolean value) { this.pick = value; }

    @JsonProperty("active_team")
    public long getActiveTeam() { return activeTeam; }
    @JsonProperty("active_team")
    public void setActiveTeam(long value) { this.activeTeam = value; }

    @JsonProperty("hero_id")
    public long getHeroID() { return heroID; }
    @JsonProperty("hero_id")
    public void setHeroID(long value) { this.heroID = value; }

    @JsonProperty("player_slot")
    public Long getPlayerSlot() { return playerSlot; }
    @JsonProperty("player_slot")
    public void setPlayerSlot(Long value) { this.playerSlot = value; }

    @JsonProperty("extra_time")
    public long getExtraTime() { return extraTime; }
    @JsonProperty("extra_time")
    public void setExtraTime(long value) { this.extraTime = value; }

    @JsonProperty("total_time_taken")
    public long getTotalTimeTaken() { return totalTimeTaken; }
    @JsonProperty("total_time_taken")
    public void setTotalTimeTaken(long value) { this.totalTimeTaken = value; }
}
