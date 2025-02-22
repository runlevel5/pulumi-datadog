// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionStyle {
    /**
     * @return The color palette to apply to the widget.
     * 
     */
    private String palette;
    /**
     * @return A Boolean indicating whether to flip the palette tones.
     * 
     */
    private Boolean paletteFlip;

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionStyle() {}
    /**
     * @return The color palette to apply to the widget.
     * 
     */
    public String palette() {
        return this.palette;
    }
    /**
     * @return A Boolean indicating whether to flip the palette tones.
     * 
     */
    public Boolean paletteFlip() {
        return this.paletteFlip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionStyle defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String palette;
        private Boolean paletteFlip;
        public Builder() {}
        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionStyle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.palette = defaults.palette;
    	      this.paletteFlip = defaults.paletteFlip;
        }

        @CustomType.Setter
        public Builder palette(String palette) {
            if (palette == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionStyle", "palette");
            }
            this.palette = palette;
            return this;
        }
        @CustomType.Setter
        public Builder paletteFlip(Boolean paletteFlip) {
            if (paletteFlip == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionStyle", "paletteFlip");
            }
            this.paletteFlip = paletteFlip;
            return this;
        }
        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionStyle build() {
            final var _resultValue = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionStyle();
            _resultValue.palette = palette;
            _resultValue.paletteFlip = paletteFlip;
            return _resultValue;
        }
    }
}
