// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetChangeDefinitionRequestApmQuery;
import com.pulumi.datadog.outputs.DashboardWidgetChangeDefinitionRequestFormula;
import com.pulumi.datadog.outputs.DashboardWidgetChangeDefinitionRequestLogQuery;
import com.pulumi.datadog.outputs.DashboardWidgetChangeDefinitionRequestProcessQuery;
import com.pulumi.datadog.outputs.DashboardWidgetChangeDefinitionRequestQuery;
import com.pulumi.datadog.outputs.DashboardWidgetChangeDefinitionRequestRumQuery;
import com.pulumi.datadog.outputs.DashboardWidgetChangeDefinitionRequestSecurityQuery;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetChangeDefinitionRequest {
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetChangeDefinitionRequestApmQuery apmQuery;
    /**
     * @return Whether to show absolute or relative change. Valid values are `absolute`, `relative`.
     * 
     */
    private @Nullable String changeType;
    /**
     * @return Choose from when to compare current data to. Valid values are `hour_before`, `day_before`, `week_before`, `month_before`.
     * 
     */
    private @Nullable String compareTo;
    private @Nullable List<DashboardWidgetChangeDefinitionRequestFormula> formulas;
    /**
     * @return A Boolean indicating whether an increase in the value is good (displayed in green) or not (displayed in red).
     * 
     */
    private @Nullable Boolean increaseGood;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetChangeDefinitionRequestLogQuery logQuery;
    /**
     * @return What to order by. Valid values are `change`, `name`, `present`, `past`.
     * 
     */
    private @Nullable String orderBy;
    /**
     * @return Widget sorting method. Valid values are `asc`, `desc`.
     * 
     */
    private @Nullable String orderDir;
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    private @Nullable DashboardWidgetChangeDefinitionRequestProcessQuery processQuery;
    /**
     * @return The metric query to use for this widget.
     * 
     */
    private @Nullable String q;
    private @Nullable List<DashboardWidgetChangeDefinitionRequestQuery> queries;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetChangeDefinitionRequestRumQuery rumQuery;
    /**
     * @return The query to use for this widget.
     * 
     */
    private @Nullable DashboardWidgetChangeDefinitionRequestSecurityQuery securityQuery;
    /**
     * @return If set to `true`, displays the current value.
     * 
     */
    private @Nullable Boolean showPresent;

    private DashboardWidgetChangeDefinitionRequest() {}
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetChangeDefinitionRequestApmQuery> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }
    /**
     * @return Whether to show absolute or relative change. Valid values are `absolute`, `relative`.
     * 
     */
    public Optional<String> changeType() {
        return Optional.ofNullable(this.changeType);
    }
    /**
     * @return Choose from when to compare current data to. Valid values are `hour_before`, `day_before`, `week_before`, `month_before`.
     * 
     */
    public Optional<String> compareTo() {
        return Optional.ofNullable(this.compareTo);
    }
    public List<DashboardWidgetChangeDefinitionRequestFormula> formulas() {
        return this.formulas == null ? List.of() : this.formulas;
    }
    /**
     * @return A Boolean indicating whether an increase in the value is good (displayed in green) or not (displayed in red).
     * 
     */
    public Optional<Boolean> increaseGood() {
        return Optional.ofNullable(this.increaseGood);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetChangeDefinitionRequestLogQuery> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }
    /**
     * @return What to order by. Valid values are `change`, `name`, `present`, `past`.
     * 
     */
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }
    /**
     * @return Widget sorting method. Valid values are `asc`, `desc`.
     * 
     */
    public Optional<String> orderDir() {
        return Optional.ofNullable(this.orderDir);
    }
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<DashboardWidgetChangeDefinitionRequestProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    /**
     * @return The metric query to use for this widget.
     * 
     */
    public Optional<String> q() {
        return Optional.ofNullable(this.q);
    }
    public List<DashboardWidgetChangeDefinitionRequestQuery> queries() {
        return this.queries == null ? List.of() : this.queries;
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetChangeDefinitionRequestRumQuery> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }
    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<DashboardWidgetChangeDefinitionRequestSecurityQuery> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }
    /**
     * @return If set to `true`, displays the current value.
     * 
     */
    public Optional<Boolean> showPresent() {
        return Optional.ofNullable(this.showPresent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetChangeDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetChangeDefinitionRequestApmQuery apmQuery;
        private @Nullable String changeType;
        private @Nullable String compareTo;
        private @Nullable List<DashboardWidgetChangeDefinitionRequestFormula> formulas;
        private @Nullable Boolean increaseGood;
        private @Nullable DashboardWidgetChangeDefinitionRequestLogQuery logQuery;
        private @Nullable String orderBy;
        private @Nullable String orderDir;
        private @Nullable DashboardWidgetChangeDefinitionRequestProcessQuery processQuery;
        private @Nullable String q;
        private @Nullable List<DashboardWidgetChangeDefinitionRequestQuery> queries;
        private @Nullable DashboardWidgetChangeDefinitionRequestRumQuery rumQuery;
        private @Nullable DashboardWidgetChangeDefinitionRequestSecurityQuery securityQuery;
        private @Nullable Boolean showPresent;
        public Builder() {}
        public Builder(DashboardWidgetChangeDefinitionRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmQuery = defaults.apmQuery;
    	      this.changeType = defaults.changeType;
    	      this.compareTo = defaults.compareTo;
    	      this.formulas = defaults.formulas;
    	      this.increaseGood = defaults.increaseGood;
    	      this.logQuery = defaults.logQuery;
    	      this.orderBy = defaults.orderBy;
    	      this.orderDir = defaults.orderDir;
    	      this.processQuery = defaults.processQuery;
    	      this.q = defaults.q;
    	      this.queries = defaults.queries;
    	      this.rumQuery = defaults.rumQuery;
    	      this.securityQuery = defaults.securityQuery;
    	      this.showPresent = defaults.showPresent;
        }

        @CustomType.Setter
        public Builder apmQuery(@Nullable DashboardWidgetChangeDefinitionRequestApmQuery apmQuery) {

            this.apmQuery = apmQuery;
            return this;
        }
        @CustomType.Setter
        public Builder changeType(@Nullable String changeType) {

            this.changeType = changeType;
            return this;
        }
        @CustomType.Setter
        public Builder compareTo(@Nullable String compareTo) {

            this.compareTo = compareTo;
            return this;
        }
        @CustomType.Setter
        public Builder formulas(@Nullable List<DashboardWidgetChangeDefinitionRequestFormula> formulas) {

            this.formulas = formulas;
            return this;
        }
        public Builder formulas(DashboardWidgetChangeDefinitionRequestFormula... formulas) {
            return formulas(List.of(formulas));
        }
        @CustomType.Setter
        public Builder increaseGood(@Nullable Boolean increaseGood) {

            this.increaseGood = increaseGood;
            return this;
        }
        @CustomType.Setter
        public Builder logQuery(@Nullable DashboardWidgetChangeDefinitionRequestLogQuery logQuery) {

            this.logQuery = logQuery;
            return this;
        }
        @CustomType.Setter
        public Builder orderBy(@Nullable String orderBy) {

            this.orderBy = orderBy;
            return this;
        }
        @CustomType.Setter
        public Builder orderDir(@Nullable String orderDir) {

            this.orderDir = orderDir;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetChangeDefinitionRequestProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder q(@Nullable String q) {

            this.q = q;
            return this;
        }
        @CustomType.Setter
        public Builder queries(@Nullable List<DashboardWidgetChangeDefinitionRequestQuery> queries) {

            this.queries = queries;
            return this;
        }
        public Builder queries(DashboardWidgetChangeDefinitionRequestQuery... queries) {
            return queries(List.of(queries));
        }
        @CustomType.Setter
        public Builder rumQuery(@Nullable DashboardWidgetChangeDefinitionRequestRumQuery rumQuery) {

            this.rumQuery = rumQuery;
            return this;
        }
        @CustomType.Setter
        public Builder securityQuery(@Nullable DashboardWidgetChangeDefinitionRequestSecurityQuery securityQuery) {

            this.securityQuery = securityQuery;
            return this;
        }
        @CustomType.Setter
        public Builder showPresent(@Nullable Boolean showPresent) {

            this.showPresent = showPresent;
            return this;
        }
        public DashboardWidgetChangeDefinitionRequest build() {
            final var _resultValue = new DashboardWidgetChangeDefinitionRequest();
            _resultValue.apmQuery = apmQuery;
            _resultValue.changeType = changeType;
            _resultValue.compareTo = compareTo;
            _resultValue.formulas = formulas;
            _resultValue.increaseGood = increaseGood;
            _resultValue.logQuery = logQuery;
            _resultValue.orderBy = orderBy;
            _resultValue.orderDir = orderDir;
            _resultValue.processQuery = processQuery;
            _resultValue.q = q;
            _resultValue.queries = queries;
            _resultValue.rumQuery = rumQuery;
            _resultValue.securityQuery = securityQuery;
            _resultValue.showPresent = showPresent;
            return _resultValue;
        }
    }
}
