// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestX;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestY;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequest {
    /**
     * @return Scatterplot request containing formulas and functions.
     * 
     */
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable> scatterplotTables;
    /**
     * @return The query used for the X-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
     * 
     */
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestX> xes;
    /**
     * @return The query used for the Y-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
     * 
     */
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestY> ys;

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequest() {}
    /**
     * @return Scatterplot request containing formulas and functions.
     * 
     */
    public List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable> scatterplotTables() {
        return this.scatterplotTables == null ? List.of() : this.scatterplotTables;
    }
    /**
     * @return The query used for the X-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
     * 
     */
    public List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestX> xes() {
        return this.xes == null ? List.of() : this.xes;
    }
    /**
     * @return The query used for the Y-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
     * 
     */
    public List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestY> ys() {
        return this.ys == null ? List.of() : this.ys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable> scatterplotTables;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestX> xes;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestY> ys;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scatterplotTables = defaults.scatterplotTables;
    	      this.xes = defaults.xes;
    	      this.ys = defaults.ys;
        }

        @CustomType.Setter
        public Builder scatterplotTables(@Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable> scatterplotTables) {

            this.scatterplotTables = scatterplotTables;
            return this;
        }
        public Builder scatterplotTables(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable... scatterplotTables) {
            return scatterplotTables(List.of(scatterplotTables));
        }
        @CustomType.Setter
        public Builder xes(@Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestX> xes) {

            this.xes = xes;
            return this;
        }
        public Builder xes(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestX... xes) {
            return xes(List.of(xes));
        }
        @CustomType.Setter
        public Builder ys(@Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestY> ys) {

            this.ys = ys;
            return this;
        }
        public Builder ys(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestY... ys) {
            return ys(List.of(ys));
        }
        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequest build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequest();
            _resultValue.scatterplotTables = scatterplotTables;
            _resultValue.xes = xes;
            _resultValue.ys = ys;
            return _resultValue;
        }
    }
}
