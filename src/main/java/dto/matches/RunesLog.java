package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RunesLog {
    private long time;
    private long key;

    @JsonProperty("time")
    public long getTime() { return time; }
    @JsonProperty("time")
    public void setTime(long value) { this.time = value; }

    @JsonProperty("key")
    public long getKey() { return key; }
    @JsonProperty("key")
    public void setKey(long value) { this.key = value; }
}
