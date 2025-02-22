// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The definition for a Change widget.
        /// </summary>
        [Input("changeDefinition")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionGetArgs>? ChangeDefinition { get; set; }

        /// <summary>
        /// The definition for a Geomap widget.
        /// </summary>
        [Input("geomapDefinition")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionGetArgs>? GeomapDefinition { get; set; }

        /// <summary>
        /// The definition for a Query Table widget.
        /// </summary>
        [Input("queryTableDefinition")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionGetArgs>? QueryTableDefinition { get; set; }

        /// <summary>
        /// The definition for a Query Value widget.
        /// </summary>
        [Input("queryValueDefinition")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionGetArgs>? QueryValueDefinition { get; set; }

        /// <summary>
        /// The definition for a Scatterplot widget.
        /// </summary>
        [Input("scatterplotDefinition")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionGetArgs>? ScatterplotDefinition { get; set; }

        /// <summary>
        /// The definition for a Sunburst widget.
        /// </summary>
        [Input("sunburstDefinition")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionGetArgs>? SunburstDefinition { get; set; }

        /// <summary>
        /// The definition for a Timeseries widget.
        /// </summary>
        [Input("timeseriesDefinition")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionGetArgs>? TimeseriesDefinition { get; set; }

        /// <summary>
        /// The definition for a Toplist widget.
        /// </summary>
        [Input("toplistDefinition")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionGetArgs>? ToplistDefinition { get; set; }

        /// <summary>
        /// The definition for a Treemap widget.
        /// </summary>
        [Input("treemapDefinition")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionGetArgs>? TreemapDefinition { get; set; }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGetArgs()
        {
        }
        public static new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGetArgs Empty => new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGetArgs();
    }
}
