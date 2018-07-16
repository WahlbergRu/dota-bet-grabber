package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DragonKnightBreatheFire {
    private long npcDotaHeroNightStalker;
    private Long npcDotaHeroPhantomLancer;
    private long npcDotaHeroLina;
    private long npcDotaHeroNagaSiren;
    private Long npcDotaHeroJakiro;

    @JsonProperty("npc_dota_hero_night_stalker")
    public long getNpcDotaHeroNightStalker() { return npcDotaHeroNightStalker; }
    @JsonProperty("npc_dota_hero_night_stalker")
    public void setNpcDotaHeroNightStalker(long value) { this.npcDotaHeroNightStalker = value; }

    @JsonProperty("npc_dota_hero_phantom_lancer")
    public Long getNpcDotaHeroPhantomLancer() { return npcDotaHeroPhantomLancer; }
    @JsonProperty("npc_dota_hero_phantom_lancer")
    public void setNpcDotaHeroPhantomLancer(Long value) { this.npcDotaHeroPhantomLancer = value; }

    @JsonProperty("npc_dota_hero_lina")
    public long getNpcDotaHeroLina() { return npcDotaHeroLina; }
    @JsonProperty("npc_dota_hero_lina")
    public void setNpcDotaHeroLina(long value) { this.npcDotaHeroLina = value; }

    @JsonProperty("npc_dota_hero_naga_siren")
    public long getNpcDotaHeroNagaSiren() { return npcDotaHeroNagaSiren; }
    @JsonProperty("npc_dota_hero_naga_siren")
    public void setNpcDotaHeroNagaSiren(long value) { this.npcDotaHeroNagaSiren = value; }

    @JsonProperty("npc_dota_hero_jakiro")
    public Long getNpcDotaHeroJakiro() { return npcDotaHeroJakiro; }
    @JsonProperty("npc_dota_hero_jakiro")
    public void setNpcDotaHeroJakiro(Long value) { this.npcDotaHeroJakiro = value; }
}
