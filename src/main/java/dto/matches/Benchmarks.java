package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Benchmarks {
    private Map<String, Double> goldPerMin;
    private Map<String, Double> xpPerMin;
    private Map<String, Double> killsPerMin;
    private Map<String, Double> lastHitsPerMin;
    private Map<String, Double> heroDamagePerMin;
    private Map<String, Double> heroHealingPerMin;
    private Map<String, Double> towerDamage;
    private Map<String, Double> stunsPerMin;
    private Map<String, Double> lhten;

    @JsonProperty("gold_per_min")
    public Map<String, Double> getGoldPerMin() { return goldPerMin; }
    @JsonProperty("gold_per_min")
    public void setGoldPerMin(Map<String, Double> value) { this.goldPerMin = value; }

    @JsonProperty("xp_per_min")
    public Map<String, Double> getXPPerMin() { return xpPerMin; }
    @JsonProperty("xp_per_min")
    public void setXPPerMin(Map<String, Double> value) { this.xpPerMin = value; }

    @JsonProperty("kills_per_min")
    public Map<String, Double> getKillsPerMin() { return killsPerMin; }
    @JsonProperty("kills_per_min")
    public void setKillsPerMin(Map<String, Double> value) { this.killsPerMin = value; }

    @JsonProperty("last_hits_per_min")
    public Map<String, Double> getLastHitsPerMin() { return lastHitsPerMin; }
    @JsonProperty("last_hits_per_min")
    public void setLastHitsPerMin(Map<String, Double> value) { this.lastHitsPerMin = value; }

    @JsonProperty("hero_damage_per_min")
    public Map<String, Double> getHeroDamagePerMin() { return heroDamagePerMin; }
    @JsonProperty("hero_damage_per_min")
    public void setHeroDamagePerMin(Map<String, Double> value) { this.heroDamagePerMin = value; }

    @JsonProperty("hero_healing_per_min")
    public Map<String, Double> getHeroHealingPerMin() { return heroHealingPerMin; }
    @JsonProperty("hero_healing_per_min")
    public void setHeroHealingPerMin(Map<String, Double> value) { this.heroHealingPerMin = value; }

    @JsonProperty("tower_damage")
    public Map<String, Double> getTowerDamage() { return towerDamage; }
    @JsonProperty("tower_damage")
    public void setTowerDamage(Map<String, Double> value) { this.towerDamage = value; }

    @JsonProperty("stuns_per_min")
    public Map<String, Double> getStunsPerMin() { return stunsPerMin; }
    @JsonProperty("stuns_per_min")
    public void setStunsPerMin(Map<String, Double> value) { this.stunsPerMin = value; }

    @JsonProperty("lhten")
    public Map<String, Double> getLhten() { return lhten; }
    @JsonProperty("lhten")
    public void setLhten(Map<String, Double> value) { this.lhten = value; }
}
