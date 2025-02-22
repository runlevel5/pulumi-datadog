// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs Empty = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs();

    /**
     * The expression alias.
     * 
     */
    @Import(name="aliasName")
    private @Nullable Output<String> aliasName;

    /**
     * @return The expression alias.
     * 
     */
    public Optional<Output<String>> aliasName() {
        return Optional.ofNullable(this.aliasName);
    }

    /**
     * The expression name.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return The expression name.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs() {}

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs $) {
        this.aliasName = $.aliasName;
        this.expression = $.expression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs $;

        public Builder() {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs();
        }

        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs defaults) {
            $ = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliasName The expression alias.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(@Nullable Output<String> aliasName) {
            $.aliasName = aliasName;
            return this;
        }

        /**
         * @param aliasName The expression alias.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(String aliasName) {
            return aliasName(Output.of(aliasName));
        }

        /**
         * @param expression The expression name.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression The expression name.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs build() {
            if ($.expression == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadataArgs", "expression");
            }
            return $;
        }
    }

}
