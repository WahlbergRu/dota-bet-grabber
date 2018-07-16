package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Objective {
    private long time;
    private ObjectiveType type;
    private Long slot;
    private Key key;
    private Long playerSlot;
    private String unit;
    private Long team;

    @JsonProperty("time")
    public long getTime() { return time; }
    @JsonProperty("time")
    public void setTime(long value) { this.time = value; }

    @JsonProperty("type")
    public ObjectiveType getType() { return type; }
    @JsonProperty("type")
    public void setType(ObjectiveType value) { this.type = value; }

    @JsonProperty("slot")
    public Long getSlot() { return slot; }
    @JsonProperty("slot")
    public void setSlot(Long value) { this.slot = value; }

    @JsonProperty("key")
    public Key getKey() { return key; }
    @JsonProperty("key")
    public void setKey(Key value) { this.key = value; }

    @JsonProperty("player_slot")
    public Long getPlayerSlot() { return playerSlot; }
    @JsonProperty("player_slot")
    public void setPlayerSlot(Long value) { this.playerSlot = value; }

    @JsonProperty("unit")
    public String getUnit() { return unit; }
    @JsonProperty("unit")
    public void setUnit(String value) { this.unit = value; }

    @JsonProperty("team")
    public Long getTeam() { return team; }
    @JsonProperty("team")
    public void setTeam(Long value) { this.team = value; }
}
