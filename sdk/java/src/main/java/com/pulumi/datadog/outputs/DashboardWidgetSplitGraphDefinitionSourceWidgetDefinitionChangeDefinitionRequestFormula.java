// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaConditionalFormat;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaLimit;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaStyle;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormula {
    /**
     * @return An expression alias.
     * 
     */
    private @Nullable String alias;
    /**
     * @return A list of display modes for each table cell. Valid values are `number`, `bar`.
     * 
     */
    private @Nullable String cellDisplayMode;
    /**
     * @return Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaConditionalFormat> conditionalFormats;
    /**
     * @return A string expression built from queries, formulas, and functions.
     * 
     */
    private String formulaExpression;
    /**
     * @return The options for limiting results returned.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaLimit limit;
    /**
     * @return Styling options for widget formulas.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaStyle style;

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormula() {}
    /**
     * @return An expression alias.
     * 
     */
    public Optional<String> alias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * @return A list of display modes for each table cell. Valid values are `number`, `bar`.
     * 
     */
    public Optional<String> cellDisplayMode() {
        return Optional.ofNullable(this.cellDisplayMode);
    }
    /**
     * @return Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    public List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaConditionalFormat> conditionalFormats() {
        return this.conditionalFormats == null ? List.of() : this.conditionalFormats;
    }
    /**
     * @return A string expression built from queries, formulas, and functions.
     * 
     */
    public String formulaExpression() {
        return this.formulaExpression;
    }
    /**
     * @return The options for limiting results returned.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaLimit> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return Styling options for widget formulas.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaStyle> style() {
        return Optional.ofNullable(this.style);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormula defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alias;
        private @Nullable String cellDisplayMode;
        private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaConditionalFormat> conditionalFormats;
        private String formulaExpression;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaLimit limit;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaStyle style;
        public Builder() {}
        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormula defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.cellDisplayMode = defaults.cellDisplayMode;
    	      this.conditionalFormats = defaults.conditionalFormats;
    	      this.formulaExpression = defaults.formulaExpression;
    	      this.limit = defaults.limit;
    	      this.style = defaults.style;
        }

        @CustomType.Setter
        public Builder alias(@Nullable String alias) {

            this.alias = alias;
            return this;
        }
        @CustomType.Setter
        public Builder cellDisplayMode(@Nullable String cellDisplayMode) {

            this.cellDisplayMode = cellDisplayMode;
            return this;
        }
        @CustomType.Setter
        public Builder conditionalFormats(@Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaConditionalFormat> conditionalFormats) {

            this.conditionalFormats = conditionalFormats;
            return this;
        }
        public Builder conditionalFormats(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaConditionalFormat... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }
        @CustomType.Setter
        public Builder formulaExpression(String formulaExpression) {
            if (formulaExpression == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormula", "formulaExpression");
            }
            this.formulaExpression = formulaExpression;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaLimit limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder style(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormulaStyle style) {

            this.style = style;
            return this;
        }
        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormula build() {
            final var _resultValue = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionRequestFormula();
            _resultValue.alias = alias;
            _resultValue.cellDisplayMode = cellDisplayMode;
            _resultValue.conditionalFormats = conditionalFormats;
            _resultValue.formulaExpression = formulaExpression;
            _resultValue.limit = limit;
            _resultValue.style = style;
            return _resultValue;
        }
    }
}
