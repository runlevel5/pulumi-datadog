// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetGeomapDefinitionView {
    /**
     * @return The two-letter ISO code of a country to focus the map on (or `WORLD`).
     * 
     */
    private String focus;

    private DashboardWidgetGroupDefinitionWidgetGeomapDefinitionView() {}
    /**
     * @return The two-letter ISO code of a country to focus the map on (or `WORLD`).
     * 
     */
    public String focus() {
        return this.focus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetGeomapDefinitionView defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String focus;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetGeomapDefinitionView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.focus = defaults.focus;
        }

        @CustomType.Setter
        public Builder focus(String focus) {
            if (focus == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetGeomapDefinitionView", "focus");
            }
            this.focus = focus;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetGeomapDefinitionView build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetGeomapDefinitionView();
            _resultValue.focus = focus;
            return _resultValue;
        }
    }
}
