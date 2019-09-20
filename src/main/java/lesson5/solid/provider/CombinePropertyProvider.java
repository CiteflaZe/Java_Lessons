package lesson5.solid.provider;

import java.util.Objects;

public class CombinePropertyProvider implements PropertyProvider {
    private final PropertyProvider envPropertyProvider;
    private final PropertyProvider defaultPropertyProvider;

    public CombinePropertyProvider(PropertyProvider envPropertyProvider,
                                   PropertyProvider defaultPropertyProvider) {
        this.envPropertyProvider = envPropertyProvider;
        this.defaultPropertyProvider = defaultPropertyProvider;
    }

    @Override
    public String getProperty(String propertyName) {
        final String propertyValue =  envPropertyProvider.getProperty(propertyName);
//        return propertyName != null ? propertyName : defaultPropertyProvider.getProperty(propertyName);
        return Objects.nonNull(propertyName) ? propertyName : defaultPropertyProvider.getProperty(propertyName);

    }
}
