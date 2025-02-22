// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinition;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinition {
    /**
     * @return The definition for a Change widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinition changeDefinition;
    /**
     * @return The definition for a Geomap widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinition geomapDefinition;
    /**
     * @return The definition for a Query Table widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinition queryTableDefinition;
    /**
     * @return The definition for a Query Value widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinition queryValueDefinition;
    /**
     * @return The definition for a Scatterplot widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinition scatterplotDefinition;
    /**
     * @return The definition for a Sunburst widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinition sunburstDefinition;
    /**
     * @return The definition for a Timeseries widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinition timeseriesDefinition;
    /**
     * @return The definition for a Toplist widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinition toplistDefinition;
    /**
     * @return The definition for a Treemap widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinition treemapDefinition;

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinition() {}
    /**
     * @return The definition for a Change widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinition> changeDefinition() {
        return Optional.ofNullable(this.changeDefinition);
    }
    /**
     * @return The definition for a Geomap widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinition> geomapDefinition() {
        return Optional.ofNullable(this.geomapDefinition);
    }
    /**
     * @return The definition for a Query Table widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinition> queryTableDefinition() {
        return Optional.ofNullable(this.queryTableDefinition);
    }
    /**
     * @return The definition for a Query Value widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinition> queryValueDefinition() {
        return Optional.ofNullable(this.queryValueDefinition);
    }
    /**
     * @return The definition for a Scatterplot widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinition> scatterplotDefinition() {
        return Optional.ofNullable(this.scatterplotDefinition);
    }
    /**
     * @return The definition for a Sunburst widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinition> sunburstDefinition() {
        return Optional.ofNullable(this.sunburstDefinition);
    }
    /**
     * @return The definition for a Timeseries widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinition> timeseriesDefinition() {
        return Optional.ofNullable(this.timeseriesDefinition);
    }
    /**
     * @return The definition for a Toplist widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinition> toplistDefinition() {
        return Optional.ofNullable(this.toplistDefinition);
    }
    /**
     * @return The definition for a Treemap widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinition> treemapDefinition() {
        return Optional.ofNullable(this.treemapDefinition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinition changeDefinition;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinition geomapDefinition;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinition queryTableDefinition;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinition queryValueDefinition;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinition scatterplotDefinition;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinition sunburstDefinition;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinition timeseriesDefinition;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinition toplistDefinition;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinition treemapDefinition;
        public Builder() {}
        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeDefinition = defaults.changeDefinition;
    	      this.geomapDefinition = defaults.geomapDefinition;
    	      this.queryTableDefinition = defaults.queryTableDefinition;
    	      this.queryValueDefinition = defaults.queryValueDefinition;
    	      this.scatterplotDefinition = defaults.scatterplotDefinition;
    	      this.sunburstDefinition = defaults.sunburstDefinition;
    	      this.timeseriesDefinition = defaults.timeseriesDefinition;
    	      this.toplistDefinition = defaults.toplistDefinition;
    	      this.treemapDefinition = defaults.treemapDefinition;
        }

        @CustomType.Setter
        public Builder changeDefinition(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinition changeDefinition) {

            this.changeDefinition = changeDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder geomapDefinition(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinition geomapDefinition) {

            this.geomapDefinition = geomapDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder queryTableDefinition(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinition queryTableDefinition) {

            this.queryTableDefinition = queryTableDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder queryValueDefinition(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinition queryValueDefinition) {

            this.queryValueDefinition = queryValueDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder scatterplotDefinition(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinition scatterplotDefinition) {

            this.scatterplotDefinition = scatterplotDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder sunburstDefinition(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinition sunburstDefinition) {

            this.sunburstDefinition = sunburstDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder timeseriesDefinition(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinition timeseriesDefinition) {

            this.timeseriesDefinition = timeseriesDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder toplistDefinition(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinition toplistDefinition) {

            this.toplistDefinition = toplistDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder treemapDefinition(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinition treemapDefinition) {

            this.treemapDefinition = treemapDefinition;
            return this;
        }
        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinition build() {
            final var _resultValue = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinition();
            _resultValue.changeDefinition = changeDefinition;
            _resultValue.geomapDefinition = geomapDefinition;
            _resultValue.queryTableDefinition = queryTableDefinition;
            _resultValue.queryValueDefinition = queryValueDefinition;
            _resultValue.scatterplotDefinition = scatterplotDefinition;
            _resultValue.sunburstDefinition = sunburstDefinition;
            _resultValue.timeseriesDefinition = timeseriesDefinition;
            _resultValue.toplistDefinition = toplistDefinition;
            _resultValue.treemapDefinition = treemapDefinition;
            return _resultValue;
        }
    }
}
