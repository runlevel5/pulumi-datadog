// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumnArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs Empty = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs();

    /**
     * Column properties used by the front end for display.
     * 
     */
    @Import(name="columns")
    private @Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumnArgs>> columns;

    /**
     * @return Column properties used by the front end for display.
     * 
     */
    public Optional<Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumnArgs>>> columns() {
        return Optional.ofNullable(this.columns);
    }

    /**
     * The environment name.
     * 
     */
    @Import(name="env", required=true)
    private Output<String> env;

    /**
     * @return The environment name.
     * 
     */
    public Output<String> env() {
        return this.env;
    }

    /**
     * The operation name associated with the service.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The operation name associated with the service.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The organization&#39;s host group name and value.
     * 
     */
    @Import(name="primaryTag", required=true)
    private Output<String> primaryTag;

    /**
     * @return The organization&#39;s host group name and value.
     * 
     */
    public Output<String> primaryTag() {
        return this.primaryTag;
    }

    /**
     * The resource name.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return The resource name.
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * The level of detail for the request. Valid values are `service`, `resource`, `span`.
     * 
     */
    @Import(name="rowType", required=true)
    private Output<String> rowType;

    /**
     * @return The level of detail for the request. Valid values are `service`, `resource`, `span`.
     * 
     */
    public Output<String> rowType() {
        return this.rowType;
    }

    /**
     * The service name.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return The service name.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs() {}

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs $) {
        this.columns = $.columns;
        this.env = $.env;
        this.name = $.name;
        this.primaryTag = $.primaryTag;
        this.resource = $.resource;
        this.rowType = $.rowType;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs();
        }

        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs defaults) {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columns Column properties used by the front end for display.
         * 
         * @return builder
         * 
         */
        public Builder columns(@Nullable Output<List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumnArgs>> columns) {
            $.columns = columns;
            return this;
        }

        /**
         * @param columns Column properties used by the front end for display.
         * 
         * @return builder
         * 
         */
        public Builder columns(List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumnArgs> columns) {
            return columns(Output.of(columns));
        }

        /**
         * @param columns Column properties used by the front end for display.
         * 
         * @return builder
         * 
         */
        public Builder columns(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumnArgs... columns) {
            return columns(List.of(columns));
        }

        /**
         * @param env The environment name.
         * 
         * @return builder
         * 
         */
        public Builder env(Output<String> env) {
            $.env = env;
            return this;
        }

        /**
         * @param env The environment name.
         * 
         * @return builder
         * 
         */
        public Builder env(String env) {
            return env(Output.of(env));
        }

        /**
         * @param name The operation name associated with the service.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The operation name associated with the service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primaryTag The organization&#39;s host group name and value.
         * 
         * @return builder
         * 
         */
        public Builder primaryTag(Output<String> primaryTag) {
            $.primaryTag = primaryTag;
            return this;
        }

        /**
         * @param primaryTag The organization&#39;s host group name and value.
         * 
         * @return builder
         * 
         */
        public Builder primaryTag(String primaryTag) {
            return primaryTag(Output.of(primaryTag));
        }

        /**
         * @param resource The resource name.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource The resource name.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param rowType The level of detail for the request. Valid values are `service`, `resource`, `span`.
         * 
         * @return builder
         * 
         */
        public Builder rowType(Output<String> rowType) {
            $.rowType = rowType;
            return this;
        }

        /**
         * @param rowType The level of detail for the request. Valid values are `service`, `resource`, `span`.
         * 
         * @return builder
         * 
         */
        public Builder rowType(String rowType) {
            return rowType(Output.of(rowType));
        }

        /**
         * @param service The service name.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The service name.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs build() {
            if ($.env == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs", "env");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs", "name");
            }
            if ($.primaryTag == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs", "primaryTag");
            }
            if ($.rowType == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs", "rowType");
            }
            if ($.service == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryArgs", "service");
            }
            return $;
        }
    }

}
