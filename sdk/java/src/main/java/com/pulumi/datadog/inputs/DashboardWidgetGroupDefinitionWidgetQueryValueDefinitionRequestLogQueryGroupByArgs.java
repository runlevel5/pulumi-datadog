// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupBySortQueryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs Empty = new DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs();

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
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupBySortQueryArgs> sortQuery;

    /**
     * @return A list of exactly one element describing the sort query to use.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupBySortQueryArgs>> sortQuery() {
        return Optional.ofNullable(this.sortQuery);
    }

    private DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs() {}

    private DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs $) {
        this.facet = $.facet;
        this.limit = $.limit;
        this.sortQuery = $.sortQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs(Objects.requireNonNull(defaults));
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
        public Builder sortQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupBySortQueryArgs> sortQuery) {
            $.sortQuery = sortQuery;
            return this;
        }

        /**
         * @param sortQuery A list of exactly one element describing the sort query to use.
         * 
         * @return builder
         * 
         */
        public Builder sortQuery(DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupBySortQueryArgs sortQuery) {
            return sortQuery(Output.of(sortQuery));
        }

        public DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionRequestLogQueryGroupByArgs build() {
            return $;
        }
    }

}
