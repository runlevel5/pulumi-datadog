// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSortArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSplitDimensionsArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplitArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs Empty = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs();

    /**
     * Maximum number of graphs to display in the widget.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return Maximum number of graphs to display in the widget.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * Controls the order in which graphs appear in the split.
     * 
     */
    @Import(name="sort", required=true)
    private Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSortArgs> sort;

    /**
     * @return Controls the order in which graphs appear in the split.
     * 
     */
    public Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSortArgs> sort() {
        return this.sort;
    }

    /**
     * The property by which the graph splits
     * 
     */
    @Import(name="splitDimensions", required=true)
    private Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSplitDimensionsArgs> splitDimensions;

    /**
     * @return The property by which the graph splits
     * 
     */
    public Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSplitDimensionsArgs> splitDimensions() {
        return this.splitDimensions;
    }

    /**
     * The property by which the graph splits
     * 
     */
    @Import(name="staticSplits")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplitArgs>> staticSplits;

    /**
     * @return The property by which the graph splits
     * 
     */
    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplitArgs>>> staticSplits() {
        return Optional.ofNullable(this.staticSplits);
    }

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs() {}

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs $) {
        this.limit = $.limit;
        this.sort = $.sort;
        this.splitDimensions = $.splitDimensions;
        this.staticSplits = $.staticSplits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limit Maximum number of graphs to display in the widget.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit Maximum number of graphs to display in the widget.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param sort Controls the order in which graphs appear in the split.
         * 
         * @return builder
         * 
         */
        public Builder sort(Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSortArgs> sort) {
            $.sort = sort;
            return this;
        }

        /**
         * @param sort Controls the order in which graphs appear in the split.
         * 
         * @return builder
         * 
         */
        public Builder sort(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSortArgs sort) {
            return sort(Output.of(sort));
        }

        /**
         * @param splitDimensions The property by which the graph splits
         * 
         * @return builder
         * 
         */
        public Builder splitDimensions(Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSplitDimensionsArgs> splitDimensions) {
            $.splitDimensions = splitDimensions;
            return this;
        }

        /**
         * @param splitDimensions The property by which the graph splits
         * 
         * @return builder
         * 
         */
        public Builder splitDimensions(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSplitDimensionsArgs splitDimensions) {
            return splitDimensions(Output.of(splitDimensions));
        }

        /**
         * @param staticSplits The property by which the graph splits
         * 
         * @return builder
         * 
         */
        public Builder staticSplits(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplitArgs>> staticSplits) {
            $.staticSplits = staticSplits;
            return this;
        }

        /**
         * @param staticSplits The property by which the graph splits
         * 
         * @return builder
         * 
         */
        public Builder staticSplits(List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplitArgs> staticSplits) {
            return staticSplits(Output.of(staticSplits));
        }

        /**
         * @param staticSplits The property by which the graph splits
         * 
         * @return builder
         * 
         */
        public Builder staticSplits(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplitArgs... staticSplits) {
            return staticSplits(List.of(staticSplits));
        }

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs build() {
            if ($.sort == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs", "sort");
            }
            if ($.splitDimensions == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigArgs", "splitDimensions");
            }
            return $;
        }
    }

}
