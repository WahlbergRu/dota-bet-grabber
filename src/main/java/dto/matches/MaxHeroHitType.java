package dto.matches;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum MaxHeroHitType {
    MAX_HERO_HIT;

    @JsonValue
    public String toValue() {
        switch (this) {
        case MAX_HERO_HIT: return "max_hero_hit";
        }
        return null;
    }

    @JsonCreator
    public static MaxHeroHitType forValue(String value) throws IOException {
        if (value.equals("max_hero_hit")) return MAX_HERO_HIT;
        throw new IOException("Cannot deserialize MaxHeroHitType");
    }
}
