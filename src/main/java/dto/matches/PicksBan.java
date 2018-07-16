package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PicksBan {
    private boolean isPick;
    private long heroID;
    private long team;
    private long order;
    private long ord;
    private long matchID;

    @JsonProperty("is_pick")
    public boolean getIsPick() { return isPick; }
    @JsonProperty("is_pick")
    public void setIsPick(boolean value) { this.isPick = value; }

    @JsonProperty("hero_id")
    public long getHeroID() { return heroID; }
    @JsonProperty("hero_id")
    public void setHeroID(long value) { this.heroID = value; }

    @JsonProperty("team")
    public long getTeam() { return team; }
    @JsonProperty("team")
    public void setTeam(long value) { this.team = value; }

    @JsonProperty("order")
    public long getOrder() { return order; }
    @JsonProperty("order")
    public void setOrder(long value) { this.order = value; }

    @JsonProperty("ord")
    public long getOrd() { return ord; }
    @JsonProperty("ord")
    public void setOrd(long value) { this.ord = value; }

    @JsonProperty("match_id")
    public long getMatchID() { return matchID; }
    @JsonProperty("match_id")
    public void setMatchID(long value) { this.matchID = value; }
}
