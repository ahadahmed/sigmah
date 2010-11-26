package org.sigmah.shared.dto;

import com.extjs.gxt.ui.client.data.BaseModelData;

public class OrgUnitModelDTO extends BaseModelData implements EntityDTO {

    private static final long serialVersionUID = -6438355456637422931L;

    @Override
    public String getEntityName() {
        return "OrgUnitModel";
    }

    // Id
    @Override
    public int getId() {
        return (Integer) get("id");
    }

    public void setId(int id) {
        set("id", id);
    }

    // Name
    public String getName() {
        return get("name");
    }

    public void setName(String name) {
        set("name", name);
    }

    // Banner
    public OrgUnitBannerDTO getBanner() {
        return get("banner");
    }

    public void setBanner(OrgUnitBannerDTO banner) {
        set("banner", banner);
    }

    // Details
    public OrgUnitDetailsDTO getDetails() {
        return get("details");
    }

    public void setDetails(OrgUnitDetailsDTO details) {
        set("details", details);
    }

    // Budget
    public Boolean getHasBudget() {
        return (Boolean) get("hasBudget");
    }

    public void setHasBudget(Boolean hasBudget) {
        set("hasBudget", hasBudget);
    }

    // Site
    public Boolean getHasSite() {
        return (Boolean) get("hasSite");
    }

    public void setHasSite(Boolean hasSite) {
        set("hasSite", hasSite);
    }

    // Min level
    public Integer getMinLevel() {
        return (Integer) get("minLevel");
    }

    public void setMinLevel(Integer minLevel) {
        set("minLevel", minLevel);
    }

    // Max level
    public Integer getMaxLevel() {
        return (Integer) get("maxLevel");
    }

    public void setMaxLevel(Integer maxLevel) {
        set("maxLevel", maxLevel);
    }
}