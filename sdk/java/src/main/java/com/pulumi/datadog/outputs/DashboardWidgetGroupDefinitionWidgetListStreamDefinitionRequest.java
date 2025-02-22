// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestColumn;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestQuery;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequest {
    /**
     * @return Widget columns.
     * 
     */
    private List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestColumn> columns;
    /**
     * @return Updated list stream widget.
     * 
     */
    private DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestQuery query;
    /**
     * @return Widget response format. Valid values are `event_list`.
     * 
     */
    private String responseFormat;

    private DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequest() {}
    /**
     * @return Widget columns.
     * 
     */
    public List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestColumn> columns() {
        return this.columns;
    }
    /**
     * @return Updated list stream widget.
     * 
     */
    public DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestQuery query() {
        return this.query;
    }
    /**
     * @return Widget response format. Valid values are `event_list`.
     * 
     */
    public String responseFormat() {
        return this.responseFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestColumn> columns;
        private DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestQuery query;
        private String responseFormat;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.query = defaults.query;
    	      this.responseFormat = defaults.responseFormat;
        }

        @CustomType.Setter
        public Builder columns(List<DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestColumn> columns) {
            if (columns == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequest", "columns");
            }
            this.columns = columns;
            return this;
        }
        public Builder columns(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestColumn... columns) {
            return columns(List.of(columns));
        }
        @CustomType.Setter
        public Builder query(DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestQuery query) {
            if (query == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequest", "query");
            }
            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder responseFormat(String responseFormat) {
            if (responseFormat == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequest", "responseFormat");
            }
            this.responseFormat = responseFormat;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequest build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequest();
            _resultValue.columns = columns;
            _resultValue.query = query;
            _resultValue.responseFormat = responseFormat;
            return _resultValue;
        }
    }
}
