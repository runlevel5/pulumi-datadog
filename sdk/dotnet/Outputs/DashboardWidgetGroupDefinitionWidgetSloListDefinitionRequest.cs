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
    public sealed class DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequest
    {
        /// <summary>
        /// Updated SLO List widget.
        /// </summary>
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQuery Query;
        /// <summary>
        /// The request type for the SLO List request. Valid values are `slo_list`.
        /// </summary>
        public readonly string RequestType;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequest(
            Outputs.DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQuery query,

            string requestType)
        {
            Query = query;
            RequestType = requestType;
        }
    }
}
