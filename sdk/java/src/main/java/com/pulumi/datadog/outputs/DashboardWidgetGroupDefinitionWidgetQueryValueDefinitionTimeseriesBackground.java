// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackgroundYaxis;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackground {
    /**
     * @return Whether the Timeseries is made using an area or bars. Valid values are `bars`, `area`.
     * 
     */
    private String type;
    /**
     * @return A nested block describing the Y-Axis Controls. Exactly one nested block is allowed using the structure below.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackgroundYaxis yaxis;

    private DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackground() {}
    /**
     * @return Whether the Timeseries is made using an area or bars. Valid values are `bars`, `area`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return A nested block describing the Y-Axis Controls. Exactly one nested block is allowed using the structure below.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackgroundYaxis> yaxis() {
        return Optional.ofNullable(this.yaxis);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackground defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private @Nullable DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackgroundYaxis yaxis;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackground defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.yaxis = defaults.yaxis;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackground", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder yaxis(@Nullable DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackgroundYaxis yaxis) {

            this.yaxis = yaxis;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackground build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionTimeseriesBackground();
            _resultValue.type = type;
            _resultValue.yaxis = yaxis;
            return _resultValue;
        }
    }
}
