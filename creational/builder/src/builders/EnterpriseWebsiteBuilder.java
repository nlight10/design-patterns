package builders;

import builders.parts.Cms;

public class EnterpriseWebsiteBuilder extends AbstractWebsiteBuilder {
    @Override
    public void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    public void buildPrice() {
        website.setPrice(10000);
    }
}
