// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupBySortArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs Empty = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs();

    /**
     * The event facet.
     * 
     */
    @Import(name="facet", required=true)
    private Output<String> facet;

    /**
     * @return The event facet.
     * 
     */
    public Output<String> facet() {
        return this.facet;
    }

    /**
     * The number of groups to return.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return The number of groups to return.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * The options for sorting group by results.
     * 
     */
    @Import(name="sort")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupBySortArgs> sort;

    /**
     * @return The options for sorting group by results.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupBySortArgs>> sort() {
        return Optional.ofNullable(this.sort);
    }

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs() {}

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs $) {
        this.facet = $.facet;
        this.limit = $.limit;
        this.sort = $.sort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param facet The event facet.
         * 
         * @return builder
         * 
         */
        public Builder facet(Output<String> facet) {
            $.facet = facet;
            return this;
        }

        /**
         * @param facet The event facet.
         * 
         * @return builder
         * 
         */
        public Builder facet(String facet) {
            return facet(Output.of(facet));
        }

        /**
         * @param limit The number of groups to return.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit The number of groups to return.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param sort The options for sorting group by results.
         * 
         * @return builder
         * 
         */
        public Builder sort(@Nullable Output<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupBySortArgs> sort) {
            $.sort = sort;
            return this;
        }

        /**
         * @param sort The options for sorting group by results.
         * 
         * @return builder
         * 
         */
        public Builder sort(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupBySortArgs sort) {
            return sort(Output.of(sort));
        }

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs build() {
            if ($.facet == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionRequestQueryEventQueryGroupByArgs", "facet");
            }
            return $;
        }
    }

}
