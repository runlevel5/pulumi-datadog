// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The definition for a Alert Graph widget.
        /// </summary>
        [Input("alertGraphDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetAlertGraphDefinitionArgs>? AlertGraphDefinition { get; set; }

        /// <summary>
        /// The definition for a Alert Value widget.
        /// </summary>
        [Input("alertValueDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetAlertValueDefinitionArgs>? AlertValueDefinition { get; set; }

        /// <summary>
        /// The definition for a Change widget.
        /// </summary>
        [Input("changeDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionArgs>? ChangeDefinition { get; set; }

        /// <summary>
        /// The definition for a Check Status widget.
        /// </summary>
        [Input("checkStatusDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetCheckStatusDefinitionArgs>? CheckStatusDefinition { get; set; }

        /// <summary>
        /// The definition for a Distribution widget.
        /// </summary>
        [Input("distributionDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetDistributionDefinitionArgs>? DistributionDefinition { get; set; }

        /// <summary>
        /// The definition for a Event Stream widget.
        /// </summary>
        [Input("eventStreamDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetEventStreamDefinitionArgs>? EventStreamDefinition { get; set; }

        /// <summary>
        /// The definition for a Event Timeline widget.
        /// </summary>
        [Input("eventTimelineDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetEventTimelineDefinitionArgs>? EventTimelineDefinition { get; set; }

        /// <summary>
        /// The definition for a Free Text widget.
        /// </summary>
        [Input("freeTextDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetFreeTextDefinitionArgs>? FreeTextDefinition { get; set; }

        /// <summary>
        /// The definition for a Geomap widget.
        /// </summary>
        [Input("geomapDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetGeomapDefinitionArgs>? GeomapDefinition { get; set; }

        /// <summary>
        /// The definition for a Heatmap widget.
        /// </summary>
        [Input("heatmapDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs>? HeatmapDefinition { get; set; }

        /// <summary>
        /// The definition for a Hostmap widget.
        /// </summary>
        [Input("hostmapDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionArgs>? HostmapDefinition { get; set; }

        /// <summary>
        /// The ID of the widget.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// The definition for an Iframe widget.
        /// </summary>
        [Input("iframeDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetIframeDefinitionArgs>? IframeDefinition { get; set; }

        /// <summary>
        /// The definition for an Image widget
        /// </summary>
        [Input("imageDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetImageDefinitionArgs>? ImageDefinition { get; set; }

        /// <summary>
        /// The definition for a List Stream widget.
        /// </summary>
        [Input("listStreamDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetListStreamDefinitionArgs>? ListStreamDefinition { get; set; }

        /// <summary>
        /// The definition for an Log Stream widget.
        /// </summary>
        [Input("logStreamDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetLogStreamDefinitionArgs>? LogStreamDefinition { get; set; }

        /// <summary>
        /// The definition for an Manage Status widget.
        /// </summary>
        [Input("manageStatusDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetManageStatusDefinitionArgs>? ManageStatusDefinition { get; set; }

        /// <summary>
        /// The definition for a Note widget.
        /// </summary>
        [Input("noteDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetNoteDefinitionArgs>? NoteDefinition { get; set; }

        /// <summary>
        /// The definition for a Powerpack widget.
        /// </summary>
        [Input("powerpackDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetPowerpackDefinitionArgs>? PowerpackDefinition { get; set; }

        /// <summary>
        /// The definition for a Query Table widget.
        /// </summary>
        [Input("queryTableDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionArgs>? QueryTableDefinition { get; set; }

        /// <summary>
        /// The definition for a Query Value widget.
        /// </summary>
        [Input("queryValueDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinitionArgs>? QueryValueDefinition { get; set; }

        /// <summary>
        /// The definition for a Run Workflow widget.
        /// </summary>
        [Input("runWorkflowDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetRunWorkflowDefinitionArgs>? RunWorkflowDefinition { get; set; }

        /// <summary>
        /// The definition for a Scatterplot widget.
        /// </summary>
        [Input("scatterplotDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionArgs>? ScatterplotDefinition { get; set; }

        /// <summary>
        /// The definition for a Service Level Objective widget.
        /// </summary>
        [Input("serviceLevelObjectiveDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetServiceLevelObjectiveDefinitionArgs>? ServiceLevelObjectiveDefinition { get; set; }

        /// <summary>
        /// The definition for a Service Map widget.
        /// </summary>
        [Input("servicemapDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetServicemapDefinitionArgs>? ServicemapDefinition { get; set; }

        /// <summary>
        /// The definition for an SLO (Service Level Objective) List widget.
        /// </summary>
        [Input("sloListDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSloListDefinitionArgs>? SloListDefinition { get; set; }

        /// <summary>
        /// The definition for a Split Graph widget.
        /// </summary>
        [Input("splitGraphDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionArgs>? SplitGraphDefinition { get; set; }

        /// <summary>
        /// The definition for a Sunburst widget.
        /// </summary>
        [Input("sunburstDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionArgs>? SunburstDefinition { get; set; }

        /// <summary>
        /// The definition for a Timeseries widget.
        /// </summary>
        [Input("timeseriesDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionArgs>? TimeseriesDefinition { get; set; }

        /// <summary>
        /// The definition for a Toplist widget.
        /// </summary>
        [Input("toplistDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionArgs>? ToplistDefinition { get; set; }

        /// <summary>
        /// The definition for a Topology Map widget.
        /// </summary>
        [Input("topologyMapDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionArgs>? TopologyMapDefinition { get; set; }

        /// <summary>
        /// The definition for a Trace Service widget.
        /// </summary>
        [Input("traceServiceDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTraceServiceDefinitionArgs>? TraceServiceDefinition { get; set; }

        /// <summary>
        /// The definition for a Treemap widget.
        /// </summary>
        [Input("treemapDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTreemapDefinitionArgs>? TreemapDefinition { get; set; }

        /// <summary>
        /// The layout of the widget on a 'free' dashboard.
        /// </summary>
        [Input("widgetLayout")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetWidgetLayoutArgs>? WidgetLayout { get; set; }

        public DashboardWidgetGroupDefinitionWidgetArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetArgs Empty => new DashboardWidgetGroupDefinitionWidgetArgs();
    }
}
