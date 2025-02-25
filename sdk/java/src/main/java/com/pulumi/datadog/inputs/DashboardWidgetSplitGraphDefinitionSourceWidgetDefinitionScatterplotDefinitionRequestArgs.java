// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestXArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestYArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs Empty = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs();

    /**
     * Scatterplot request containing formulas and functions.
     * 
     */
    @Import(name="scatterplotTables")
    private @Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableArgs>> scatterplotTables;

    /**
     * @return Scatterplot request containing formulas and functions.
     * 
     */
    public Optional<Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableArgs>>> scatterplotTables() {
        return Optional.ofNullable(this.scatterplotTables);
    }

    /**
     * The query used for the X-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
     * 
     */
    @Import(name="xes")
    private @Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestXArgs>> xes;

    /**
     * @return The query used for the X-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
     * 
     */
    public Optional<Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestXArgs>>> xes() {
        return Optional.ofNullable(this.xes);
    }

    /**
     * The query used for the Y-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
     * 
     */
    @Import(name="ys")
    private @Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestYArgs>> ys;

    /**
     * @return The query used for the Y-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
     * 
     */
    public Optional<Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestYArgs>>> ys() {
        return Optional.ofNullable(this.ys);
    }

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs() {}

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs $) {
        this.scatterplotTables = $.scatterplotTables;
        this.xes = $.xes;
        this.ys = $.ys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs $;

        public Builder() {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs();
        }

        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs defaults) {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scatterplotTables Scatterplot request containing formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder scatterplotTables(@Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableArgs>> scatterplotTables) {
            $.scatterplotTables = scatterplotTables;
            return this;
        }

        /**
         * @param scatterplotTables Scatterplot request containing formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder scatterplotTables(List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableArgs> scatterplotTables) {
            return scatterplotTables(Output.of(scatterplotTables));
        }

        /**
         * @param scatterplotTables Scatterplot request containing formulas and functions.
         * 
         * @return builder
         * 
         */
        public Builder scatterplotTables(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableArgs... scatterplotTables) {
            return scatterplotTables(List.of(scatterplotTables));
        }

        /**
         * @param xes The query used for the X-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
         * 
         * @return builder
         * 
         */
        public Builder xes(@Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestXArgs>> xes) {
            $.xes = xes;
            return this;
        }

        /**
         * @param xes The query used for the X-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
         * 
         * @return builder
         * 
         */
        public Builder xes(List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestXArgs> xes) {
            return xes(Output.of(xes));
        }

        /**
         * @param xes The query used for the X-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
         * 
         * @return builder
         * 
         */
        public Builder xes(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestXArgs... xes) {
            return xes(List.of(xes));
        }

        /**
         * @param ys The query used for the Y-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
         * 
         * @return builder
         * 
         */
        public Builder ys(@Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestYArgs>> ys) {
            $.ys = ys;
            return this;
        }

        /**
         * @param ys The query used for the Y-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
         * 
         * @return builder
         * 
         */
        public Builder ys(List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestYArgs> ys) {
            return ys(Output.of(ys));
        }

        /**
         * @param ys The query used for the Y-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
         * 
         * @return builder
         * 
         */
        public Builder ys(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestYArgs... ys) {
            return ys(List.of(ys));
        }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestArgs build() {
            return $;
        }
    }

}
