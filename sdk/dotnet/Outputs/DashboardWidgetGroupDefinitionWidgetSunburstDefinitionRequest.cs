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
    public sealed class DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequest
    {
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestApmQuery? ApmQuery;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestAuditQuery? AuditQuery;
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestFormula> Formulas;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestLogQuery? LogQuery;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestNetworkQuery? NetworkQuery;
        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestProcessQuery? ProcessQuery;
        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        public readonly string? Q;
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQuery> Queries;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestRumQuery? RumQuery;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestSecurityQuery? SecurityQuery;
        /// <summary>
        /// Define style for the widget's request.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestStyle? Style;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequest(
            Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestApmQuery? apmQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestAuditQuery? auditQuery,

            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestFormula> formulas,

            Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestLogQuery? logQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestNetworkQuery? networkQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestProcessQuery? processQuery,

            string? q,

            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestQuery> queries,

            Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestRumQuery? rumQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestSecurityQuery? securityQuery,

            Outputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestStyle? style)
        {
            ApmQuery = apmQuery;
            AuditQuery = auditQuery;
            Formulas = formulas;
            LogQuery = logQuery;
            NetworkQuery = networkQuery;
            ProcessQuery = processQuery;
            Q = q;
            Queries = queries;
            RumQuery = rumQuery;
            SecurityQuery = securityQuery;
            Style = style;
        }
    }
}
