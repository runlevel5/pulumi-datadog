// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableFormula;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable {
    private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableFormula> formulas;
    private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery> queries;

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable() {}
    public List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableFormula> formulas() {
        return this.formulas == null ? List.of() : this.formulas;
    }
    public List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery> queries() {
        return this.queries == null ? List.of() : this.queries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableFormula> formulas;
        private @Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery> queries;
        public Builder() {}
        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.formulas = defaults.formulas;
    	      this.queries = defaults.queries;
        }

        @CustomType.Setter
        public Builder formulas(@Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableFormula> formulas) {

            this.formulas = formulas;
            return this;
        }
        public Builder formulas(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableFormula... formulas) {
            return formulas(List.of(formulas));
        }
        @CustomType.Setter
        public Builder queries(@Nullable List<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery> queries) {

            this.queries = queries;
            return this;
        }
        public Builder queries(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery... queries) {
            return queries(List.of(queries));
        }
        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable build() {
            final var _resultValue = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTable();
            _resultValue.formulas = formulas;
            _resultValue.queries = queries;
            return _resultValue;
        }
    }
}
