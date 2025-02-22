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
    public sealed class DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQuery
    {
        /// <summary>
        /// The APM Dependency Stats query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryApmDependencyStatsQuery? ApmDependencyStatsQuery;
        /// <summary>
        /// The APM Resource Stats query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryApmResourceStatsQuery? ApmResourceStatsQuery;
        /// <summary>
        /// The Cloud Cost query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryCloudCostQuery? CloudCostQuery;
        /// <summary>
        /// A timeseries formula and functions events query.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuery? EventQuery;
        /// <summary>
        /// A timeseries formula and functions metrics query.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryMetricQuery? MetricQuery;
        /// <summary>
        /// The process query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryProcessQuery? ProcessQuery;
        /// <summary>
        /// The SLO query using formulas and functions.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQuerySloQuery? SloQuery;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQuery(
            Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryApmDependencyStatsQuery? apmDependencyStatsQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryApmResourceStatsQuery? apmResourceStatsQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryCloudCostQuery? cloudCostQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQuery? eventQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryMetricQuery? metricQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryProcessQuery? processQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQuerySloQuery? sloQuery)
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
