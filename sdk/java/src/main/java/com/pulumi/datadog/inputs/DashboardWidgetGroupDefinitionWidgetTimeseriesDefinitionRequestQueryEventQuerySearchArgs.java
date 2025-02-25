// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs Empty = new DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs();

    /**
     * The events search string.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return The events search string.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    private DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs() {}

    private DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs $) {
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param query The events search string.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The events search string.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        public DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs build() {
            if ($.query == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuerySearchArgs", "query");
            }
            return $;
        }
    }

}
