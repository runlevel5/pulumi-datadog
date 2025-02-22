// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs Empty = new DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs();

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

    private DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs() {}

    private DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs(DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs $) {
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs(Objects.requireNonNull(defaults));
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

        public DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs build() {
            if ($.query == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetGeomapDefinitionRequestQueryEventQuerySearchArgs", "query");
            }
            return $;
        }
    }

}
