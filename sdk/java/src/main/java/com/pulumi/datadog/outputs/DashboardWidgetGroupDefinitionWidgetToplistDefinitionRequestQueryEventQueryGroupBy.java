// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBySort;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBy {
    /**
     * @return The event facet.
     * 
     */
    private String facet;
    /**
     * @return The number of groups to return.
     * 
     */
    private @Nullable Integer limit;
    /**
     * @return The options for sorting group by results.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBySort sort;

    private DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBy() {}
    /**
     * @return The event facet.
     * 
     */
    public String facet() {
        return this.facet;
    }
    /**
     * @return The number of groups to return.
     * 
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return The options for sorting group by results.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBySort> sort() {
        return Optional.ofNullable(this.sort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String facet;
        private @Nullable Integer limit;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBySort sort;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.facet = defaults.facet;
    	      this.limit = defaults.limit;
    	      this.sort = defaults.sort;
        }

        @CustomType.Setter
        public Builder facet(String facet) {
            if (facet == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBy", "facet");
            }
            this.facet = facet;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable Integer limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder sort(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBySort sort) {

            this.sort = sort;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBy build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBy();
            _resultValue.facet = facet;
            _resultValue.limit = limit;
            _resultValue.sort = sort;
            return _resultValue;
        }
    }
}
