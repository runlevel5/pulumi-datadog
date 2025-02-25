// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SyntheticsTestOptionsListMonitorOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify a renotification frequency in minutes. Values available by default are `0`, `10`, `20`, `30`, `40`, `50`, `60`, `90`, `120`, `180`, `240`, `300`, `360`, `720`, `1440`. Defaults to `0`.
        /// </summary>
        [Input("renotifyInterval")]
        public Input<int>? RenotifyInterval { get; set; }

        public SyntheticsTestOptionsListMonitorOptionsArgs()
        {
        }
        public static new SyntheticsTestOptionsListMonitorOptionsArgs Empty => new SyntheticsTestOptionsListMonitorOptionsArgs();
    }
}
