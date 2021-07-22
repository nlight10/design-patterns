package director;

import builders.AbstractWebsiteBuilder;
import builders.parts.Website;

public class Director {
    AbstractWebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(AbstractWebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    public Website buildWebsite() {
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildCms();
        websiteBuilder.buildPrice();

        Website website = websiteBuilder.getWebsite();
        return website;
    }
}
