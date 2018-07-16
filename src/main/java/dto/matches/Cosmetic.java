package dto.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cosmetic {
    private long itemID;
    private String name;
    private Prefab prefab;
    private String creationDate;
    private String imageInventory;
    private String imagePath;
    private String itemDescription;
    private String itemName;
    private ItemRarity itemRarity;
    private String itemTypeName;
    private String usedByHeroes;

    @JsonProperty("item_id")
    public long getItemID() { return itemID; }
    @JsonProperty("item_id")
    public void setItemID(long value) { this.itemID = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("prefab")
    public Prefab getPrefab() { return prefab; }
    @JsonProperty("prefab")
    public void setPrefab(Prefab value) { this.prefab = value; }

    @JsonProperty("creation_date")
    public String getCreationDate() { return creationDate; }
    @JsonProperty("creation_date")
    public void setCreationDate(String value) { this.creationDate = value; }

    @JsonProperty("image_inventory")
    public String getImageInventory() { return imageInventory; }
    @JsonProperty("image_inventory")
    public void setImageInventory(String value) { this.imageInventory = value; }

    @JsonProperty("image_path")
    public String getImagePath() { return imagePath; }
    @JsonProperty("image_path")
    public void setImagePath(String value) { this.imagePath = value; }

    @JsonProperty("item_description")
    public String getItemDescription() { return itemDescription; }
    @JsonProperty("item_description")
    public void setItemDescription(String value) { this.itemDescription = value; }

    @JsonProperty("item_name")
    public String getItemName() { return itemName; }
    @JsonProperty("item_name")
    public void setItemName(String value) { this.itemName = value; }

    @JsonProperty("item_rarity")
    public ItemRarity getItemRarity() { return itemRarity; }
    @JsonProperty("item_rarity")
    public void setItemRarity(ItemRarity value) { this.itemRarity = value; }

    @JsonProperty("item_type_name")
    public String getItemTypeName() { return itemTypeName; }
    @JsonProperty("item_type_name")
    public void setItemTypeName(String value) { this.itemTypeName = value; }

    @JsonProperty("used_by_heroes")
    public String getUsedByHeroes() { return usedByHeroes; }
    @JsonProperty("used_by_heroes")
    public void setUsedByHeroes(String value) { this.usedByHeroes = value; }
}
