package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class League {
    private long leagueid;
    private String ticket;
    private String banner;
    private String tier;
    private String name;

    @JsonProperty("leagueid")
    public long getLeagueid() { return leagueid; }
    @JsonProperty("leagueid")
    public void setLeagueid(long value) { this.leagueid = value; }

    @JsonProperty("ticket")
    public String getTicket() { return ticket; }
    @JsonProperty("ticket")
    public void setTicket(String value) { this.ticket = value; }

    @JsonProperty("banner")
    public String getBanner() { return banner; }
    @JsonProperty("banner")
    public void setBanner(String value) { this.banner = value; }

    @JsonProperty("tier")
    public String getTier() { return tier; }
    @JsonProperty("tier")
    public void setTier(String value) { this.tier = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }
}
