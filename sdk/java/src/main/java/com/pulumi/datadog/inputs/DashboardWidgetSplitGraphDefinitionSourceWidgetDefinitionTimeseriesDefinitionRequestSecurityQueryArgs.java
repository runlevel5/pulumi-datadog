// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryComputeQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryGroupByArgs;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryMultiComputeArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs Empty = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs();

    /**
     * `compute_query` or `multi_compute` is required. The map keys are listed below.
     * 
     */
    @Import(name="computeQuery")
    private @Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryComputeQueryArgs> computeQuery;

    /**
     * @return `compute_query` or `multi_compute` is required. The map keys are listed below.
     * 
     */
    public Optional<Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryComputeQueryArgs>> computeQuery() {
        return Optional.ofNullable(this.computeQuery);
    }

    /**
     * Multiple `group_by` blocks are allowed using the structure below.
     * 
     */
    @Import(name="groupBies")
    private @Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryGroupByArgs>> groupBies;

    /**
     * @return Multiple `group_by` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryGroupByArgs>>> groupBies() {
        return Optional.ofNullable(this.groupBies);
    }

    /**
     * The name of the index to query.
     * 
     */
    @Import(name="index", required=true)
    private Output<String> index;

    /**
     * @return The name of the index to query.
     * 
     */
    public Output<String> index() {
        return this.index;
    }

    /**
     * `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
     * 
     */
    @Import(name="multiComputes")
    private @Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryMultiComputeArgs>> multiComputes;

    /**
     * @return `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryMultiComputeArgs>>> multiComputes() {
        return Optional.ofNullable(this.multiComputes);
    }

    /**
     * The search query to use.
     * 
     */
    @Import(name="searchQuery")
    private @Nullable Output<String> searchQuery;

    /**
     * @return The search query to use.
     * 
     */
    public Optional<Output<String>> searchQuery() {
        return Optional.ofNullable(this.searchQuery);
    }

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs() {}

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs $) {
        this.computeQuery = $.computeQuery;
        this.groupBies = $.groupBies;
        this.index = $.index;
        this.multiComputes = $.multiComputes;
        this.searchQuery = $.searchQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs();
        }

        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs defaults) {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeQuery `compute_query` or `multi_compute` is required. The map keys are listed below.
         * 
         * @return builder
         * 
         */
        public Builder computeQuery(@Nullable Output<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryComputeQueryArgs> computeQuery) {
            $.computeQuery = computeQuery;
            return this;
        }

        /**
         * @param computeQuery `compute_query` or `multi_compute` is required. The map keys are listed below.
         * 
         * @return builder
         * 
         */
        public Builder computeQuery(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryComputeQueryArgs computeQuery) {
            return computeQuery(Output.of(computeQuery));
        }

        /**
         * @param groupBies Multiple `group_by` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(@Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryGroupByArgs>> groupBies) {
            $.groupBies = groupBies;
            return this;
        }

        /**
         * @param groupBies Multiple `group_by` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryGroupByArgs> groupBies) {
            return groupBies(Output.of(groupBies));
        }

        /**
         * @param groupBies Multiple `group_by` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryGroupByArgs... groupBies) {
            return groupBies(List.of(groupBies));
        }

        /**
         * @param index The name of the index to query.
         * 
         * @return builder
         * 
         */
        public Builder index(Output<String> index) {
            $.index = index;
            return this;
        }

        /**
         * @param index The name of the index to query.
         * 
         * @return builder
         * 
         */
        public Builder index(String index) {
            return index(Output.of(index));
        }

        /**
         * @param multiComputes `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder multiComputes(@Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryMultiComputeArgs>> multiComputes) {
            $.multiComputes = multiComputes;
            return this;
        }

        /**
         * @param multiComputes `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder multiComputes(List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryMultiComputeArgs> multiComputes) {
            return multiComputes(Output.of(multiComputes));
        }

        /**
         * @param multiComputes `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder multiComputes(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryMultiComputeArgs... multiComputes) {
            return multiComputes(List.of(multiComputes));
        }

        /**
         * @param searchQuery The search query to use.
         * 
         * @return builder
         * 
         */
        public Builder searchQuery(@Nullable Output<String> searchQuery) {
            $.searchQuery = searchQuery;
            return this;
        }

        /**
         * @param searchQuery The search query to use.
         * 
         * @return builder
         * 
         */
        public Builder searchQuery(String searchQuery) {
            return searchQuery(Output.of(searchQuery));
        }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs build() {
            if ($.index == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryArgs", "index");
            }
            return $;
        }
    }

}
