// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs Empty = new DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs();

    /**
     * The number of columns to display. Valid values are `one_column`, `two_column`, `three_column`.
     * 
     */
    @Import(name="displayFormat")
    private @Nullable Output<String> displayFormat;

    /**
     * @return The number of columns to display. Valid values are `one_column`, `two_column`, `three_column`.
     * 
     */
    public Optional<Output<String>> displayFormat() {
        return Optional.ofNullable(this.displayFormat);
    }

    /**
     * APM environment.
     * 
     */
    @Import(name="env", required=true)
    private Output<String> env;

    /**
     * @return APM environment.
     * 
     */
    public Output<String> env() {
        return this.env;
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
     * APM service.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return APM service.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     * Whether to show the latency breakdown or not.
     * 
     */
    @Import(name="showBreakdown")
    private @Nullable Output<Boolean> showBreakdown;

    /**
     * @return Whether to show the latency breakdown or not.
     * 
     */
    public Optional<Output<Boolean>> showBreakdown() {
        return Optional.ofNullable(this.showBreakdown);
    }

    /**
     * Whether to show the latency distribution or not.
     * 
     */
    @Import(name="showDistribution")
    private @Nullable Output<Boolean> showDistribution;

    /**
     * @return Whether to show the latency distribution or not.
     * 
     */
    public Optional<Output<Boolean>> showDistribution() {
        return Optional.ofNullable(this.showDistribution);
    }

    /**
     * Whether to show the error metrics or not.
     * 
     */
    @Import(name="showErrors")
    private @Nullable Output<Boolean> showErrors;

    /**
     * @return Whether to show the error metrics or not.
     * 
     */
    public Optional<Output<Boolean>> showErrors() {
        return Optional.ofNullable(this.showErrors);
    }

    /**
     * Whether to show the hits metrics or not
     * 
     */
    @Import(name="showHits")
    private @Nullable Output<Boolean> showHits;

    /**
     * @return Whether to show the hits metrics or not
     * 
     */
    public Optional<Output<Boolean>> showHits() {
        return Optional.ofNullable(this.showHits);
    }

    /**
     * Whether to show the latency metrics or not.
     * 
     */
    @Import(name="showLatency")
    private @Nullable Output<Boolean> showLatency;

    /**
     * @return Whether to show the latency metrics or not.
     * 
     */
    public Optional<Output<Boolean>> showLatency() {
        return Optional.ofNullable(this.showLatency);
    }

    /**
     * Whether to show the resource list or not.
     * 
     */
    @Import(name="showResourceList")
    private @Nullable Output<Boolean> showResourceList;

    /**
     * @return Whether to show the resource list or not.
     * 
     */
    public Optional<Output<Boolean>> showResourceList() {
        return Optional.ofNullable(this.showResourceList);
    }

    /**
     * The size of the widget. Valid values are `small`, `medium`, `large`.
     * 
     */
    @Import(name="sizeFormat")
    private @Nullable Output<String> sizeFormat;

    /**
     * @return The size of the widget. Valid values are `small`, `medium`, `large`.
     * 
     */
    public Optional<Output<String>> sizeFormat() {
        return Optional.ofNullable(this.sizeFormat);
    }

    /**
     * APM span name
     * 
     */
    @Import(name="spanName", required=true)
    private Output<String> spanName;

    /**
     * @return APM span name
     * 
     */
    public Output<String> spanName() {
        return this.spanName;
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

    private DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs() {}

    private DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs(DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs $) {
        this.displayFormat = $.displayFormat;
        this.env = $.env;
        this.liveSpan = $.liveSpan;
        this.service = $.service;
        this.showBreakdown = $.showBreakdown;
        this.showDistribution = $.showDistribution;
        this.showErrors = $.showErrors;
        this.showHits = $.showHits;
        this.showLatency = $.showLatency;
        this.showResourceList = $.showResourceList;
        this.sizeFormat = $.sizeFormat;
        this.spanName = $.spanName;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayFormat The number of columns to display. Valid values are `one_column`, `two_column`, `three_column`.
         * 
         * @return builder
         * 
         */
        public Builder displayFormat(@Nullable Output<String> displayFormat) {
            $.displayFormat = displayFormat;
            return this;
        }

        /**
         * @param displayFormat The number of columns to display. Valid values are `one_column`, `two_column`, `three_column`.
         * 
         * @return builder
         * 
         */
        public Builder displayFormat(String displayFormat) {
            return displayFormat(Output.of(displayFormat));
        }

        /**
         * @param env APM environment.
         * 
         * @return builder
         * 
         */
        public Builder env(Output<String> env) {
            $.env = env;
            return this;
        }

        /**
         * @param env APM environment.
         * 
         * @return builder
         * 
         */
        public Builder env(String env) {
            return env(Output.of(env));
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
         * @param service APM service.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service APM service.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param showBreakdown Whether to show the latency breakdown or not.
         * 
         * @return builder
         * 
         */
        public Builder showBreakdown(@Nullable Output<Boolean> showBreakdown) {
            $.showBreakdown = showBreakdown;
            return this;
        }

        /**
         * @param showBreakdown Whether to show the latency breakdown or not.
         * 
         * @return builder
         * 
         */
        public Builder showBreakdown(Boolean showBreakdown) {
            return showBreakdown(Output.of(showBreakdown));
        }

        /**
         * @param showDistribution Whether to show the latency distribution or not.
         * 
         * @return builder
         * 
         */
        public Builder showDistribution(@Nullable Output<Boolean> showDistribution) {
            $.showDistribution = showDistribution;
            return this;
        }

        /**
         * @param showDistribution Whether to show the latency distribution or not.
         * 
         * @return builder
         * 
         */
        public Builder showDistribution(Boolean showDistribution) {
            return showDistribution(Output.of(showDistribution));
        }

        /**
         * @param showErrors Whether to show the error metrics or not.
         * 
         * @return builder
         * 
         */
        public Builder showErrors(@Nullable Output<Boolean> showErrors) {
            $.showErrors = showErrors;
            return this;
        }

        /**
         * @param showErrors Whether to show the error metrics or not.
         * 
         * @return builder
         * 
         */
        public Builder showErrors(Boolean showErrors) {
            return showErrors(Output.of(showErrors));
        }

        /**
         * @param showHits Whether to show the hits metrics or not
         * 
         * @return builder
         * 
         */
        public Builder showHits(@Nullable Output<Boolean> showHits) {
            $.showHits = showHits;
            return this;
        }

        /**
         * @param showHits Whether to show the hits metrics or not
         * 
         * @return builder
         * 
         */
        public Builder showHits(Boolean showHits) {
            return showHits(Output.of(showHits));
        }

        /**
         * @param showLatency Whether to show the latency metrics or not.
         * 
         * @return builder
         * 
         */
        public Builder showLatency(@Nullable Output<Boolean> showLatency) {
            $.showLatency = showLatency;
            return this;
        }

        /**
         * @param showLatency Whether to show the latency metrics or not.
         * 
         * @return builder
         * 
         */
        public Builder showLatency(Boolean showLatency) {
            return showLatency(Output.of(showLatency));
        }

        /**
         * @param showResourceList Whether to show the resource list or not.
         * 
         * @return builder
         * 
         */
        public Builder showResourceList(@Nullable Output<Boolean> showResourceList) {
            $.showResourceList = showResourceList;
            return this;
        }

        /**
         * @param showResourceList Whether to show the resource list or not.
         * 
         * @return builder
         * 
         */
        public Builder showResourceList(Boolean showResourceList) {
            return showResourceList(Output.of(showResourceList));
        }

        /**
         * @param sizeFormat The size of the widget. Valid values are `small`, `medium`, `large`.
         * 
         * @return builder
         * 
         */
        public Builder sizeFormat(@Nullable Output<String> sizeFormat) {
            $.sizeFormat = sizeFormat;
            return this;
        }

        /**
         * @param sizeFormat The size of the widget. Valid values are `small`, `medium`, `large`.
         * 
         * @return builder
         * 
         */
        public Builder sizeFormat(String sizeFormat) {
            return sizeFormat(Output.of(sizeFormat));
        }

        /**
         * @param spanName APM span name
         * 
         * @return builder
         * 
         */
        public Builder spanName(Output<String> spanName) {
            $.spanName = spanName;
            return this;
        }

        /**
         * @param spanName APM span name
         * 
         * @return builder
         * 
         */
        public Builder spanName(String spanName) {
            return spanName(Output.of(spanName));
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

        public DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs build() {
            if ($.env == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs", "env");
            }
            if ($.service == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs", "service");
            }
            if ($.spanName == null) {
                throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs", "spanName");
            }
            return $;
        }
    }

}
