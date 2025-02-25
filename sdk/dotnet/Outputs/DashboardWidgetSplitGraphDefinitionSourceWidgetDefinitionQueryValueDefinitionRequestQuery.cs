// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQuery
    {
        /// <summary>
        /// The APM Dependency Stats query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryApmDependencyStatsQuery? ApmDependencyStatsQuery;
        /// <summary>
        /// The APM Resource Stats query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryApmResourceStatsQuery? ApmResourceStatsQuery;
        /// <summary>
        /// The Cloud Cost query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryCloudCostQuery? CloudCostQuery;
        /// <summary>
        /// A timeseries formula and functions events query.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryEventQuery? EventQuery;
        /// <summary>
        /// A timeseries formula and functions metrics query.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryMetricQuery? MetricQuery;
        /// <summary>
        /// The process query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryProcessQuery? ProcessQuery;
        /// <summary>
        /// The SLO query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQuerySloQuery? SloQuery;

        [OutputConstructor]
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQuery(
            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryApmDependencyStatsQuery? apmDependencyStatsQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryApmResourceStatsQuery? apmResourceStatsQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryCloudCostQuery? cloudCostQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryEventQuery? eventQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryMetricQuery? metricQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQueryProcessQuery? processQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryValueDefinitionRequestQuerySloQuery? sloQuery)
        {
            ApmDependencyStatsQuery = apmDependencyStatsQuery;
            ApmResourceStatsQuery = apmResourceStatsQuery;
            CloudCostQuery = cloudCostQuery;
            EventQuery = eventQuery;
            MetricQuery = metricQuery;
            ProcessQuery = processQuery;
            SloQuery = sloQuery;
        }
    }
}
