package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObsLeftLogElement {
    private long time;
    private ObsLeftLogType type;
    private String key;
    private long slot;
    private long x;
    private long y;
    private long z;
    private boolean entityleft;
    private long ehandle;
    private long playerSlot;

    @JsonProperty("time")
    public long getTime() { return time; }
    @JsonProperty("time")
    public void setTime(long value) { this.time = value; }

    @JsonProperty("type")
    public ObsLeftLogType getType() { return type; }
    @JsonProperty("type")
    public void setType(ObsLeftLogType value) { this.type = value; }

    @JsonProperty("key")
    public String getKey() { return key; }
    @JsonProperty("key")
    public void setKey(String value) { this.key = value; }

    @JsonProperty("slot")
    public long getSlot() { return slot; }
    @JsonProperty("slot")
    public void setSlot(long value) { this.slot = value; }

    @JsonProperty("x")
    public long getX() { return x; }
    @JsonProperty("x")
    public void setX(long value) { this.x = value; }

    @JsonProperty("y")
    public long getY() { return y; }
    @JsonProperty("y")
    public void setY(long value) { this.y = value; }

    @JsonProperty("z")
    public long getZ() { return z; }
    @JsonProperty("z")
    public void setZ(long value) { this.z = value; }

    @JsonProperty("entityleft")
    public boolean getEntityleft() { return entityleft; }
    @JsonProperty("entityleft")
    public void setEntityleft(boolean value) { this.entityleft = value; }

    @JsonProperty("ehandle")
    public long getEhandle() { return ehandle; }
    @JsonProperty("ehandle")
    public void setEhandle(long value) { this.ehandle = value; }

    @JsonProperty("player_slot")
    public long getPlayerSlot() { return playerSlot; }
    @JsonProperty("player_slot")
    public void setPlayerSlot(long value) { this.playerSlot = value; }
}
