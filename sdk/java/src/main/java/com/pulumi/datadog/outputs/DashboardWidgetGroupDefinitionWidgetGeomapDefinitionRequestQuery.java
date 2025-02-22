// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryApmDependencyStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryApmResourceStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryCloudCostQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryMetricQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryProcessQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQuerySloQuery;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQuery {
    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryCloudCostQuery cloudCostQuery;
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuery eventQuery;
    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryMetricQuery metricQuery;
    /**
     * @return The process query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryProcessQuery processQuery;
    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQuerySloQuery sloQuery;

    private DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQuery() {}
    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryApmDependencyStatsQuery> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }
    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryApmResourceStatsQuery> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryCloudCostQuery> cloudCostQuery() {
        return Optional.ofNullable(this.cloudCostQuery);
    }
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuery> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }
    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryMetricQuery> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }
    /**
     * @return The process query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQuerySloQuery> sloQuery() {
        return Optional.ofNullable(this.sloQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryCloudCostQuery cloudCostQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuery eventQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryMetricQuery metricQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryProcessQuery processQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQuerySloQuery sloQuery;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmDependencyStatsQuery = defaults.apmDependencyStatsQuery;
    	      this.apmResourceStatsQuery = defaults.apmResourceStatsQuery;
    	      this.cloudCostQuery = defaults.cloudCostQuery;
    	      this.eventQuery = defaults.eventQuery;
    	      this.metricQuery = defaults.metricQuery;
    	      this.processQuery = defaults.processQuery;
    	      this.sloQuery = defaults.sloQuery;
        }

        @CustomType.Setter
        public Builder apmDependencyStatsQuery(@Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery) {

            this.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder apmResourceStatsQuery(@Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery) {

            this.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder cloudCostQuery(@Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryCloudCostQuery cloudCostQuery) {

            this.cloudCostQuery = cloudCostQuery;
            return this;
        }
        @CustomType.Setter
        public Builder eventQuery(@Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuery eventQuery) {

            this.eventQuery = eventQuery;
            return this;
        }
        @CustomType.Setter
        public Builder metricQuery(@Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryMetricQuery metricQuery) {

            this.metricQuery = metricQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder sloQuery(@Nullable DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQuerySloQuery sloQuery) {

            this.sloQuery = sloQuery;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQuery build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQuery();
            _resultValue.apmDependencyStatsQuery = apmDependencyStatsQuery;
            _resultValue.apmResourceStatsQuery = apmResourceStatsQuery;
            _resultValue.cloudCostQuery = cloudCostQuery;
            _resultValue.eventQuery = eventQuery;
            _resultValue.metricQuery = metricQuery;
            _resultValue.processQuery = processQuery;
            _resultValue.sloQuery = sloQuery;
            return _resultValue;
        }
    }
}
