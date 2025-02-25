// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs Empty = new DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs();

    /**
     * Nested block describing the requests to use when displaying the widget. Multiple `request` blocks are allowed with the structure below.
     * 
     */
    @Import(name="requests", required=true)
    private Output<List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs>> requests;

    /**
     * @return Nested block describing the requests to use when displaying the widget. Multiple `request` blocks are allowed with the structure below.
     * 
     */
    public Output<List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs>> requests() {
        return this.requests;
    }

    /**
     * The title of the widget.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The title of the widget.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
     * 
     */
    @Import(name="titleAlign")
    private @Nullable Output<String> titleAlign;

    /**
     * @return The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
     * 
     */
    public Optional<Output<String>> titleAlign() {
        return Optional.ofNullable(this.titleAlign);
    }

    /**
     * The size of the widget&#39;s title. Default is 16.
     * 
     */
    @Import(name="titleSize")
    private @Nullable Output<String> titleSize;

    /**
     * @return The size of the widget&#39;s title. Default is 16.
     * 
     */
    public Optional<Output<String>> titleSize() {
        return Optional.ofNullable(this.titleSize);
    }

    private DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs() {}

    private DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs $) {
        this.requests = $.requests;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param requests Nested block describing the requests to use when displaying the widget. Multiple `request` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder requests(Output<List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs>> requests) {
            $.requests = requests;
            return this;
        }

        /**
         * @param requests Nested block describing the requests to use when displaying the widget. Multiple `request` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder requests(List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs> requests) {
            return requests(Output.of(requests));
        }

        /**
         * @param requests Nested block describing the requests to use when displaying the widget. Multiple `request` blocks are allowed with the structure below.
         * 
         * @return builder
         * 
         */
        public Builder requests(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestArgs... requests) {
            return requests(List.of(requests));
        }

        /**
         * @param title The title of the widget.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title of the widget.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param titleAlign The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder titleAlign(@Nullable Output<String> titleAlign) {
            $.titleAlign = titleAlign;
            return this;
        }

        /**
         * @param titleAlign The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder titleAlign(String titleAlign) {
            return titleAlign(Output.of(titleAlign));
        }

        /**
         * @param titleSize The size of the widget&#39;s title. Default is 16.
         * 
         * @return builder
         * 
         */
        public Builder titleSize(@Nullable Output<String> titleSize) {
            $.titleSize = titleSize;
            return this;
        }

        /**
         * @param titleSize The size of the widget&#39;s title. Default is 16.
         * 
         * @return builder
         * 
         */
        public Builder titleSize(String titleSize) {
            return titleSize(Output.of(titleSize));
        }

        public DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs build() {
            if ($.requests == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs", "requests");
            }
            return $;
        }
    }

}
