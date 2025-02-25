// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetPowerpackDefinitionTemplateVariables;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetPowerpackDefinition {
    /**
     * @return The background color of the powerpack title.
     * 
     */
    private @Nullable String backgroundColor;
    /**
     * @return URL of image to display as a banner for the powerpack.
     * 
     */
    private @Nullable String bannerImg;
    /**
     * @return UUID of the associated powerpack.
     * 
     */
    private String powerpackId;
    /**
     * @return Whether to show the title of the powerpack.
     * 
     */
    private @Nullable Boolean showTitle;
    /**
     * @return The list of template variables for this powerpack.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetPowerpackDefinitionTemplateVariables templateVariables;
    /**
     * @return Title of the powerpack.
     * 
     */
    private @Nullable String title;

    private DashboardWidgetGroupDefinitionWidgetPowerpackDefinition() {}
    /**
     * @return The background color of the powerpack title.
     * 
     */
    public Optional<String> backgroundColor() {
        return Optional.ofNullable(this.backgroundColor);
    }
    /**
     * @return URL of image to display as a banner for the powerpack.
     * 
     */
    public Optional<String> bannerImg() {
        return Optional.ofNullable(this.bannerImg);
    }
    /**
     * @return UUID of the associated powerpack.
     * 
     */
    public String powerpackId() {
        return this.powerpackId;
    }
    /**
     * @return Whether to show the title of the powerpack.
     * 
     */
    public Optional<Boolean> showTitle() {
        return Optional.ofNullable(this.showTitle);
    }
    /**
     * @return The list of template variables for this powerpack.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetPowerpackDefinitionTemplateVariables> templateVariables() {
        return Optional.ofNullable(this.templateVariables);
    }
    /**
     * @return Title of the powerpack.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetPowerpackDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String backgroundColor;
        private @Nullable String bannerImg;
        private String powerpackId;
        private @Nullable Boolean showTitle;
        private @Nullable DashboardWidgetGroupDefinitionWidgetPowerpackDefinitionTemplateVariables templateVariables;
        private @Nullable String title;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetPowerpackDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backgroundColor = defaults.backgroundColor;
    	      this.bannerImg = defaults.bannerImg;
    	      this.powerpackId = defaults.powerpackId;
    	      this.showTitle = defaults.showTitle;
    	      this.templateVariables = defaults.templateVariables;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder backgroundColor(@Nullable String backgroundColor) {

            this.backgroundColor = backgroundColor;
            return this;
        }
        @CustomType.Setter
        public Builder bannerImg(@Nullable String bannerImg) {

            this.bannerImg = bannerImg;
            return this;
        }
        @CustomType.Setter
        public Builder powerpackId(String powerpackId) {
            if (powerpackId == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetPowerpackDefinition", "powerpackId");
            }
            this.powerpackId = powerpackId;
            return this;
        }
        @CustomType.Setter
        public Builder showTitle(@Nullable Boolean showTitle) {

            this.showTitle = showTitle;
            return this;
        }
        @CustomType.Setter
        public Builder templateVariables(@Nullable DashboardWidgetGroupDefinitionWidgetPowerpackDefinitionTemplateVariables templateVariables) {

            this.templateVariables = templateVariables;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {

            this.title = title;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetPowerpackDefinition build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetPowerpackDefinition();
            _resultValue.backgroundColor = backgroundColor;
            _resultValue.bannerImg = bannerImg;
            _resultValue.powerpackId = powerpackId;
            _resultValue.showTitle = showTitle;
            _resultValue.templateVariables = templateVariables;
            _resultValue.title = title;
            return _resultValue;
        }
    }
}
