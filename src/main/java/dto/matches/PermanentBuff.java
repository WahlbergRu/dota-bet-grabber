package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PermanentBuff {
    private long permanentBuff;
    private long stackCount;

    @JsonProperty("permanent_buff")
    public long getPermanentBuff() { return permanentBuff; }
    @JsonProperty("permanent_buff")
    public void setPermanentBuff(long value) { this.permanentBuff = value; }

    @JsonProperty("stack_count")
    public long getStackCount() { return stackCount; }
    @JsonProperty("stack_count")
    public void setStackCount(long value) { this.stackCount = value; }
}
