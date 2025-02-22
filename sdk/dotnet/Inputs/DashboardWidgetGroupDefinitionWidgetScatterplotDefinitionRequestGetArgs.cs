// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("scatterplotTables")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableGetArgs>? _scatterplotTables;

        /// <summary>
        /// Scatterplot request containing formulas and functions.
        /// </summary>
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableGetArgs> ScatterplotTables
        {
            get => _scatterplotTables ?? (_scatterplotTables = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableGetArgs>());
            set => _scatterplotTables = value;
        }

        [Input("xes")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestXGetArgs>? _xes;

        /// <summary>
        /// The query used for the X-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
        /// </summary>
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestXGetArgs> Xes
        {
            get => _xes ?? (_xes = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestXGetArgs>());
            set => _xes = value;
        }

        [Input("ys")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYGetArgs>? _ys;

        /// <summary>
        /// The query used for the Y-Axis. Exactly one nested block is allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query`, `apm_stats_query` or `process_query` is required within the block).
        /// </summary>
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYGetArgs> Ys
        {
            get => _ys ?? (_ys = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestYGetArgs>());
            set => _ys = value;
        }

        public DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestGetArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestGetArgs Empty => new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestGetArgs();
    }
}
