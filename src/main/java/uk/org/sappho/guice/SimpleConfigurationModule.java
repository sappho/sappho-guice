package uk.org.sappho.guice;

import uk.org.sappho.configuration.Configuration;
import uk.org.sappho.configuration.SimpleConfiguration;

import com.google.inject.AbstractModule;

public class SimpleConfigurationModule extends AbstractModule {

    private final Configuration config;

    public SimpleConfigurationModule() {

        config = new SimpleConfiguration();
    }

    public SimpleConfigurationModule(Configuration config) {

        this.config = config;
    }

    @Override
    protected void configure() {

        bind(Configuration.class).toInstance(config);
    }
}
