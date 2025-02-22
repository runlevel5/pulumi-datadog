// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The APM Dependency Stats query using formulas and functions.
        /// </summary>
        [Input("apmDependencyStatsQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmDependencyStatsQueryGetArgs>? ApmDependencyStatsQuery { get; set; }

        /// <summary>
        /// The APM Resource Stats query using formulas and functions.
        /// </summary>
        [Input("apmResourceStatsQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmResourceStatsQueryGetArgs>? ApmResourceStatsQuery { get; set; }

        /// <summary>
        /// The Cloud Cost query using formulas and functions.
        /// </summary>
        [Input("cloudCostQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryCloudCostQueryGetArgs>? CloudCostQuery { get; set; }

        /// <summary>
        /// A timeseries formula and functions events query.
        /// </summary>
        [Input("eventQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryEventQueryGetArgs>? EventQuery { get; set; }

        /// <summary>
        /// A timeseries formula and functions metrics query.
        /// </summary>
        [Input("metricQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryMetricQueryGetArgs>? MetricQuery { get; set; }

        /// <summary>
        /// The process query using formulas and functions.
        /// </summary>
        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryProcessQueryGetArgs>? ProcessQuery { get; set; }

        /// <summary>
        /// The SLO query using formulas and functions.
        /// </summary>
        [Input("sloQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQuerySloQueryGetArgs>? SloQuery { get; set; }

        public DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryGetArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryGetArgs Empty => new DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryGetArgs();
    }
}
