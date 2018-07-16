package dto.matches;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ObsLeftLogType {
    OBS_LEFT_LOG, OBS_LOG, SEN_LEFT_LOG, SEN_LOG;

    @JsonValue
    public String toValue() {
        switch (this) {
        case OBS_LEFT_LOG: return "obs_left_log";
        case OBS_LOG: return "obs_log";
        case SEN_LEFT_LOG: return "sen_left_log";
        case SEN_LOG: return "sen_log";
        }
        return null;
    }

    @JsonCreator
    public static ObsLeftLogType forValue(String value) throws IOException {
        if (value.equals("obs_left_log")) return OBS_LEFT_LOG;
        if (value.equals("obs_log")) return OBS_LOG;
        if (value.equals("sen_left_log")) return SEN_LEFT_LOG;
        if (value.equals("sen_log")) return SEN_LOG;
        throw new IOException("Cannot deserialize ObsLeftLogType");
    }
}
