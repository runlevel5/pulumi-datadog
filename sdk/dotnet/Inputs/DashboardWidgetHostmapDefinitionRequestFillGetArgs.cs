// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetHostmapDefinitionRequestFillGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("apmQuery")]
        public Input<Inputs.DashboardWidgetHostmapDefinitionRequestFillApmQueryGetArgs>? ApmQuery { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("logQuery")]
        public Input<Inputs.DashboardWidgetHostmapDefinitionRequestFillLogQueryGetArgs>? LogQuery { get; set; }

        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetHostmapDefinitionRequestFillProcessQueryGetArgs>? ProcessQuery { get; set; }

        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        [Input("q")]
        public Input<string>? Q { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("rumQuery")]
        public Input<Inputs.DashboardWidgetHostmapDefinitionRequestFillRumQueryGetArgs>? RumQuery { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("securityQuery")]
        public Input<Inputs.DashboardWidgetHostmapDefinitionRequestFillSecurityQueryGetArgs>? SecurityQuery { get; set; }

        public DashboardWidgetHostmapDefinitionRequestFillGetArgs()
        {
        }
        public static new DashboardWidgetHostmapDefinitionRequestFillGetArgs Empty => new DashboardWidgetHostmapDefinitionRequestFillGetArgs();
    }
}
