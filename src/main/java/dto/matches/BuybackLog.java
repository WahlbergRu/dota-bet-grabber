package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuybackLog {
    private long time;
    private long slot;
    private BuybackLogType type;
    private long playerSlot;

    @JsonProperty("time")
    public long getTime() { return time; }
    @JsonProperty("time")
    public void setTime(long value) { this.time = value; }

    @JsonProperty("slot")
    public long getSlot() { return slot; }
    @JsonProperty("slot")
    public void setSlot(long value) { this.slot = value; }

    @JsonProperty("type")
    public BuybackLogType getType() { return type; }
    @JsonProperty("type")
    public void setType(BuybackLogType value) { this.type = value; }

    @JsonProperty("player_slot")
    public long getPlayerSlot() { return playerSlot; }
    @JsonProperty("player_slot")
    public void setPlayerSlot(long value) { this.playerSlot = value; }
}
