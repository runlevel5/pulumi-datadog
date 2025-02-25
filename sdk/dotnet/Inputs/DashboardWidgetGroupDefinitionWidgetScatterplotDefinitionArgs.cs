// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionArgs : global::Pulumi.ResourceArgs
    {
        [Input("colorByGroups")]
        private InputList<string>? _colorByGroups;

        /// <summary>
        /// List of groups used for colors.
        /// </summary>
        public InputList<string> ColorByGroups
        {
            get => _colorByGroups ?? (_colorByGroups = new InputList<string>());
            set => _colorByGroups = value;
        }

        [Input("customLinks")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionCustomLinkArgs>? _customLinks;

        /// <summary>
        /// A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
        /// </summary>
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionCustomLinkArgs> CustomLinks
        {
            get => _customLinks ?? (_customLinks = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionCustomLinkArgs>());
            set => _customLinks = value;
        }

        /// <summary>
        /// The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
        /// </summary>
        [Input("liveSpan")]
        public Input<string>? LiveSpan { get; set; }

        /// <summary>
        /// A nested block describing the request to use when displaying the widget. Exactly one `request` block is allowed using the structure below.
        /// </summary>
        [Input("request")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestArgs>? Request { get; set; }

        /// <summary>
        /// The title of the widget.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        /// <summary>
        /// The alignment of the widget's title. Valid values are `center`, `left`, `right`.
        /// </summary>
        [Input("titleAlign")]
        public Input<string>? TitleAlign { get; set; }

        /// <summary>
        /// The size of the widget's title (defaults to 16).
        /// </summary>
        [Input("titleSize")]
        public Input<string>? TitleSize { get; set; }

        /// <summary>
        /// A nested block describing the X-Axis Controls. Exactly one nested block is allowed using the structure below.
        /// </summary>
        [Input("xaxis")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionXaxisArgs>? Xaxis { get; set; }

        /// <summary>
        /// A nested block describing the Y-Axis Controls. Exactly one nested block is allowed using the structure below.
        /// </summary>
        [Input("yaxis")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionYaxisArgs>? Yaxis { get; set; }

        public DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionArgs Empty => new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionArgs();
    }
}
