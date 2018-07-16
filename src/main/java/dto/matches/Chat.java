package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chat {
    private long time;
    private ChatType type;
    private String key;
    private long slot;
    private long playerSlot;
    private String unit;

    @JsonProperty("time")
    public long getTime() { return time; }
    @JsonProperty("time")
    public void setTime(long value) { this.time = value; }

    @JsonProperty("type")
    public ChatType getType() { return type; }
    @JsonProperty("type")
    public void setType(ChatType value) { this.type = value; }

    @JsonProperty("key")
    public String getKey() { return key; }
    @JsonProperty("key")
    public void setKey(String value) { this.key = value; }

    @JsonProperty("slot")
    public long getSlot() { return slot; }
    @JsonProperty("slot")
    public void setSlot(long value) { this.slot = value; }

    @JsonProperty("player_slot")
    public long getPlayerSlot() { return playerSlot; }
    @JsonProperty("player_slot")
    public void setPlayerSlot(long value) { this.playerSlot = value; }

    @JsonProperty("unit")
    public String getUnit() { return unit; }
    @JsonProperty("unit")
    public void setUnit(String value) { this.unit = value; }
}
