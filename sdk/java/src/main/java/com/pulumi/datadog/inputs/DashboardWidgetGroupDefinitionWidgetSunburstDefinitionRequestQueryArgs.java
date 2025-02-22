// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryApmDependencyStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryApmResourceStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryCloudCostQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryEventQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryMetricQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryProcessQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQuerySloQueryArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs Empty = new DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs();

    /**
     * The APM Dependency Stats query using formulas and functions.
     * 
     */
    @Import(name="apmDependencyStatsQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery;

    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryApmDependencyStatsQueryArgs>> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }

    /**
     * The APM Resource Stats query using formulas and functions.
     * 
     */
    @Import(name="apmResourceStatsQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery;

    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryApmResourceStatsQueryArgs>> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }

    /**
     * The Cloud Cost query using formulas and functions.
     * 
     */
    @Import(name="cloudCostQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryCloudCostQueryArgs> cloudCostQuery;

    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryCloudCostQueryArgs>> cloudCostQuery() {
        return Optional.ofNullable(this.cloudCostQuery);
    }

    /**
     * A timeseries formula and functions events query.
     * 
     */
    @Import(name="eventQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryEventQueryArgs> eventQuery;

    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryEventQueryArgs>> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }

    /**
     * A timeseries formula and functions metrics query.
     * 
     */
    @Import(name="metricQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryMetricQueryArgs> metricQuery;

    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryMetricQueryArgs>> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }

    /**
     * The process query using formulas and functions.
     * 
     */
    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryProcessQueryArgs> processQuery;

    /**
     * @return The process query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    /**
     * The SLO query using formulas and functions.
     * 
     */
    @Import(name="sloQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQuerySloQueryArgs> sloQuery;

    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQuerySloQueryArgs>> sloQuery() {
        return Optional.ofNullable(this.sloQuery);
    }

    private DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs() {}

    private DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs(DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs $) {
        this.apmDependencyStatsQuery = $.apmDependencyStatsQuery;
        this.apmResourceStatsQuery = $.apmResourceStatsQuery;
        this.cloudCostQuery = $.cloudCostQuery;
        this.eventQuery = $.eventQuery;
        this.metricQuery = $.metricQuery;
        this.processQuery = $.processQuery;
        this.sloQuery = $.sloQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apmDependencyStatsQuery The APM Dependency Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmDependencyStatsQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery) {
            $.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }

        /**
         * @param apmDependencyStatsQuery The APM Dependency Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmDependencyStatsQuery(DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryApmDependencyStatsQueryArgs apmDependencyStatsQuery) {
            return apmDependencyStatsQuery(Output.of(apmDependencyStatsQuery));
        }

        /**
         * @param apmResourceStatsQuery The APM Resource Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmResourceStatsQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery) {
            $.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }

        /**
         * @param apmResourceStatsQuery The APM Resource Stats query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder apmResourceStatsQuery(DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryApmResourceStatsQueryArgs apmResourceStatsQuery) {
            return apmResourceStatsQuery(Output.of(apmResourceStatsQuery));
        }

        /**
         * @param cloudCostQuery The Cloud Cost query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder cloudCostQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryCloudCostQueryArgs> cloudCostQuery) {
            $.cloudCostQuery = cloudCostQuery;
            return this;
        }

        /**
         * @param cloudCostQuery The Cloud Cost query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder cloudCostQuery(DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryCloudCostQueryArgs cloudCostQuery) {
            return cloudCostQuery(Output.of(cloudCostQuery));
        }

        /**
         * @param eventQuery A timeseries formula and functions events query.
         * 
         * @return builder
         * 
         */
        public Builder eventQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryEventQueryArgs> eventQuery) {
            $.eventQuery = eventQuery;
            return this;
        }

        /**
         * @param eventQuery A timeseries formula and functions events query.
         * 
         * @return builder
         * 
         */
        public Builder eventQuery(DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryEventQueryArgs eventQuery) {
            return eventQuery(Output.of(eventQuery));
        }

        /**
         * @param metricQuery A timeseries formula and functions metrics query.
         * 
         * @return builder
         * 
         */
        public Builder metricQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryMetricQueryArgs> metricQuery) {
            $.metricQuery = metricQuery;
            return this;
        }

        /**
         * @param metricQuery A timeseries formula and functions metrics query.
         * 
         * @return builder
         * 
         */
        public Builder metricQuery(DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryMetricQueryArgs metricQuery) {
            return metricQuery(Output.of(metricQuery));
        }

        /**
         * @param processQuery The process query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        /**
         * @param processQuery The process query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        /**
         * @param sloQuery The SLO query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder sloQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQuerySloQueryArgs> sloQuery) {
            $.sloQuery = sloQuery;
            return this;
        }

        /**
         * @param sloQuery The SLO query using formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder sloQuery(DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQuerySloQueryArgs sloQuery) {
            return sloQuery(Output.of(sloQuery));
        }

        public DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQueryArgs build() {
            return $;
        }
    }

}
