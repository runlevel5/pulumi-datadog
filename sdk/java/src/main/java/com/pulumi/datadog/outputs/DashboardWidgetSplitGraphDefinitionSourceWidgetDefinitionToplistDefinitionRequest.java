// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestApmQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestAuditQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestConditionalFormat;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormula;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestLogQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestProcessQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestSecurityQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestStyle;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequest {
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestApmQuery apmQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestAuditQuery auditQuery;
    /**
     * @return Conditional formats allow you to set the color of your widget content or background, depending on a rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestConditionalFormat> conditionalFormats;
    private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormula> formulas;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestLogQuery logQuery;
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestProcessQuery processQuery;
    /**
     * @return The metric query to use for this widget.
     * 
     */
    private @Nullable String q;
    private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQuery> queries;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQuery rumQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestSecurityQuery securityQuery;
    /**
     * @return Define request for the widget&#39;s style.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestStyle style;

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequest() {}
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestApmQuery> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestAuditQuery> auditQuery() {
        return Optional.ofNullable(this.auditQuery);
    }
    /**
     * @return Conditional formats allow you to set the color of your widget content or background, depending on a rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    public List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestConditionalFormat> conditionalFormats() {
        return this.conditionalFormats == null ? List.of() : this.conditionalFormats;
    }
    public List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormula> formulas() {
        return this.formulas == null ? List.of() : this.formulas;
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestLogQuery> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    /**
     * @return The metric query to use for this widget.
     * 
     */
    public Optional<String> q() {
        return Optional.ofNullable(this.q);
    }
    public List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQuery> queries() {
        return this.queries == null ? List.of() : this.queries;
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQuery> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestSecurityQuery> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }
    /**
     * @return Define request for the widget&#39;s style.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestStyle> style() {
        return Optional.ofNullable(this.style);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestApmQuery apmQuery;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestAuditQuery auditQuery;
        private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestConditionalFormat> conditionalFormats;
        private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormula> formulas;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestLogQuery logQuery;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestProcessQuery processQuery;
        private @Nullable String q;
        private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQuery> queries;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQuery rumQuery;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestSecurityQuery securityQuery;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestStyle style;
        public Builder() {}
        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmQuery = defaults.apmQuery;
    	      this.auditQuery = defaults.auditQuery;
    	      this.conditionalFormats = defaults.conditionalFormats;
    	      this.formulas = defaults.formulas;
    	      this.logQuery = defaults.logQuery;
    	      this.processQuery = defaults.processQuery;
    	      this.q = defaults.q;
    	      this.queries = defaults.queries;
    	      this.rumQuery = defaults.rumQuery;
    	      this.securityQuery = defaults.securityQuery;
    	      this.style = defaults.style;
        }

        @CustomType.Setter
        public Builder apmQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestApmQuery apmQuery) {

            this.apmQuery = apmQuery;
            return this;
        }
        @CustomType.Setter
        public Builder auditQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestAuditQuery auditQuery) {

            this.auditQuery = auditQuery;
            return this;
        }
        @CustomType.Setter
        public Builder conditionalFormats(@Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestConditionalFormat> conditionalFormats) {

            this.conditionalFormats = conditionalFormats;
            return this;
        }
        public Builder conditionalFormats(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestConditionalFormat... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }
        @CustomType.Setter
        public Builder formulas(@Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormula> formulas) {

            this.formulas = formulas;
            return this;
        }
        public Builder formulas(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestFormula... formulas) {
            return formulas(List.of(formulas));
        }
        @CustomType.Setter
        public Builder logQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestLogQuery logQuery) {

            this.logQuery = logQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder q(@Nullable String q) {

            this.q = q;
            return this;
        }
        @CustomType.Setter
        public Builder queries(@Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQuery> queries) {

            this.queries = queries;
            return this;
        }
        public Builder queries(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQuery... queries) {
            return queries(List.of(queries));
        }
        @CustomType.Setter
        public Builder rumQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQuery rumQuery) {

            this.rumQuery = rumQuery;
            return this;
        }
        @CustomType.Setter
        public Builder securityQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestSecurityQuery securityQuery) {

            this.securityQuery = securityQuery;
            return this;
        }
        @CustomType.Setter
        public Builder style(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestStyle style) {

            this.style = style;
            return this;
        }
        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequest build() {
            final var _resultValue = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequest();
            _resultValue.apmQuery = apmQuery;
            _resultValue.auditQuery = auditQuery;
            _resultValue.conditionalFormats = conditionalFormats;
            _resultValue.formulas = formulas;
            _resultValue.logQuery = logQuery;
            _resultValue.processQuery = processQuery;
            _resultValue.q = q;
            _resultValue.queries = queries;
            _resultValue.rumQuery = rumQuery;
            _resultValue.securityQuery = securityQuery;
            _resultValue.style = style;
            return _resultValue;
        }
    }
}
