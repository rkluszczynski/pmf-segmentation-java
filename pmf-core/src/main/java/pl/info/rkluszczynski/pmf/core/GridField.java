package pl.info.rkluszczynski.pmf.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GridField {
    private final GridFieldProperties gridFieldProperties;

    @Autowired
    public GridField(GridFieldProperties gridFieldProperties) {
        this.gridFieldProperties = gridFieldProperties;
    }

    @Override
    public String toString() {
        return gridFieldProperties.getHeight() + " x " + gridFieldProperties.getWidth();
    }
}
