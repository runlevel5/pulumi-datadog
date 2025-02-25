// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("apmQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestApmQueryGetArgs>? ApmQuery { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("auditQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestAuditQueryGetArgs>? AuditQuery { get; set; }

        /// <summary>
        /// How to display the marker lines. Valid values are `area`, `bars`, `line`, `overlay`.
        /// </summary>
        [Input("displayType")]
        public Input<string>? DisplayType { get; set; }

        [Input("formulas")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaGetArgs>? _formulas;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaGetArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaGetArgs>());
            set => _formulas = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("logQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestLogQueryGetArgs>? LogQuery { get; set; }

        [Input("metadatas")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestMetadataGetArgs>? _metadatas;

        /// <summary>
        /// Used to define expression aliases. Multiple `metadata` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestMetadataGetArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestMetadataGetArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("networkQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestNetworkQueryGetArgs>? NetworkQuery { get; set; }

        /// <summary>
        /// A Boolean indicating whether the request uses the right or left Y-Axis.
        /// </summary>
        [Input("onRightYaxis")]
        public Input<bool>? OnRightYaxis { get; set; }

        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestProcessQueryGetArgs>? ProcessQuery { get; set; }

        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        [Input("q")]
        public Input<string>? Q { get; set; }

        [Input("queries")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryGetArgs>? _queries;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryGetArgs>());
            set => _queries = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("rumQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestRumQueryGetArgs>? RumQuery { get; set; }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("securityQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestSecurityQueryGetArgs>? SecurityQuery { get; set; }

        /// <summary>
        /// The style of the widget graph. Exactly one `style` block is allowed using the structure below.
        /// </summary>
        [Input("style")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestStyleGetArgs>? Style { get; set; }

        public DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestGetArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestGetArgs Empty => new DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestGetArgs();
    }
}
