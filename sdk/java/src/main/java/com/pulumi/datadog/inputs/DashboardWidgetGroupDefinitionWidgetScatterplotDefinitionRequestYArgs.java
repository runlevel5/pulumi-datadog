// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYApmQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYLogQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYProcessQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYRumQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs Empty = new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs();

    /**
     * Aggregator used for the request. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    @Import(name="aggregator")
    private @Nullable Output<String> aggregator;

    /**
     * @return Aggregator used for the request. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    public Optional<Output<String>> aggregator() {
        return Optional.ofNullable(this.aggregator);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="apmQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYApmQueryArgs> apmQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYApmQueryArgs>> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="logQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYLogQueryArgs> logQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYLogQueryArgs>> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }

    /**
     * The process query to use in the widget. The structure of this block is described below.
     * 
     */
    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYProcessQueryArgs> processQuery;

    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    /**
     * The metric query to use for this widget.
     * 
     */
    @Import(name="q")
    private @Nullable Output<String> q;

    /**
     * @return The metric query to use for this widget.
     * 
     */
    public Optional<Output<String>> q() {
        return Optional.ofNullable(this.q);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="rumQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYRumQueryArgs> rumQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYRumQueryArgs>> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="securityQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryArgs> securityQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryArgs>> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }

    private DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs() {}

    private DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs $) {
        this.aggregator = $.aggregator;
        this.apmQuery = $.apmQuery;
        this.logQuery = $.logQuery;
        this.processQuery = $.processQuery;
        this.q = $.q;
        this.rumQuery = $.rumQuery;
        this.securityQuery = $.securityQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregator Aggregator used for the request. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
         * 
         * @return builder
         * 
         */
        public Builder aggregator(@Nullable Output<String> aggregator) {
            $.aggregator = aggregator;
            return this;
        }

        /**
         * @param aggregator Aggregator used for the request. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
         * 
         * @return builder
         * 
         */
        public Builder aggregator(String aggregator) {
            return aggregator(Output.of(aggregator));
        }

        /**
         * @param apmQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder apmQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYApmQueryArgs> apmQuery) {
            $.apmQuery = apmQuery;
            return this;
        }

        /**
         * @param apmQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder apmQuery(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYApmQueryArgs apmQuery) {
            return apmQuery(Output.of(apmQuery));
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYLogQueryArgs> logQuery) {
            $.logQuery = logQuery;
            return this;
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYLogQueryArgs logQuery) {
            return logQuery(Output.of(logQuery));
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        /**
         * @param q The metric query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder q(@Nullable Output<String> q) {
            $.q = q;
            return this;
        }

        /**
         * @param q The metric query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder q(String q) {
            return q(Output.of(q));
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYRumQueryArgs> rumQuery) {
            $.rumQuery = rumQuery;
            return this;
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYRumQueryArgs rumQuery) {
            return rumQuery(Output.of(rumQuery));
        }

        /**
         * @param securityQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder securityQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryArgs> securityQuery) {
            $.securityQuery = securityQuery;
            return this;
        }

        /**
         * @param securityQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder securityQuery(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYSecurityQueryArgs securityQuery) {
            return securityQuery(Output.of(securityQuery));
        }

        public DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYArgs build() {
            return $;
        }
    }

}
