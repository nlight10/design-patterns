package builders;

import builders.parts.Website;

public abstract class AbstractWebsiteBuilder {
    Website website;

    public void createWebsite() {
        website = new Website();
    }

    public abstract void buildName();
    public abstract void buildCms();
    public abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }
}
