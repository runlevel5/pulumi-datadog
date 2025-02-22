// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetAlertGraphDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetAlertValueDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetChangeDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetCheckStatusDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetDistributionDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetEventStreamDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetEventTimelineDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetFreeTextDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetGeomapDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetHeatmapDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetHostmapDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetIframeDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetImageDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetListStreamDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetLogStreamDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetManageStatusDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetNoteDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetPowerpackDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetQueryTableDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetQueryValueDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetRunWorkflowDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetServiceLevelObjectiveDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetServicemapDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetSloListDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetSunburstDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetTimeseriesDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetToplistDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetTopologyMapDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetTraceServiceDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetTreemapDefinition;
import com.pulumi.datadog.outputs.DashboardWidgetWidgetLayout;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidget {
    /**
     * @return The definition for a Alert Graph widget.
     * 
     */
    private @Nullable DashboardWidgetAlertGraphDefinition alertGraphDefinition;
    /**
     * @return The definition for a Alert Value widget.
     * 
     */
    private @Nullable DashboardWidgetAlertValueDefinition alertValueDefinition;
    /**
     * @return The definition for a Change widget.
     * 
     */
    private @Nullable DashboardWidgetChangeDefinition changeDefinition;
    /**
     * @return The definition for a Check Status widget.
     * 
     */
    private @Nullable DashboardWidgetCheckStatusDefinition checkStatusDefinition;
    /**
     * @return The definition for a Distribution widget.
     * 
     */
    private @Nullable DashboardWidgetDistributionDefinition distributionDefinition;
    /**
     * @return The definition for a Event Stream widget.
     * 
     */
    private @Nullable DashboardWidgetEventStreamDefinition eventStreamDefinition;
    /**
     * @return The definition for a Event Timeline widget.
     * 
     */
    private @Nullable DashboardWidgetEventTimelineDefinition eventTimelineDefinition;
    /**
     * @return The definition for a Free Text widget.
     * 
     */
    private @Nullable DashboardWidgetFreeTextDefinition freeTextDefinition;
    /**
     * @return The definition for a Geomap widget.
     * 
     */
    private @Nullable DashboardWidgetGeomapDefinition geomapDefinition;
    /**
     * @return The definition for a Group widget.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinition groupDefinition;
    /**
     * @return The definition for a Heatmap widget.
     * 
     */
    private @Nullable DashboardWidgetHeatmapDefinition heatmapDefinition;
    /**
     * @return The definition for a Hostmap widget.
     * 
     */
    private @Nullable DashboardWidgetHostmapDefinition hostmapDefinition;
    /**
     * @return The ID of the widget.
     * 
     */
    private @Nullable Integer id;
    /**
     * @return The definition for an Iframe widget.
     * 
     */
    private @Nullable DashboardWidgetIframeDefinition iframeDefinition;
    /**
     * @return The definition for an Image widget
     * 
     */
    private @Nullable DashboardWidgetImageDefinition imageDefinition;
    /**
     * @return The definition for a List Stream widget.
     * 
     */
    private @Nullable DashboardWidgetListStreamDefinition listStreamDefinition;
    /**
     * @return The definition for an Log Stream widget.
     * 
     */
    private @Nullable DashboardWidgetLogStreamDefinition logStreamDefinition;
    /**
     * @return The definition for an Manage Status widget.
     * 
     */
    private @Nullable DashboardWidgetManageStatusDefinition manageStatusDefinition;
    /**
     * @return The definition for a Note widget.
     * 
     */
    private @Nullable DashboardWidgetNoteDefinition noteDefinition;
    /**
     * @return The definition for a Powerpack widget.
     * 
     */
    private @Nullable DashboardWidgetPowerpackDefinition powerpackDefinition;
    /**
     * @return The definition for a Query Table widget.
     * 
     */
    private @Nullable DashboardWidgetQueryTableDefinition queryTableDefinition;
    /**
     * @return The definition for a Query Value widget.
     * 
     */
    private @Nullable DashboardWidgetQueryValueDefinition queryValueDefinition;
    /**
     * @return The definition for a Run Workflow widget.
     * 
     */
    private @Nullable DashboardWidgetRunWorkflowDefinition runWorkflowDefinition;
    /**
     * @return The definition for a Scatterplot widget.
     * 
     */
    private @Nullable DashboardWidgetScatterplotDefinition scatterplotDefinition;
    /**
     * @return The definition for a Service Level Objective widget.
     * 
     */
    private @Nullable DashboardWidgetServiceLevelObjectiveDefinition serviceLevelObjectiveDefinition;
    /**
     * @return The definition for a Service Map widget.
     * 
     */
    private @Nullable DashboardWidgetServicemapDefinition servicemapDefinition;
    /**
     * @return The definition for an SLO (Service Level Objective) List widget.
     * 
     */
    private @Nullable DashboardWidgetSloListDefinition sloListDefinition;
    /**
     * @return The definition for a Split Graph widget.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinition splitGraphDefinition;
    /**
     * @return The definition for a Sunburst widget.
     * 
     */
    private @Nullable DashboardWidgetSunburstDefinition sunburstDefinition;
    /**
     * @return The definition for a Timeseries widget.
     * 
     */
    private @Nullable DashboardWidgetTimeseriesDefinition timeseriesDefinition;
    /**
     * @return The definition for a Toplist widget.
     * 
     */
    private @Nullable DashboardWidgetToplistDefinition toplistDefinition;
    /**
     * @return The definition for a Topology Map widget.
     * 
     */
    private @Nullable DashboardWidgetTopologyMapDefinition topologyMapDefinition;
    /**
     * @return The definition for a Trace Service widget.
     * 
     */
    private @Nullable DashboardWidgetTraceServiceDefinition traceServiceDefinition;
    /**
     * @return The definition for a Treemap widget.
     * 
     */
    private @Nullable DashboardWidgetTreemapDefinition treemapDefinition;
    /**
     * @return The layout of the widget on a &#39;free&#39; dashboard.
     * 
     */
    private @Nullable DashboardWidgetWidgetLayout widgetLayout;

    private DashboardWidget() {}
    /**
     * @return The definition for a Alert Graph widget.
     * 
     */
    public Optional<DashboardWidgetAlertGraphDefinition> alertGraphDefinition() {
        return Optional.ofNullable(this.alertGraphDefinition);
    }
    /**
     * @return The definition for a Alert Value widget.
     * 
     */
    public Optional<DashboardWidgetAlertValueDefinition> alertValueDefinition() {
        return Optional.ofNullable(this.alertValueDefinition);
    }
    /**
     * @return The definition for a Change widget.
     * 
     */
    public Optional<DashboardWidgetChangeDefinition> changeDefinition() {
        return Optional.ofNullable(this.changeDefinition);
    }
    /**
     * @return The definition for a Check Status widget.
     * 
     */
    public Optional<DashboardWidgetCheckStatusDefinition> checkStatusDefinition() {
        return Optional.ofNullable(this.checkStatusDefinition);
    }
    /**
     * @return The definition for a Distribution widget.
     * 
     */
    public Optional<DashboardWidgetDistributionDefinition> distributionDefinition() {
        return Optional.ofNullable(this.distributionDefinition);
    }
    /**
     * @return The definition for a Event Stream widget.
     * 
     */
    public Optional<DashboardWidgetEventStreamDefinition> eventStreamDefinition() {
        return Optional.ofNullable(this.eventStreamDefinition);
    }
    /**
     * @return The definition for a Event Timeline widget.
     * 
     */
    public Optional<DashboardWidgetEventTimelineDefinition> eventTimelineDefinition() {
        return Optional.ofNullable(this.eventTimelineDefinition);
    }
    /**
     * @return The definition for a Free Text widget.
     * 
     */
    public Optional<DashboardWidgetFreeTextDefinition> freeTextDefinition() {
        return Optional.ofNullable(this.freeTextDefinition);
    }
    /**
     * @return The definition for a Geomap widget.
     * 
     */
    public Optional<DashboardWidgetGeomapDefinition> geomapDefinition() {
        return Optional.ofNullable(this.geomapDefinition);
    }
    /**
     * @return The definition for a Group widget.
     * 
     */
    public Optional<DashboardWidgetGroupDefinition> groupDefinition() {
        return Optional.ofNullable(this.groupDefinition);
    }
    /**
     * @return The definition for a Heatmap widget.
     * 
     */
    public Optional<DashboardWidgetHeatmapDefinition> heatmapDefinition() {
        return Optional.ofNullable(this.heatmapDefinition);
    }
    /**
     * @return The definition for a Hostmap widget.
     * 
     */
    public Optional<DashboardWidgetHostmapDefinition> hostmapDefinition() {
        return Optional.ofNullable(this.hostmapDefinition);
    }
    /**
     * @return The ID of the widget.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The definition for an Iframe widget.
     * 
     */
    public Optional<DashboardWidgetIframeDefinition> iframeDefinition() {
        return Optional.ofNullable(this.iframeDefinition);
    }
    /**
     * @return The definition for an Image widget
     * 
     */
    public Optional<DashboardWidgetImageDefinition> imageDefinition() {
        return Optional.ofNullable(this.imageDefinition);
    }
    /**
     * @return The definition for a List Stream widget.
     * 
     */
    public Optional<DashboardWidgetListStreamDefinition> listStreamDefinition() {
        return Optional.ofNullable(this.listStreamDefinition);
    }
    /**
     * @return The definition for an Log Stream widget.
     * 
     */
    public Optional<DashboardWidgetLogStreamDefinition> logStreamDefinition() {
        return Optional.ofNullable(this.logStreamDefinition);
    }
    /**
     * @return The definition for an Manage Status widget.
     * 
     */
    public Optional<DashboardWidgetManageStatusDefinition> manageStatusDefinition() {
        return Optional.ofNullable(this.manageStatusDefinition);
    }
    /**
     * @return The definition for a Note widget.
     * 
     */
    public Optional<DashboardWidgetNoteDefinition> noteDefinition() {
        return Optional.ofNullable(this.noteDefinition);
    }
    /**
     * @return The definition for a Powerpack widget.
     * 
     */
    public Optional<DashboardWidgetPowerpackDefinition> powerpackDefinition() {
        return Optional.ofNullable(this.powerpackDefinition);
    }
    /**
     * @return The definition for a Query Table widget.
     * 
     */
    public Optional<DashboardWidgetQueryTableDefinition> queryTableDefinition() {
        return Optional.ofNullable(this.queryTableDefinition);
    }
    /**
     * @return The definition for a Query Value widget.
     * 
     */
    public Optional<DashboardWidgetQueryValueDefinition> queryValueDefinition() {
        return Optional.ofNullable(this.queryValueDefinition);
    }
    /**
     * @return The definition for a Run Workflow widget.
     * 
     */
    public Optional<DashboardWidgetRunWorkflowDefinition> runWorkflowDefinition() {
        return Optional.ofNullable(this.runWorkflowDefinition);
    }
    /**
     * @return The definition for a Scatterplot widget.
     * 
     */
    public Optional<DashboardWidgetScatterplotDefinition> scatterplotDefinition() {
        return Optional.ofNullable(this.scatterplotDefinition);
    }
    /**
     * @return The definition for a Service Level Objective widget.
     * 
     */
    public Optional<DashboardWidgetServiceLevelObjectiveDefinition> serviceLevelObjectiveDefinition() {
        return Optional.ofNullable(this.serviceLevelObjectiveDefinition);
    }
    /**
     * @return The definition for a Service Map widget.
     * 
     */
    public Optional<DashboardWidgetServicemapDefinition> servicemapDefinition() {
        return Optional.ofNullable(this.servicemapDefinition);
    }
    /**
     * @return The definition for an SLO (Service Level Objective) List widget.
     * 
     */
    public Optional<DashboardWidgetSloListDefinition> sloListDefinition() {
        return Optional.ofNullable(this.sloListDefinition);
    }
    /**
     * @return The definition for a Split Graph widget.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinition> splitGraphDefinition() {
        return Optional.ofNullable(this.splitGraphDefinition);
    }
    /**
     * @return The definition for a Sunburst widget.
     * 
     */
    public Optional<DashboardWidgetSunburstDefinition> sunburstDefinition() {
        return Optional.ofNullable(this.sunburstDefinition);
    }
    /**
     * @return The definition for a Timeseries widget.
     * 
     */
    public Optional<DashboardWidgetTimeseriesDefinition> timeseriesDefinition() {
        return Optional.ofNullable(this.timeseriesDefinition);
    }
    /**
     * @return The definition for a Toplist widget.
     * 
     */
    public Optional<DashboardWidgetToplistDefinition> toplistDefinition() {
        return Optional.ofNullable(this.toplistDefinition);
    }
    /**
     * @return The definition for a Topology Map widget.
     * 
     */
    public Optional<DashboardWidgetTopologyMapDefinition> topologyMapDefinition() {
        return Optional.ofNullable(this.topologyMapDefinition);
    }
    /**
     * @return The definition for a Trace Service widget.
     * 
     */
    public Optional<DashboardWidgetTraceServiceDefinition> traceServiceDefinition() {
        return Optional.ofNullable(this.traceServiceDefinition);
    }
    /**
     * @return The definition for a Treemap widget.
     * 
     */
    public Optional<DashboardWidgetTreemapDefinition> treemapDefinition() {
        return Optional.ofNullable(this.treemapDefinition);
    }
    /**
     * @return The layout of the widget on a &#39;free&#39; dashboard.
     * 
     */
    public Optional<DashboardWidgetWidgetLayout> widgetLayout() {
        return Optional.ofNullable(this.widgetLayout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetAlertGraphDefinition alertGraphDefinition;
        private @Nullable DashboardWidgetAlertValueDefinition alertValueDefinition;
        private @Nullable DashboardWidgetChangeDefinition changeDefinition;
        private @Nullable DashboardWidgetCheckStatusDefinition checkStatusDefinition;
        private @Nullable DashboardWidgetDistributionDefinition distributionDefinition;
        private @Nullable DashboardWidgetEventStreamDefinition eventStreamDefinition;
        private @Nullable DashboardWidgetEventTimelineDefinition eventTimelineDefinition;
        private @Nullable DashboardWidgetFreeTextDefinition freeTextDefinition;
        private @Nullable DashboardWidgetGeomapDefinition geomapDefinition;
        private @Nullable DashboardWidgetGroupDefinition groupDefinition;
        private @Nullable DashboardWidgetHeatmapDefinition heatmapDefinition;
        private @Nullable DashboardWidgetHostmapDefinition hostmapDefinition;
        private @Nullable Integer id;
        private @Nullable DashboardWidgetIframeDefinition iframeDefinition;
        private @Nullable DashboardWidgetImageDefinition imageDefinition;
        private @Nullable DashboardWidgetListStreamDefinition listStreamDefinition;
        private @Nullable DashboardWidgetLogStreamDefinition logStreamDefinition;
        private @Nullable DashboardWidgetManageStatusDefinition manageStatusDefinition;
        private @Nullable DashboardWidgetNoteDefinition noteDefinition;
        private @Nullable DashboardWidgetPowerpackDefinition powerpackDefinition;
        private @Nullable DashboardWidgetQueryTableDefinition queryTableDefinition;
        private @Nullable DashboardWidgetQueryValueDefinition queryValueDefinition;
        private @Nullable DashboardWidgetRunWorkflowDefinition runWorkflowDefinition;
        private @Nullable DashboardWidgetScatterplotDefinition scatterplotDefinition;
        private @Nullable DashboardWidgetServiceLevelObjectiveDefinition serviceLevelObjectiveDefinition;
        private @Nullable DashboardWidgetServicemapDefinition servicemapDefinition;
        private @Nullable DashboardWidgetSloListDefinition sloListDefinition;
        private @Nullable DashboardWidgetSplitGraphDefinition splitGraphDefinition;
        private @Nullable DashboardWidgetSunburstDefinition sunburstDefinition;
        private @Nullable DashboardWidgetTimeseriesDefinition timeseriesDefinition;
        private @Nullable DashboardWidgetToplistDefinition toplistDefinition;
        private @Nullable DashboardWidgetTopologyMapDefinition topologyMapDefinition;
        private @Nullable DashboardWidgetTraceServiceDefinition traceServiceDefinition;
        private @Nullable DashboardWidgetTreemapDefinition treemapDefinition;
        private @Nullable DashboardWidgetWidgetLayout widgetLayout;
        public Builder() {}
        public Builder(DashboardWidget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertGraphDefinition = defaults.alertGraphDefinition;
    	      this.alertValueDefinition = defaults.alertValueDefinition;
    	      this.changeDefinition = defaults.changeDefinition;
    	      this.checkStatusDefinition = defaults.checkStatusDefinition;
    	      this.distributionDefinition = defaults.distributionDefinition;
    	      this.eventStreamDefinition = defaults.eventStreamDefinition;
    	      this.eventTimelineDefinition = defaults.eventTimelineDefinition;
    	      this.freeTextDefinition = defaults.freeTextDefinition;
    	      this.geomapDefinition = defaults.geomapDefinition;
    	      this.groupDefinition = defaults.groupDefinition;
    	      this.heatmapDefinition = defaults.heatmapDefinition;
    	      this.hostmapDefinition = defaults.hostmapDefinition;
    	      this.id = defaults.id;
    	      this.iframeDefinition = defaults.iframeDefinition;
    	      this.imageDefinition = defaults.imageDefinition;
    	      this.listStreamDefinition = defaults.listStreamDefinition;
    	      this.logStreamDefinition = defaults.logStreamDefinition;
    	      this.manageStatusDefinition = defaults.manageStatusDefinition;
    	      this.noteDefinition = defaults.noteDefinition;
    	      this.powerpackDefinition = defaults.powerpackDefinition;
    	      this.queryTableDefinition = defaults.queryTableDefinition;
    	      this.queryValueDefinition = defaults.queryValueDefinition;
    	      this.runWorkflowDefinition = defaults.runWorkflowDefinition;
    	      this.scatterplotDefinition = defaults.scatterplotDefinition;
    	      this.serviceLevelObjectiveDefinition = defaults.serviceLevelObjectiveDefinition;
    	      this.servicemapDefinition = defaults.servicemapDefinition;
    	      this.sloListDefinition = defaults.sloListDefinition;
    	      this.splitGraphDefinition = defaults.splitGraphDefinition;
    	      this.sunburstDefinition = defaults.sunburstDefinition;
    	      this.timeseriesDefinition = defaults.timeseriesDefinition;
    	      this.toplistDefinition = defaults.toplistDefinition;
    	      this.topologyMapDefinition = defaults.topologyMapDefinition;
    	      this.traceServiceDefinition = defaults.traceServiceDefinition;
    	      this.treemapDefinition = defaults.treemapDefinition;
    	      this.widgetLayout = defaults.widgetLayout;
        }

        @CustomType.Setter
        public Builder alertGraphDefinition(@Nullable DashboardWidgetAlertGraphDefinition alertGraphDefinition) {

            this.alertGraphDefinition = alertGraphDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder alertValueDefinition(@Nullable DashboardWidgetAlertValueDefinition alertValueDefinition) {

            this.alertValueDefinition = alertValueDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder changeDefinition(@Nullable DashboardWidgetChangeDefinition changeDefinition) {

            this.changeDefinition = changeDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder checkStatusDefinition(@Nullable DashboardWidgetCheckStatusDefinition checkStatusDefinition) {

            this.checkStatusDefinition = checkStatusDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder distributionDefinition(@Nullable DashboardWidgetDistributionDefinition distributionDefinition) {

            this.distributionDefinition = distributionDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder eventStreamDefinition(@Nullable DashboardWidgetEventStreamDefinition eventStreamDefinition) {

            this.eventStreamDefinition = eventStreamDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder eventTimelineDefinition(@Nullable DashboardWidgetEventTimelineDefinition eventTimelineDefinition) {

            this.eventTimelineDefinition = eventTimelineDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder freeTextDefinition(@Nullable DashboardWidgetFreeTextDefinition freeTextDefinition) {

            this.freeTextDefinition = freeTextDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder geomapDefinition(@Nullable DashboardWidgetGeomapDefinition geomapDefinition) {

            this.geomapDefinition = geomapDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder groupDefinition(@Nullable DashboardWidgetGroupDefinition groupDefinition) {

            this.groupDefinition = groupDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder heatmapDefinition(@Nullable DashboardWidgetHeatmapDefinition heatmapDefinition) {

            this.heatmapDefinition = heatmapDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder hostmapDefinition(@Nullable DashboardWidgetHostmapDefinition hostmapDefinition) {

            this.hostmapDefinition = hostmapDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable Integer id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder iframeDefinition(@Nullable DashboardWidgetIframeDefinition iframeDefinition) {

            this.iframeDefinition = iframeDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder imageDefinition(@Nullable DashboardWidgetImageDefinition imageDefinition) {

            this.imageDefinition = imageDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder listStreamDefinition(@Nullable DashboardWidgetListStreamDefinition listStreamDefinition) {

            this.listStreamDefinition = listStreamDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder logStreamDefinition(@Nullable DashboardWidgetLogStreamDefinition logStreamDefinition) {

            this.logStreamDefinition = logStreamDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder manageStatusDefinition(@Nullable DashboardWidgetManageStatusDefinition manageStatusDefinition) {

            this.manageStatusDefinition = manageStatusDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder noteDefinition(@Nullable DashboardWidgetNoteDefinition noteDefinition) {

            this.noteDefinition = noteDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder powerpackDefinition(@Nullable DashboardWidgetPowerpackDefinition powerpackDefinition) {

            this.powerpackDefinition = powerpackDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder queryTableDefinition(@Nullable DashboardWidgetQueryTableDefinition queryTableDefinition) {

            this.queryTableDefinition = queryTableDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder queryValueDefinition(@Nullable DashboardWidgetQueryValueDefinition queryValueDefinition) {

            this.queryValueDefinition = queryValueDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder runWorkflowDefinition(@Nullable DashboardWidgetRunWorkflowDefinition runWorkflowDefinition) {

            this.runWorkflowDefinition = runWorkflowDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder scatterplotDefinition(@Nullable DashboardWidgetScatterplotDefinition scatterplotDefinition) {

            this.scatterplotDefinition = scatterplotDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder serviceLevelObjectiveDefinition(@Nullable DashboardWidgetServiceLevelObjectiveDefinition serviceLevelObjectiveDefinition) {

            this.serviceLevelObjectiveDefinition = serviceLevelObjectiveDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder servicemapDefinition(@Nullable DashboardWidgetServicemapDefinition servicemapDefinition) {

            this.servicemapDefinition = servicemapDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder sloListDefinition(@Nullable DashboardWidgetSloListDefinition sloListDefinition) {

            this.sloListDefinition = sloListDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder splitGraphDefinition(@Nullable DashboardWidgetSplitGraphDefinition splitGraphDefinition) {

            this.splitGraphDefinition = splitGraphDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder sunburstDefinition(@Nullable DashboardWidgetSunburstDefinition sunburstDefinition) {

            this.sunburstDefinition = sunburstDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder timeseriesDefinition(@Nullable DashboardWidgetTimeseriesDefinition timeseriesDefinition) {

            this.timeseriesDefinition = timeseriesDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder toplistDefinition(@Nullable DashboardWidgetToplistDefinition toplistDefinition) {

            this.toplistDefinition = toplistDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder topologyMapDefinition(@Nullable DashboardWidgetTopologyMapDefinition topologyMapDefinition) {

            this.topologyMapDefinition = topologyMapDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder traceServiceDefinition(@Nullable DashboardWidgetTraceServiceDefinition traceServiceDefinition) {

            this.traceServiceDefinition = traceServiceDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder treemapDefinition(@Nullable DashboardWidgetTreemapDefinition treemapDefinition) {

            this.treemapDefinition = treemapDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder widgetLayout(@Nullable DashboardWidgetWidgetLayout widgetLayout) {

            this.widgetLayout = widgetLayout;
            return this;
        }
        public DashboardWidget build() {
            final var _resultValue = new DashboardWidget();
            _resultValue.alertGraphDefinition = alertGraphDefinition;
            _resultValue.alertValueDefinition = alertValueDefinition;
            _resultValue.changeDefinition = changeDefinition;
            _resultValue.checkStatusDefinition = checkStatusDefinition;
            _resultValue.distributionDefinition = distributionDefinition;
            _resultValue.eventStreamDefinition = eventStreamDefinition;
            _resultValue.eventTimelineDefinition = eventTimelineDefinition;
            _resultValue.freeTextDefinition = freeTextDefinition;
            _resultValue.geomapDefinition = geomapDefinition;
            _resultValue.groupDefinition = groupDefinition;
            _resultValue.heatmapDefinition = heatmapDefinition;
            _resultValue.hostmapDefinition = hostmapDefinition;
            _resultValue.id = id;
            _resultValue.iframeDefinition = iframeDefinition;
            _resultValue.imageDefinition = imageDefinition;
            _resultValue.listStreamDefinition = listStreamDefinition;
            _resultValue.logStreamDefinition = logStreamDefinition;
            _resultValue.manageStatusDefinition = manageStatusDefinition;
            _resultValue.noteDefinition = noteDefinition;
            _resultValue.powerpackDefinition = powerpackDefinition;
            _resultValue.queryTableDefinition = queryTableDefinition;
            _resultValue.queryValueDefinition = queryValueDefinition;
            _resultValue.runWorkflowDefinition = runWorkflowDefinition;
            _resultValue.scatterplotDefinition = scatterplotDefinition;
            _resultValue.serviceLevelObjectiveDefinition = serviceLevelObjectiveDefinition;
            _resultValue.servicemapDefinition = servicemapDefinition;
            _resultValue.sloListDefinition = sloListDefinition;
            _resultValue.splitGraphDefinition = splitGraphDefinition;
            _resultValue.sunburstDefinition = sunburstDefinition;
            _resultValue.timeseriesDefinition = timeseriesDefinition;
            _resultValue.toplistDefinition = toplistDefinition;
            _resultValue.topologyMapDefinition = topologyMapDefinition;
            _resultValue.traceServiceDefinition = traceServiceDefinition;
            _resultValue.treemapDefinition = treemapDefinition;
            _resultValue.widgetLayout = widgetLayout;
            return _resultValue;
        }
    }
}
