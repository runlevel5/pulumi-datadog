// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("columns", required: true)]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestColumnGetArgs>? _columns;

        /// <summary>
        /// Widget columns.
        /// </summary>
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestColumnGetArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestColumnGetArgs>());
            set => _columns = value;
        }

        /// <summary>
        /// Updated list stream widget.
        /// </summary>
        [Input("query", required: true)]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestQueryGetArgs> Query { get; set; } = null!;

        /// <summary>
        /// Widget response format. Valid values are `event_list`.
        /// </summary>
        [Input("responseFormat", required: true)]
        public Input<string> ResponseFormat { get; set; } = null!;

        public DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestGetArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestGetArgs Empty => new DashboardWidgetGroupDefinitionWidgetListStreamDefinitionRequestGetArgs();
    }
}
