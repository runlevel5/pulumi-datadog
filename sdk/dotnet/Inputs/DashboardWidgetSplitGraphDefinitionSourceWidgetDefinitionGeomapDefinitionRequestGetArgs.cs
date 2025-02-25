// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("formulas")]
        private InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaGetArgs>? _formulas;
        public InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaGetArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestFormulaGetArgs>());
            set => _formulas = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("logQuery")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestLogQueryGetArgs>? LogQuery { get; set; }

        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        [Input("q")]
        public Input<string>? Q { get; set; }

        [Input("queries")]
        private InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryGetArgs>? _queries;
        public InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryGetArgs>());
            set => _queries = value;
        }

        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        [Input("rumQuery")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestRumQueryGetArgs>? RumQuery { get; set; }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestGetArgs()
        {
        }
        public static new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestGetArgs Empty => new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestGetArgs();
    }
}
