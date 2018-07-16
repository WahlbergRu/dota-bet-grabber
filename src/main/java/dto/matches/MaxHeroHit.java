package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MaxHeroHit {
    private MaxHeroHitType type;
    private long time;
    private boolean max;
    private String inflictor;
    private String unit;
    private String key;
    private long value;
    private long slot;
    private long playerSlot;

    @JsonProperty("type")
    public MaxHeroHitType getType() { return type; }
    @JsonProperty("type")
    public void setType(MaxHeroHitType value) { this.type = value; }

    @JsonProperty("time")
    public long getTime() { return time; }
    @JsonProperty("time")
    public void setTime(long value) { this.time = value; }

    @JsonProperty("max")
    public boolean getMax() { return max; }
    @JsonProperty("max")
    public void setMax(boolean value) { this.max = value; }

    @JsonProperty("inflictor")
    public String getInflictor() { return inflictor; }
    @JsonProperty("inflictor")
    public void setInflictor(String value) { this.inflictor = value; }

    @JsonProperty("unit")
    public String getUnit() { return unit; }
    @JsonProperty("unit")
    public void setUnit(String value) { this.unit = value; }

    @JsonProperty("key")
    public String getKey() { return key; }
    @JsonProperty("key")
    public void setKey(String value) { this.key = value; }

    @JsonProperty("value")
    public long getValue() { return value; }
    @JsonProperty("value")
    public void setValue(long value) { this.value = value; }

    @JsonProperty("slot")
    public long getSlot() { return slot; }
    @JsonProperty("slot")
    public void setSlot(long value) { this.slot = value; }

    @JsonProperty("player_slot")
    public long getPlayerSlot() { return playerSlot; }
    @JsonProperty("player_slot")
    public void setPlayerSlot(long value) { this.playerSlot = value; }
}
