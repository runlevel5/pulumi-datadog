// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The definition for a Change widget.
        /// </summary>
        [Input("changeDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionChangeDefinitionGetArgs>? ChangeDefinition { get; set; }

        /// <summary>
        /// The definition for a Geomap widget.
        /// </summary>
        [Input("geomapDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionGetArgs>? GeomapDefinition { get; set; }

        /// <summary>
        /// The definition for a Query Table widget.
        /// </summary>
        [Input("queryTableDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionGetArgs>? QueryTableDefinition { get; set; }

        /// <summary>
        /// The definition for a Query Value widget.
        /// </summary>
        [Input("queryValueDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionGetArgs>? QueryValueDefinition { get; set; }

        /// <summary>
        /// The definition for a Scatterplot widget.
        /// </summary>
        [Input("scatterplotDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionGetArgs>? ScatterplotDefinition { get; set; }

        /// <summary>
        /// The definition for a Sunburst widget.
        /// </summary>
        [Input("sunburstDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionSunburstDefinitionGetArgs>? SunburstDefinition { get; set; }

        /// <summary>
        /// The definition for a Timeseries widget.
        /// </summary>
        [Input("timeseriesDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionGetArgs>? TimeseriesDefinition { get; set; }

        /// <summary>
        /// The definition for a Toplist widget.
        /// </summary>
        [Input("toplistDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionGetArgs>? ToplistDefinition { get; set; }

        /// <summary>
        /// The definition for a Treemap widget.
        /// </summary>
        [Input("treemapDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionGetArgs>? TreemapDefinition { get; set; }

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGetArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGetArgs Empty => new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGetArgs();
    }
}
