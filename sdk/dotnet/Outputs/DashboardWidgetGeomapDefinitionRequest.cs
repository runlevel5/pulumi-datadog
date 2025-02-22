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
    public sealed class DashboardWidgetGeomapDefinitionRequest
    {
        public readonly ImmutableArray<Outputs.DashboardWidgetGeomapDefinitionRequestFormula> Formulas;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetGeomapDefinitionRequestLogQuery? LogQuery;
        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        public readonly string? Q;
        public readonly ImmutableArray<Outputs.DashboardWidgetGeomapDefinitionRequestQuery> Queries;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetGeomapDefinitionRequestRumQuery? RumQuery;

        [OutputConstructor]
        private DashboardWidgetGeomapDefinitionRequest(
            ImmutableArray<Outputs.DashboardWidgetGeomapDefinitionRequestFormula> formulas,

            Outputs.DashboardWidgetGeomapDefinitionRequestLogQuery? logQuery,

            string? q,

            ImmutableArray<Outputs.DashboardWidgetGeomapDefinitionRequestQuery> queries,

            Outputs.DashboardWidgetGeomapDefinitionRequestRumQuery? rumQuery)
        {
            Formulas = formulas;
            LogQuery = logQuery;
            Q = q;
            Queries = queries;
            RumQuery = rumQuery;
        }
    }
}
