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
    public sealed class GetLogsIndexesLogsIndexResult
    {
        /// <summary>
        /// The number of log events you can send in this index per day before you are rate-limited.
        /// </summary>
        public readonly int DailyLimit;
        /// <summary>
        /// Object containing options to override the default daily limit reset time.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLogsIndexesLogsIndexDailyLimitResetResult> DailyLimitResets;
        /// <summary>
        /// The percentage threshold of the daily quota at which a Datadog warning event is generated.
        /// </summary>
        public readonly double DailyLimitWarningThresholdPercentage;
        /// <summary>
        /// List of exclusion filters.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLogsIndexesLogsIndexExclusionFilterResult> ExclusionFilters;
        /// <summary>
        /// Logs filter
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLogsIndexesLogsIndexFilterResult> Filters;
        /// <summary>
        /// The name of the index.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The number of days before logs are deleted from this index.
        /// </summary>
        public readonly int RetentionDays;

        [OutputConstructor]
        private GetLogsIndexesLogsIndexResult(
            int dailyLimit,

            ImmutableArray<Outputs.GetLogsIndexesLogsIndexDailyLimitResetResult> dailyLimitResets,

            double dailyLimitWarningThresholdPercentage,

            ImmutableArray<Outputs.GetLogsIndexesLogsIndexExclusionFilterResult> exclusionFilters,

            ImmutableArray<Outputs.GetLogsIndexesLogsIndexFilterResult> filters,

            string name,

            int retentionDays)
        {
            DailyLimit = dailyLimit;
            DailyLimitResets = dailyLimitResets;
            DailyLimitWarningThresholdPercentage = dailyLimitWarningThresholdPercentage;
            ExclusionFilters = exclusionFilters;
            Filters = filters;
            Name = name;
            RetentionDays = retentionDays;
        }
    }
}
