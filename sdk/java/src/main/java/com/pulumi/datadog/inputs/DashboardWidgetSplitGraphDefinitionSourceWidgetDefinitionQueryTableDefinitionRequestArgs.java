// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestConditionalFormatArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestFormulaArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestLogQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestProcessQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestRumQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestSecurityQueryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs Empty = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs();

    /**
     * The aggregator to use for time aggregation. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    @Import(name="aggregator")
    private @Nullable Output<String> aggregator;

    /**
     * @return The aggregator to use for time aggregation. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    public Optional<Output<String>> aggregator() {
        return Optional.ofNullable(this.aggregator);
    }

    /**
     * The alias for the column name (defaults to metric name).
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return The alias for the column name (defaults to metric name).
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="apmQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmQueryArgs> apmQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmQueryArgs>> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }

    @Import(name="apmStatsQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs> apmStatsQuery;

    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs>> apmStatsQuery() {
        return Optional.ofNullable(this.apmStatsQuery);
    }

    /**
     * A list of display modes for each table cell. List items one of `number`, `bar`. Valid values are `number`, `bar`.
     * 
     */
    @Import(name="cellDisplayModes")
    private @Nullable Output<List<String>> cellDisplayModes;

    /**
     * @return A list of display modes for each table cell. List items one of `number`, `bar`. Valid values are `number`, `bar`.
     * 
     */
    public Optional<Output<List<String>>> cellDisplayModes() {
        return Optional.ofNullable(this.cellDisplayModes);
    }

    /**
     * Conditional formats allow you to set the color of your widget content or background, depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    @Import(name="conditionalFormats")
    private @Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestConditionalFormatArgs>> conditionalFormats;

    /**
     * @return Conditional formats allow you to set the color of your widget content or background, depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestConditionalFormatArgs>>> conditionalFormats() {
        return Optional.ofNullable(this.conditionalFormats);
    }

    @Import(name="formulas")
    private @Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestFormulaArgs>> formulas;

    public Optional<Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestFormulaArgs>>> formulas() {
        return Optional.ofNullable(this.formulas);
    }

    /**
     * The number of lines to show in the table.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return The number of lines to show in the table.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="logQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestLogQueryArgs> logQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestLogQueryArgs>> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }

    /**
     * The sort order for the rows. Valid values are `asc`, `desc`.
     * 
     */
    @Import(name="order")
    private @Nullable Output<String> order;

    /**
     * @return The sort order for the rows. Valid values are `asc`, `desc`.
     * 
     */
    public Optional<Output<String>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * The process query to use in the widget. The structure of this block is described below.
     * 
     */
    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestProcessQueryArgs> processQuery;

    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestProcessQueryArgs>> processQuery() {
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

    @Import(name="queries")
    private @Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestQueryArgs>> queries;

    public Optional<Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestQueryArgs>>> queries() {
        return Optional.ofNullable(this.queries);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="rumQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestRumQueryArgs> rumQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestRumQueryArgs>> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="securityQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestSecurityQueryArgs> securityQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestSecurityQueryArgs>> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs() {}

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs $) {
        this.aggregator = $.aggregator;
        this.alias = $.alias;
        this.apmQuery = $.apmQuery;
        this.apmStatsQuery = $.apmStatsQuery;
        this.cellDisplayModes = $.cellDisplayModes;
        this.conditionalFormats = $.conditionalFormats;
        this.formulas = $.formulas;
        this.limit = $.limit;
        this.logQuery = $.logQuery;
        this.order = $.order;
        this.processQuery = $.processQuery;
        this.q = $.q;
        this.queries = $.queries;
        this.rumQuery = $.rumQuery;
        this.securityQuery = $.securityQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs $;

        public Builder() {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs();
        }

        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs defaults) {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregator The aggregator to use for time aggregation. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
         * 
         * @return builder
         * 
         */
        public Builder aggregator(@Nullable Output<String> aggregator) {
            $.aggregator = aggregator;
            return this;
        }

        /**
         * @param aggregator The aggregator to use for time aggregation. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
         * 
         * @return builder
         * 
         */
        public Builder aggregator(String aggregator) {
            return aggregator(Output.of(aggregator));
        }

        /**
         * @param alias The alias for the column name (defaults to metric name).
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias The alias for the column name (defaults to metric name).
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param apmQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder apmQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmQueryArgs> apmQuery) {
            $.apmQuery = apmQuery;
            return this;
        }

        /**
         * @param apmQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder apmQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmQueryArgs apmQuery) {
            return apmQuery(Output.of(apmQuery));
        }

        public Builder apmStatsQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs> apmStatsQuery) {
            $.apmStatsQuery = apmStatsQuery;
            return this;
        }

        public Builder apmStatsQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs apmStatsQuery) {
            return apmStatsQuery(Output.of(apmStatsQuery));
        }

        /**
         * @param cellDisplayModes A list of display modes for each table cell. List items one of `number`, `bar`. Valid values are `number`, `bar`.
         * 
         * @return builder
         * 
         */
        public Builder cellDisplayModes(@Nullable Output<List<String>> cellDisplayModes) {
            $.cellDisplayModes = cellDisplayModes;
            return this;
        }

        /**
         * @param cellDisplayModes A list of display modes for each table cell. List items one of `number`, `bar`. Valid values are `number`, `bar`.
         * 
         * @return builder
         * 
         */
        public Builder cellDisplayModes(List<String> cellDisplayModes) {
            return cellDisplayModes(Output.of(cellDisplayModes));
        }

        /**
         * @param cellDisplayModes A list of display modes for each table cell. List items one of `number`, `bar`. Valid values are `number`, `bar`.
         * 
         * @return builder
         * 
         */
        public Builder cellDisplayModes(String... cellDisplayModes) {
            return cellDisplayModes(List.of(cellDisplayModes));
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background, depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(@Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestConditionalFormatArgs>> conditionalFormats) {
            $.conditionalFormats = conditionalFormats;
            return this;
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background, depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestConditionalFormatArgs> conditionalFormats) {
            return conditionalFormats(Output.of(conditionalFormats));
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background, depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestConditionalFormatArgs... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }

        public Builder formulas(@Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestFormulaArgs>> formulas) {
            $.formulas = formulas;
            return this;
        }

        public Builder formulas(List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestFormulaArgs> formulas) {
            return formulas(Output.of(formulas));
        }

        public Builder formulas(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestFormulaArgs... formulas) {
            return formulas(List.of(formulas));
        }

        /**
         * @param limit The number of lines to show in the table.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit The number of lines to show in the table.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestLogQueryArgs> logQuery) {
            $.logQuery = logQuery;
            return this;
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestLogQueryArgs logQuery) {
            return logQuery(Output.of(logQuery));
        }

        /**
         * @param order The sort order for the rows. Valid values are `asc`, `desc`.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<String> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order The sort order for the rows. Valid values are `asc`, `desc`.
         * 
         * @return builder
         * 
         */
        public Builder order(String order) {
            return order(Output.of(order));
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestProcessQueryArgs processQuery) {
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

        public Builder queries(@Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestQueryArgs>> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestQueryArgs> queries) {
            return queries(Output.of(queries));
        }

        public Builder queries(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestQueryArgs... queries) {
            return queries(List.of(queries));
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestRumQueryArgs> rumQuery) {
            $.rumQuery = rumQuery;
            return this;
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestRumQueryArgs rumQuery) {
            return rumQuery(Output.of(rumQuery));
        }

        /**
         * @param securityQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder securityQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestSecurityQueryArgs> securityQuery) {
            $.securityQuery = securityQuery;
            return this;
        }

        /**
         * @param securityQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder securityQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestSecurityQueryArgs securityQuery) {
            return securityQuery(Output.of(securityQuery));
        }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestArgs build() {
            return $;
        }
    }

}
