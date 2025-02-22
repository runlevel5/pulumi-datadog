// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestApmQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestFormula;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestLogQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadata;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestProcessQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestRumQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQuery;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequest {
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestApmQuery apmQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQuery auditQuery;
    /**
     * @return How to display the marker lines. Valid values are `area`, `bars`, `line`, `overlay`.
     * 
     */
    private @Nullable String displayType;
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestFormula> formulas;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestLogQuery logQuery;
    /**
     * @return Used to define expression aliases. Multiple `metadata` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadata> metadatas;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQuery networkQuery;
    /**
     * @return A Boolean indicating whether the request uses the right or left Y-Axis.
     * 
     */
    private @Nullable Boolean onRightYaxis;
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestProcessQuery processQuery;
    /**
     * @return The metric query to use for this widget.
     * 
     */
    private @Nullable String q;
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQuery> queries;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestRumQuery rumQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQuery securityQuery;
    /**
     * @return The style of the widget graph. Exactly one `style` block is allowed using the structure below.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestStyle style;

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequest() {}
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestApmQuery> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQuery> auditQuery() {
        return Optional.ofNullable(this.auditQuery);
    }
    /**
     * @return How to display the marker lines. Valid values are `area`, `bars`, `line`, `overlay`.
     * 
     */
    public Optional<String> displayType() {
        return Optional.ofNullable(this.displayType);
    }
    public List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestFormula> formulas() {
        return this.formulas == null ? List.of() : this.formulas;
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestLogQuery> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }
    /**
     * @return Used to define expression aliases. Multiple `metadata` blocks are allowed using the structure below.
     * 
     */
    public List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadata> metadatas() {
        return this.metadatas == null ? List.of() : this.metadatas;
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQuery> networkQuery() {
        return Optional.ofNullable(this.networkQuery);
    }
    /**
     * @return A Boolean indicating whether the request uses the right or left Y-Axis.
     * 
     */
    public Optional<Boolean> onRightYaxis() {
        return Optional.ofNullable(this.onRightYaxis);
    }
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    /**
     * @return The metric query to use for this widget.
     * 
     */
    public Optional<String> q() {
        return Optional.ofNullable(this.q);
    }
    public List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQuery> queries() {
        return this.queries == null ? List.of() : this.queries;
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestRumQuery> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQuery> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }
    /**
     * @return The style of the widget graph. Exactly one `style` block is allowed using the structure below.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestStyle> style() {
        return Optional.ofNullable(this.style);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestApmQuery apmQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQuery auditQuery;
        private @Nullable String displayType;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestFormula> formulas;
        private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestLogQuery logQuery;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadata> metadatas;
        private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQuery networkQuery;
        private @Nullable Boolean onRightYaxis;
        private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestProcessQuery processQuery;
        private @Nullable String q;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQuery> queries;
        private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestRumQuery rumQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQuery securityQuery;
        private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestStyle style;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmQuery = defaults.apmQuery;
    	      this.auditQuery = defaults.auditQuery;
    	      this.displayType = defaults.displayType;
    	      this.formulas = defaults.formulas;
    	      this.logQuery = defaults.logQuery;
    	      this.metadatas = defaults.metadatas;
    	      this.networkQuery = defaults.networkQuery;
    	      this.onRightYaxis = defaults.onRightYaxis;
    	      this.processQuery = defaults.processQuery;
    	      this.q = defaults.q;
    	      this.queries = defaults.queries;
    	      this.rumQuery = defaults.rumQuery;
    	      this.securityQuery = defaults.securityQuery;
    	      this.style = defaults.style;
        }

        @CustomType.Setter
        public Builder apmQuery(@Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestApmQuery apmQuery) {

            this.apmQuery = apmQuery;
            return this;
        }
        @CustomType.Setter
        public Builder auditQuery(@Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestAuditQuery auditQuery) {

            this.auditQuery = auditQuery;
            return this;
        }
        @CustomType.Setter
        public Builder displayType(@Nullable String displayType) {

            this.displayType = displayType;
            return this;
        }
        @CustomType.Setter
        public Builder formulas(@Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestFormula> formulas) {

            this.formulas = formulas;
            return this;
        }
        public Builder formulas(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestFormula... formulas) {
            return formulas(List.of(formulas));
        }
        @CustomType.Setter
        public Builder logQuery(@Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestLogQuery logQuery) {

            this.logQuery = logQuery;
            return this;
        }
        @CustomType.Setter
        public Builder metadatas(@Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadata> metadatas) {

            this.metadatas = metadatas;
            return this;
        }
        public Builder metadatas(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestMetadata... metadatas) {
            return metadatas(List.of(metadatas));
        }
        @CustomType.Setter
        public Builder networkQuery(@Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestNetworkQuery networkQuery) {

            this.networkQuery = networkQuery;
            return this;
        }
        @CustomType.Setter
        public Builder onRightYaxis(@Nullable Boolean onRightYaxis) {

            this.onRightYaxis = onRightYaxis;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder q(@Nullable String q) {

            this.q = q;
            return this;
        }
        @CustomType.Setter
        public Builder queries(@Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQuery> queries) {

            this.queries = queries;
            return this;
        }
        public Builder queries(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQuery... queries) {
            return queries(List.of(queries));
        }
        @CustomType.Setter
        public Builder rumQuery(@Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestRumQuery rumQuery) {

            this.rumQuery = rumQuery;
            return this;
        }
        @CustomType.Setter
        public Builder securityQuery(@Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQuery securityQuery) {

            this.securityQuery = securityQuery;
            return this;
        }
        @CustomType.Setter
        public Builder style(@Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestStyle style) {

            this.style = style;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequest build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequest();
            _resultValue.apmQuery = apmQuery;
            _resultValue.auditQuery = auditQuery;
            _resultValue.displayType = displayType;
            _resultValue.formulas = formulas;
            _resultValue.logQuery = logQuery;
            _resultValue.metadatas = metadatas;
            _resultValue.networkQuery = networkQuery;
            _resultValue.onRightYaxis = onRightYaxis;
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
