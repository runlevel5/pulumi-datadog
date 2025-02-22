// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestLogQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestRumQueryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs Empty = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs();

    @Import(name="formulas")
    private @Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaArgs>> formulas;

    public Optional<Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaArgs>>> formulas() {
        return Optional.ofNullable(this.formulas);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="logQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestLogQueryArgs> logQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestLogQueryArgs>> logQuery() {
        return Optional.ofNullable(this.logQuery);
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
    private @Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs>> queries;

    public Optional<Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs>>> queries() {
        return Optional.ofNullable(this.queries);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="rumQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestRumQueryArgs> rumQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestRumQueryArgs>> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs() {}

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs $) {
        this.formulas = $.formulas;
        this.logQuery = $.logQuery;
        this.q = $.q;
        this.queries = $.queries;
        this.rumQuery = $.rumQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs $;

        public Builder() {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs();
        }

        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs defaults) {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder formulas(@Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaArgs>> formulas) {
            $.formulas = formulas;
            return this;
        }

        public Builder formulas(List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaArgs> formulas) {
            return formulas(Output.of(formulas));
        }

        public Builder formulas(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaArgs... formulas) {
            return formulas(List.of(formulas));
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestLogQueryArgs> logQuery) {
            $.logQuery = logQuery;
            return this;
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestLogQueryArgs logQuery) {
            return logQuery(Output.of(logQuery));
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

        public Builder queries(@Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs>> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs> queries) {
            return queries(Output.of(queries));
        }

        public Builder queries(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs... queries) {
            return queries(List.of(queries));
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestRumQueryArgs> rumQuery) {
            $.rumQuery = rumQuery;
            return this;
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestRumQueryArgs rumQuery) {
            return rumQuery(Output.of(rumQuery));
        }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs build() {
            return $;
        }
    }

}
