// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DashboardWidgetListStreamDefinitionRequestQuerySortArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetListStreamDefinitionRequestQuerySortArgs Empty = new DashboardWidgetListStreamDefinitionRequestQuerySortArgs();

    /**
     * The facet path for the column.
     * 
     */
    @Import(name="column", required=true)
    private Output<String> column;

    /**
     * @return The facet path for the column.
     * 
     */
    public Output<String> column() {
        return this.column;
    }

    /**
     * Widget sorting methods. Valid values are `asc`, `desc`.
     * 
     */
    @Import(name="order", required=true)
    private Output<String> order;

    /**
     * @return Widget sorting methods. Valid values are `asc`, `desc`.
     * 
     */
    public Output<String> order() {
        return this.order;
    }

    private DashboardWidgetListStreamDefinitionRequestQuerySortArgs() {}

    private DashboardWidgetListStreamDefinitionRequestQuerySortArgs(DashboardWidgetListStreamDefinitionRequestQuerySortArgs $) {
        this.column = $.column;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetListStreamDefinitionRequestQuerySortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetListStreamDefinitionRequestQuerySortArgs $;

        public Builder() {
            $ = new DashboardWidgetListStreamDefinitionRequestQuerySortArgs();
        }

        public Builder(DashboardWidgetListStreamDefinitionRequestQuerySortArgs defaults) {
            $ = new DashboardWidgetListStreamDefinitionRequestQuerySortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param column The facet path for the column.
         * 
         * @return builder
         * 
         */
        public Builder column(Output<String> column) {
            $.column = column;
            return this;
        }

        /**
         * @param column The facet path for the column.
         * 
         * @return builder
         * 
         */
        public Builder column(String column) {
            return column(Output.of(column));
        }

        /**
         * @param order Widget sorting methods. Valid values are `asc`, `desc`.
         * 
         * @return builder
         * 
         */
        public Builder order(Output<String> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Widget sorting methods. Valid values are `asc`, `desc`.
         * 
         * @return builder
         * 
         */
        public Builder order(String order) {
            return order(Output.of(order));
        }

        public DashboardWidgetListStreamDefinitionRequestQuerySortArgs build() {
            if ($.column == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetListStreamDefinitionRequestQuerySortArgs", "column");
            }
            if ($.order == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetListStreamDefinitionRequestQuerySortArgs", "order");
            }
            return $;
        }
    }

}
