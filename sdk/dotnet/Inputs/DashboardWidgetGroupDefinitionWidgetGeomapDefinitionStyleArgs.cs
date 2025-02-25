// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The color palette to apply to the widget.
        /// </summary>
        [Input("palette", required: true)]
        public Input<string> Palette { get; set; } = null!;

        /// <summary>
        /// A Boolean indicating whether to flip the palette tones.
        /// </summary>
        [Input("paletteFlip", required: true)]
        public Input<bool> PaletteFlip { get; set; } = null!;

        public DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs Empty => new DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs();
    }
}
