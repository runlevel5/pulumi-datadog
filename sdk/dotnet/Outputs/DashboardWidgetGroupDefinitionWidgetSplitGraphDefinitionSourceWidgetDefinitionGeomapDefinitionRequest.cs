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
    public sealed class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequest
    {
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormula> Formulas;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestLogQuery? LogQuery;
        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        public readonly string? Q;
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQuery> Queries;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestRumQuery? RumQuery;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequest(
            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormula> formulas,

            Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestLogQuery? logQuery,

            string? q,

            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQuery> queries,

            Outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestRumQuery? rumQuery)
        {
            Formulas = formulas;
            LogQuery = logQuery;
            Q = q;
            Queries = queries;
            RumQuery = rumQuery;
        }
    }
}
