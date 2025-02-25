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
    public sealed class DashboardWidgetScatterplotDefinitionRequestY
    {
        /// <summary>
        /// Aggregator used for the request. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
        /// </summary>
        public readonly string? Aggregator;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetScatterplotDefinitionRequestYApmQuery? ApmQuery;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetScatterplotDefinitionRequestYLogQuery? LogQuery;
        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        public readonly Outputs.DashboardWidgetScatterplotDefinitionRequestYProcessQuery? ProcessQuery;
        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        public readonly string? Q;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetScatterplotDefinitionRequestYRumQuery? RumQuery;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetScatterplotDefinitionRequestYSecurityQuery? SecurityQuery;

        [OutputConstructor]
        private DashboardWidgetScatterplotDefinitionRequestY(
            string? aggregator,

            Outputs.DashboardWidgetScatterplotDefinitionRequestYApmQuery? apmQuery,

            Outputs.DashboardWidgetScatterplotDefinitionRequestYLogQuery? logQuery,

            Outputs.DashboardWidgetScatterplotDefinitionRequestYProcessQuery? processQuery,

            string? q,

            Outputs.DashboardWidgetScatterplotDefinitionRequestYRumQuery? rumQuery,

            Outputs.DashboardWidgetScatterplotDefinitionRequestYSecurityQuery? securityQuery)
        {
            Aggregator = aggregator;
            ApmQuery = apmQuery;
            LogQuery = logQuery;
            ProcessQuery = processQuery;
            Q = q;
            RumQuery = rumQuery;
            SecurityQuery = securityQuery;
        }
    }
}
