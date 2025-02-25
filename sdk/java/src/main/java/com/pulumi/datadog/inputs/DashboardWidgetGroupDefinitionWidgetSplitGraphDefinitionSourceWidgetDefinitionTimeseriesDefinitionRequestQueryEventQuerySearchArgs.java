// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs Empty = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs();

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

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs() {}

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs $) {
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs(Objects.requireNonNull(defaults));
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

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs build() {
            if ($.query == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuerySearchArgs", "query");
            }
            return $;
        }
    }

}
