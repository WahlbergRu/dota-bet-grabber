package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class TeamfightPlayer {
    private Map<String, Map<String, Long>> deathsPos;
    private Map<String, Long> abilityUses;
    private MyWordCounts abilityTargets;
    private Map<String, Long> itemUses;
    private Map<String, Long> killed;
    private long deaths;
    private long buybacks;
    private long damage;
    private long healing;
    private long goldDelta;
    private long xpDelta;
    private long xpStart;
    private long xpEnd;

    @JsonProperty("deaths_pos")
    public Map<String, Map<String, Long>> getDeathsPos() { return deathsPos; }
    @JsonProperty("deaths_pos")
    public void setDeathsPos(Map<String, Map<String, Long>> value) { this.deathsPos = value; }

    @JsonProperty("ability_uses")
    public Map<String, Long> getAbilityUses() { return abilityUses; }
    @JsonProperty("ability_uses")
    public void setAbilityUses(Map<String, Long> value) { this.abilityUses = value; }

    @JsonProperty("ability_targets")
    public MyWordCounts getAbilityTargets() { return abilityTargets; }
    @JsonProperty("ability_targets")
    public void setAbilityTargets(MyWordCounts value) { this.abilityTargets = value; }

    @JsonProperty("item_uses")
    public Map<String, Long> getItemUses() { return itemUses; }
    @JsonProperty("item_uses")
    public void setItemUses(Map<String, Long> value) { this.itemUses = value; }

    @JsonProperty("killed")
    public Map<String, Long> getKilled() { return killed; }
    @JsonProperty("killed")
    public void setKilled(Map<String, Long> value) { this.killed = value; }

    @JsonProperty("deaths")
    public long getDeaths() { return deaths; }
    @JsonProperty("deaths")
    public void setDeaths(long value) { this.deaths = value; }

    @JsonProperty("buybacks")
    public long getBuybacks() { return buybacks; }
    @JsonProperty("buybacks")
    public void setBuybacks(long value) { this.buybacks = value; }

    @JsonProperty("damage")
    public long getDamage() { return damage; }
    @JsonProperty("damage")
    public void setDamage(long value) { this.damage = value; }

    @JsonProperty("healing")
    public long getHealing() { return healing; }
    @JsonProperty("healing")
    public void setHealing(long value) { this.healing = value; }

    @JsonProperty("gold_delta")
    public long getGoldDelta() { return goldDelta; }
    @JsonProperty("gold_delta")
    public void setGoldDelta(long value) { this.goldDelta = value; }

    @JsonProperty("xp_delta")
    public long getXPDelta() { return xpDelta; }
    @JsonProperty("xp_delta")
    public void setXPDelta(long value) { this.xpDelta = value; }

    @JsonProperty("xp_start")
    public long getXPStart() { return xpStart; }
    @JsonProperty("xp_start")
    public void setXPStart(long value) { this.xpStart = value; }

    @JsonProperty("xp_end")
    public long getXPEnd() { return xpEnd; }
    @JsonProperty("xp_end")
    public void setXPEnd(long value) { this.xpEnd = value; }
}
