package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JakiroDualBreath {
    private Long npcDotaHeroMonkeyKing;
    private long npcDotaHeroRattletrap;
    private long npcDotaHeroDragonKnight;
    private long npcDotaHeroPhoenix;
    private Long npcDotaHeroWindrunner;

    @JsonProperty("npc_dota_hero_monkey_king")
    public Long getNpcDotaHeroMonkeyKing() { return npcDotaHeroMonkeyKing; }
    @JsonProperty("npc_dota_hero_monkey_king")
    public void setNpcDotaHeroMonkeyKing(Long value) { this.npcDotaHeroMonkeyKing = value; }

    @JsonProperty("npc_dota_hero_rattletrap")
    public long getNpcDotaHeroRattletrap() { return npcDotaHeroRattletrap; }
    @JsonProperty("npc_dota_hero_rattletrap")
    public void setNpcDotaHeroRattletrap(long value) { this.npcDotaHeroRattletrap = value; }

    @JsonProperty("npc_dota_hero_dragon_knight")
    public long getNpcDotaHeroDragonKnight() { return npcDotaHeroDragonKnight; }
    @JsonProperty("npc_dota_hero_dragon_knight")
    public void setNpcDotaHeroDragonKnight(long value) { this.npcDotaHeroDragonKnight = value; }

    @JsonProperty("npc_dota_hero_phoenix")
    public long getNpcDotaHeroPhoenix() { return npcDotaHeroPhoenix; }
    @JsonProperty("npc_dota_hero_phoenix")
    public void setNpcDotaHeroPhoenix(long value) { this.npcDotaHeroPhoenix = value; }

    @JsonProperty("npc_dota_hero_windrunner")
    public Long getNpcDotaHeroWindrunner() { return npcDotaHeroWindrunner; }
    @JsonProperty("npc_dota_hero_windrunner")
    public void setNpcDotaHeroWindrunner(Long value) { this.npcDotaHeroWindrunner = value; }
}
