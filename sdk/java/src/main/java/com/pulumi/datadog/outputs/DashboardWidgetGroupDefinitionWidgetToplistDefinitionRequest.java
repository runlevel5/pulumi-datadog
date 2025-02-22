// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestApmQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestAuditQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestLogQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestProcessQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestRumQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestSecurityQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestStyle;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest {
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestApmQuery apmQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestAuditQuery auditQuery;
    /**
     * @return Conditional formats allow you to set the color of your widget content or background, depending on a rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat> conditionalFormats;
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula> formulas;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestLogQuery logQuery;
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestProcessQuery processQuery;
    /**
     * @return The metric query to use for this widget.
     * 
     */
    private @Nullable String q;
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery> queries;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestRumQuery rumQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestSecurityQuery securityQuery;
    /**
     * @return Define request for the widget&#39;s style.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestStyle style;

    private DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest() {}
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestApmQuery> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestAuditQuery> auditQuery() {
        return Optional.ofNullable(this.auditQuery);
    }
    /**
     * @return Conditional formats allow you to set the color of your widget content or background, depending on a rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    public List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat> conditionalFormats() {
        return this.conditionalFormats == null ? List.of() : this.conditionalFormats;
    }
    public List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula> formulas() {
        return this.formulas == null ? List.of() : this.formulas;
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestLogQuery> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    /**
     * @return The metric query to use for this widget.
     * 
     */
    public Optional<String> q() {
        return Optional.ofNullable(this.q);
    }
    public List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery> queries() {
        return this.queries == null ? List.of() : this.queries;
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestRumQuery> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestSecurityQuery> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }
    /**
     * @return Define request for the widget&#39;s style.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestStyle> style() {
        return Optional.ofNullable(this.style);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestApmQuery apmQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestAuditQuery auditQuery;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat> conditionalFormats;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula> formulas;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestLogQuery logQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestProcessQuery processQuery;
        private @Nullable String q;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery> queries;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestRumQuery rumQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestSecurityQuery securityQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestStyle style;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest defaults) {
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
        public Builder apmQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestApmQuery apmQuery) {

            this.apmQuery = apmQuery;
            return this;
        }
        @CustomType.Setter
        public Builder auditQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestAuditQuery auditQuery) {

            this.auditQuery = auditQuery;
            return this;
        }
        @CustomType.Setter
        public Builder conditionalFormats(@Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat> conditionalFormats) {

            this.conditionalFormats = conditionalFormats;
            return this;
        }
        public Builder conditionalFormats(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormat... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }
        @CustomType.Setter
        public Builder formulas(@Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula> formulas) {

            this.formulas = formulas;
            return this;
        }
        public Builder formulas(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestFormula... formulas) {
            return formulas(List.of(formulas));
        }
        @CustomType.Setter
        public Builder logQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestLogQuery logQuery) {

            this.logQuery = logQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder q(@Nullable String q) {

            this.q = q;
            return this;
        }
        @CustomType.Setter
        public Builder queries(@Nullable List<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery> queries) {

            this.queries = queries;
            return this;
        }
        public Builder queries(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQuery... queries) {
            return queries(List.of(queries));
        }
        @CustomType.Setter
        public Builder rumQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestRumQuery rumQuery) {

            this.rumQuery = rumQuery;
            return this;
        }
        @CustomType.Setter
        public Builder securityQuery(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestSecurityQuery securityQuery) {

            this.securityQuery = securityQuery;
            return this;
        }
        @CustomType.Setter
        public Builder style(@Nullable DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestStyle style) {

            this.style = style;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequest();
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
