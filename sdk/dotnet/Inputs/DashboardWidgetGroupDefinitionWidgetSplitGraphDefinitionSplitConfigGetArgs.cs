// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum number of graphs to display in the widget.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// Controls the order in which graphs appear in the split.
        /// </summary>
        [Input("sort", required: true)]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSortGetArgs> Sort { get; set; } = null!;

        /// <summary>
        /// The property by which the graph splits
        /// </summary>
        [Input("splitDimensions", required: true)]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSplitDimensionsGetArgs> SplitDimensions { get; set; } = null!;

        [Input("staticSplits")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplitGetArgs>? _staticSplits;

        /// <summary>
        /// The property by which the graph splits
        /// </summary>
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplitGetArgs> StaticSplits
        {
            get => _staticSplits ?? (_staticSplits = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplitGetArgs>());
            set => _staticSplits = value;
        }

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigGetArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigGetArgs Empty => new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigGetArgs();
    }
}
