// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackLayoutArgs;
import com.pulumi.datadog.inputs.PowerpackTemplateVariableArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackState extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackState Empty = new PowerpackState();

    /**
     * The description of the powerpack.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the powerpack.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The layout of the powerpack on a free-form dashboard.
     * 
     */
    @Import(name="layout")
    private @Nullable Output<PowerpackLayoutArgs> layout;

    /**
     * @return The layout of the powerpack on a free-form dashboard.
     * 
     */
    public Optional<Output<PowerpackLayoutArgs>> layout() {
        return Optional.ofNullable(this.layout);
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
     * The name for the powerpack.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the powerpack.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether or not title should be displayed in the powerpack.
     * 
     */
    @Import(name="showTitle")
    private @Nullable Output<Boolean> showTitle;

    /**
     * @return Whether or not title should be displayed in the powerpack.
     * 
     */
    public Optional<Output<Boolean>> showTitle() {
        return Optional.ofNullable(this.showTitle);
    }

    /**
     * List of tags to identify this powerpack.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return List of tags to identify this powerpack.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The list of template variables for this powerpack.
     * 
     */
    @Import(name="templateVariables")
    private @Nullable Output<List<PowerpackTemplateVariableArgs>> templateVariables;

    /**
     * @return The list of template variables for this powerpack.
     * 
     */
    public Optional<Output<List<PowerpackTemplateVariableArgs>>> templateVariables() {
        return Optional.ofNullable(this.templateVariables);
    }

    /**
     * The list of widgets to display in the powerpack.
     * 
     */
    @Import(name="widgets")
    private @Nullable Output<List<PowerpackWidgetArgs>> widgets;

    /**
     * @return The list of widgets to display in the powerpack.
     * 
     */
    public Optional<Output<List<PowerpackWidgetArgs>>> widgets() {
        return Optional.ofNullable(this.widgets);
    }

    private PowerpackState() {}

    private PowerpackState(PowerpackState $) {
        this.description = $.description;
        this.layout = $.layout;
        this.liveSpan = $.liveSpan;
        this.name = $.name;
        this.showTitle = $.showTitle;
        this.tags = $.tags;
        this.templateVariables = $.templateVariables;
        this.widgets = $.widgets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackState $;

        public Builder() {
            $ = new PowerpackState();
        }

        public Builder(PowerpackState defaults) {
            $ = new PowerpackState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the powerpack.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the powerpack.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param layout The layout of the powerpack on a free-form dashboard.
         * 
         * @return builder
         * 
         */
        public Builder layout(@Nullable Output<PowerpackLayoutArgs> layout) {
            $.layout = layout;
            return this;
        }

        /**
         * @param layout The layout of the powerpack on a free-form dashboard.
         * 
         * @return builder
         * 
         */
        public Builder layout(PowerpackLayoutArgs layout) {
            return layout(Output.of(layout));
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
         * @param name The name for the powerpack.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the powerpack.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param showTitle Whether or not title should be displayed in the powerpack.
         * 
         * @return builder
         * 
         */
        public Builder showTitle(@Nullable Output<Boolean> showTitle) {
            $.showTitle = showTitle;
            return this;
        }

        /**
         * @param showTitle Whether or not title should be displayed in the powerpack.
         * 
         * @return builder
         * 
         */
        public Builder showTitle(Boolean showTitle) {
            return showTitle(Output.of(showTitle));
        }

        /**
         * @param tags List of tags to identify this powerpack.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags List of tags to identify this powerpack.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags List of tags to identify this powerpack.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param templateVariables The list of template variables for this powerpack.
         * 
         * @return builder
         * 
         */
        public Builder templateVariables(@Nullable Output<List<PowerpackTemplateVariableArgs>> templateVariables) {
            $.templateVariables = templateVariables;
            return this;
        }

        /**
         * @param templateVariables The list of template variables for this powerpack.
         * 
         * @return builder
         * 
         */
        public Builder templateVariables(List<PowerpackTemplateVariableArgs> templateVariables) {
            return templateVariables(Output.of(templateVariables));
        }

        /**
         * @param templateVariables The list of template variables for this powerpack.
         * 
         * @return builder
         * 
         */
        public Builder templateVariables(PowerpackTemplateVariableArgs... templateVariables) {
            return templateVariables(List.of(templateVariables));
        }

        /**
         * @param widgets The list of widgets to display in the powerpack.
         * 
         * @return builder
         * 
         */
        public Builder widgets(@Nullable Output<List<PowerpackWidgetArgs>> widgets) {
            $.widgets = widgets;
            return this;
        }

        /**
         * @param widgets The list of widgets to display in the powerpack.
         * 
         * @return builder
         * 
         */
        public Builder widgets(List<PowerpackWidgetArgs> widgets) {
            return widgets(Output.of(widgets));
        }

        /**
         * @param widgets The list of widgets to display in the powerpack.
         * 
         * @return builder
         * 
         */
        public Builder widgets(PowerpackWidgetArgs... widgets) {
            return widgets(List.of(widgets));
        }

        public PowerpackState build() {
            return $;
        }
    }

}
