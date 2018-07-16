package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KillsLogElement {
    private long time;
    private String key;

    @JsonProperty("time")
    public long getTime() { return time; }
    @JsonProperty("time")
    public void setTime(long value) { this.time = value; }

    @JsonProperty("key")
    public String getKey() { return key; }
    @JsonProperty("key")
    public void setKey(String value) { this.key = value; }
}
