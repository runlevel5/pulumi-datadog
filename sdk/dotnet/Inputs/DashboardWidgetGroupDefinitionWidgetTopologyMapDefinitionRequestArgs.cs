// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestArgs : global::Pulumi.ResourceArgs
    {
        [Input("queries", required: true)]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestQueryArgs>? _queries;

        /// <summary>
        /// The query for a Topology request.
        /// </summary>
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestQueryArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestQueryArgs>());
            set => _queries = value;
        }

        /// <summary>
        /// The request type for the Topology request ('topology'). Valid values are `topology`.
        /// </summary>
        [Input("requestType", required: true)]
        public Input<string> RequestType { get; set; } = null!;

        public DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestArgs Empty => new DashboardWidgetGroupDefinitionWidgetTopologyMapDefinitionRequestArgs();
    }
}
