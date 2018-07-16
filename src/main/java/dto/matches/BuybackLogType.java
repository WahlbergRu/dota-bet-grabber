package dto.matches;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum BuybackLogType {
    BUYBACK_LOG;

    @JsonValue
    public String toValue() {
        switch (this) {
        case BUYBACK_LOG: return "buyback_log";
        }
        return null;
    }

    @JsonCreator
    public static BuybackLogType forValue(String value) throws IOException {
        if (value.equals("buyback_log")) return BUYBACK_LOG;
        throw new IOException("Cannot deserialize BuybackLogType");
    }
}
