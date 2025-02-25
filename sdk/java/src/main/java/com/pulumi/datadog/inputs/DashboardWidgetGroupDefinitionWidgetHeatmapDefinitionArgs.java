// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxisArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs Empty = new DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs();

    /**
     * A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    @Import(name="customLinks")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs>> customLinks;

    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs>>> customLinks() {
        return Optional.ofNullable(this.customLinks);
    }

    /**
     * The definition of the event to overlay on the graph. Multiple `event` blocks are allowed using the structure below.
     * 
     */
    @Import(name="events")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs>> events;

    /**
     * @return The definition of the event to overlay on the graph. Multiple `event` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs>>> events() {
        return Optional.ofNullable(this.events);
    }

    /**
     * The size of the legend displayed in the widget.
     * 
     */
    @Import(name="legendSize")
    private @Nullable Output<String> legendSize;

    /**
     * @return The size of the legend displayed in the widget.
     * 
     */
    public Optional<Output<String>> legendSize() {
        return Optional.ofNullable(this.legendSize);
    }

    /**
     * The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    @Import(name="liveSpan")
    private @Nullable Output<String> liveSpan;

    /**
     * @return The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    public Optional<Output<String>> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
    }

    /**
     * A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    @Import(name="requests")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs>> requests;

    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs>>> requests() {
        return Optional.ofNullable(this.requests);
    }

    /**
     * Whether or not to show the legend on this widget.
     * 
     */
    @Import(name="showLegend")
    private @Nullable Output<Boolean> showLegend;

    /**
     * @return Whether or not to show the legend on this widget.
     * 
     */
    public Optional<Output<Boolean>> showLegend() {
        return Optional.ofNullable(this.showLegend);
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
     * The size of the widget&#39;s title (defaults to 16).
     * 
     */
    @Import(name="titleSize")
    private @Nullable Output<String> titleSize;

    /**
     * @return The size of the widget&#39;s title (defaults to 16).
     * 
     */
    public Optional<Output<String>> titleSize() {
        return Optional.ofNullable(this.titleSize);
    }

    /**
     * A nested block describing the Y-Axis Controls. The structure of this block is described below.
     * 
     */
    @Import(name="yaxis")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxisArgs> yaxis;

    /**
     * @return A nested block describing the Y-Axis Controls. The structure of this block is described below.
     * 
     */
    public Optional<Output<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxisArgs>> yaxis() {
        return Optional.ofNullable(this.yaxis);
    }

    private DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs() {}

    private DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs $) {
        this.customLinks = $.customLinks;
        this.events = $.events;
        this.legendSize = $.legendSize;
        this.liveSpan = $.liveSpan;
        this.requests = $.requests;
        this.showLegend = $.showLegend;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
        this.yaxis = $.yaxis;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs>> customLinks) {
            $.customLinks = customLinks;
            return this;
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs> customLinks) {
            return customLinks(Output.of(customLinks));
        }

        /**
         * @param customLinks A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder customLinks(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs... customLinks) {
            return customLinks(List.of(customLinks));
        }

        /**
         * @param events The definition of the event to overlay on the graph. Multiple `event` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder events(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events The definition of the event to overlay on the graph. Multiple `event` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder events(List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs> events) {
            return events(Output.of(events));
        }

        /**
         * @param events The definition of the event to overlay on the graph. Multiple `event` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder events(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs... events) {
            return events(List.of(events));
        }

        /**
         * @param legendSize The size of the legend displayed in the widget.
         * 
         * @return builder
         * 
         */
        public Builder legendSize(@Nullable Output<String> legendSize) {
            $.legendSize = legendSize;
            return this;
        }

        /**
         * @param legendSize The size of the legend displayed in the widget.
         * 
         * @return builder
         * 
         */
        public Builder legendSize(String legendSize) {
            return legendSize(Output.of(legendSize));
        }

        /**
         * @param liveSpan The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
         * 
         * @return builder
         * 
         */
        public Builder liveSpan(@Nullable Output<String> liveSpan) {
            $.liveSpan = liveSpan;
            return this;
        }

        /**
         * @param liveSpan The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
         * 
         * @return builder
         * 
         */
        public Builder liveSpan(String liveSpan) {
            return liveSpan(Output.of(liveSpan));
        }

        /**
         * @param requests A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder requests(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs>> requests) {
            $.requests = requests;
            return this;
        }

        /**
         * @param requests A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder requests(List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs> requests) {
            return requests(Output.of(requests));
        }

        /**
         * @param requests A nested block describing the request to use when displaying the widget. Multiple `request` blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
         * 
         * @return builder
         * 
         */
        public Builder requests(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs... requests) {
            return requests(List.of(requests));
        }

        /**
         * @param showLegend Whether or not to show the legend on this widget.
         * 
         * @return builder
         * 
         */
        public Builder showLegend(@Nullable Output<Boolean> showLegend) {
            $.showLegend = showLegend;
            return this;
        }

        /**
         * @param showLegend Whether or not to show the legend on this widget.
         * 
         * @return builder
         * 
         */
        public Builder showLegend(Boolean showLegend) {
            return showLegend(Output.of(showLegend));
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
         * @param titleSize The size of the widget&#39;s title (defaults to 16).
         * 
         * @return builder
         * 
         */
        public Builder titleSize(@Nullable Output<String> titleSize) {
            $.titleSize = titleSize;
            return this;
        }

        /**
         * @param titleSize The size of the widget&#39;s title (defaults to 16).
         * 
         * @return builder
         * 
         */
        public Builder titleSize(String titleSize) {
            return titleSize(Output.of(titleSize));
        }

        /**
         * @param yaxis A nested block describing the Y-Axis Controls. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder yaxis(@Nullable Output<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxisArgs> yaxis) {
            $.yaxis = yaxis;
            return this;
        }

        /**
         * @param yaxis A nested block describing the Y-Axis Controls. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder yaxis(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxisArgs yaxis) {
            return yaxis(Output.of(yaxis));
        }

        public DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs build() {
            return $;
        }
    }

}
