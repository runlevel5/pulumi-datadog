// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupBySortQueryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs Empty = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs();

    /**
     * The facet name.
     * 
     */
    @Import(name="facet")
    private @Nullable Output<String> facet;

    /**
     * @return The facet name.
     * 
     */
    public Optional<Output<String>> facet() {
        return Optional.ofNullable(this.facet);
    }

    /**
     * The maximum number of items in the group.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return The maximum number of items in the group.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * A list of exactly one element describing the sort query to use.
     * 
     */
    @Import(name="sortQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupBySortQueryArgs> sortQuery;

    /**
     * @return A list of exactly one element describing the sort query to use.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupBySortQueryArgs>> sortQuery() {
        return Optional.ofNullable(this.sortQuery);
    }

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs() {}

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs $) {
        this.facet = $.facet;
        this.limit = $.limit;
        this.sortQuery = $.sortQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs $;

        public Builder() {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs();
        }

        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs defaults) {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param facet The facet name.
         * 
         * @return builder
         * 
         */
        public Builder facet(@Nullable Output<String> facet) {
            $.facet = facet;
            return this;
        }

        /**
         * @param facet The facet name.
         * 
         * @return builder
         * 
         */
        public Builder facet(String facet) {
            return facet(Output.of(facet));
        }

        /**
         * @param limit The maximum number of items in the group.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit The maximum number of items in the group.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param sortQuery A list of exactly one element describing the sort query to use.
         * 
         * @return builder
         * 
         */
        public Builder sortQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupBySortQueryArgs> sortQuery) {
            $.sortQuery = sortQuery;
            return this;
        }

        /**
         * @param sortQuery A list of exactly one element describing the sort query to use.
         * 
         * @return builder
         * 
         */
        public Builder sortQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupBySortQueryArgs sortQuery) {
            return sortQuery(Output.of(sortQuery));
        }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQueryGroupByArgs build() {
            return $;
        }
    }

}
