package builders;

import builders.parts.Cms;

public class VisitCardWebsite extends AbstractWebsiteBuilder {
    @Override
    public void buildName() {
        website.setName("Visit card");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    public void buildPrice() {
        website.setPrice(500);
    }
}
