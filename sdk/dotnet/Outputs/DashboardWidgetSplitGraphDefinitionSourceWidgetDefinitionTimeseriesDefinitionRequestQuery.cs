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
    public sealed class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQuery
    {
        /// <summary>
        /// The APM Dependency Stats query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryApmDependencyStatsQuery? ApmDependencyStatsQuery;
        /// <summary>
        /// The APM Resource Stats query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryApmResourceStatsQuery? ApmResourceStatsQuery;
        /// <summary>
        /// The Cloud Cost query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryCloudCostQuery? CloudCostQuery;
        /// <summary>
        /// A timeseries formula and functions events query.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuery? EventQuery;
        /// <summary>
        /// A timeseries formula and functions metrics query.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryMetricQuery? MetricQuery;
        /// <summary>
        /// The process query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryProcessQuery? ProcessQuery;
        /// <summary>
        /// The SLO query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQuerySloQuery? SloQuery;

        [OutputConstructor]
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQuery(
            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryApmDependencyStatsQuery? apmDependencyStatsQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryApmResourceStatsQuery? apmResourceStatsQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryCloudCostQuery? cloudCostQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryEventQuery? eventQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryMetricQuery? metricQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQueryProcessQuery? processQuery,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestQuerySloQuery? sloQuery)
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
