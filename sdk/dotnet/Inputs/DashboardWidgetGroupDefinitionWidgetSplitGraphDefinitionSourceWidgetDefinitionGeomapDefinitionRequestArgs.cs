// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs : global::Pulumi.ResourceArgs
    {
        [Input("formulas")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaArgs>? _formulas;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaArgs>());
            set => _formulas = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("logQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestLogQueryArgs>? LogQuery { get; set; }

        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        [Input("q")]
        public Input<string>? Q { get; set; }

        [Input("queries")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs>? _queries;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs>());
            set => _queries = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("rumQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestRumQueryArgs>? RumQuery { get; set; }

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs Empty => new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestArgs();
    }
}
