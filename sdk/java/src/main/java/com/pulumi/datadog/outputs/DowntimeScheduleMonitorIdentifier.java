// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DowntimeScheduleMonitorIdentifier {
    /**
     * @return ID of the monitor to prevent notifications.
     * 
     */
    private @Nullable Integer monitorId;
    /**
     * @return A list of monitor tags. For example, tags that are applied directly to monitors, not tags that are used in monitor queries (which are filtered by the scope parameter), to which the downtime applies. The resulting downtime applies to monitors that match **all** provided monitor tags. Setting `monitor_tags` to `[*]` configures the downtime to mute all monitors for the given scope.
     * 
     */
    private @Nullable List<String> monitorTags;

    private DowntimeScheduleMonitorIdentifier() {}
    /**
     * @return ID of the monitor to prevent notifications.
     * 
     */
    public Optional<Integer> monitorId() {
        return Optional.ofNullable(this.monitorId);
    }
    /**
     * @return A list of monitor tags. For example, tags that are applied directly to monitors, not tags that are used in monitor queries (which are filtered by the scope parameter), to which the downtime applies. The resulting downtime applies to monitors that match **all** provided monitor tags. Setting `monitor_tags` to `[*]` configures the downtime to mute all monitors for the given scope.
     * 
     */
    public List<String> monitorTags() {
        return this.monitorTags == null ? List.of() : this.monitorTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DowntimeScheduleMonitorIdentifier defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer monitorId;
        private @Nullable List<String> monitorTags;
        public Builder() {}
        public Builder(DowntimeScheduleMonitorIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitorId = defaults.monitorId;
    	      this.monitorTags = defaults.monitorTags;
        }

        @CustomType.Setter
        public Builder monitorId(@Nullable Integer monitorId) {

            this.monitorId = monitorId;
            return this;
        }
        @CustomType.Setter
        public Builder monitorTags(@Nullable List<String> monitorTags) {

            this.monitorTags = monitorTags;
            return this;
        }
        public Builder monitorTags(String... monitorTags) {
            return monitorTags(List.of(monitorTags));
        }
        public DowntimeScheduleMonitorIdentifier build() {
            final var _resultValue = new DowntimeScheduleMonitorIdentifier();
            _resultValue.monitorId = monitorId;
            _resultValue.monitorTags = monitorTags;
            return _resultValue;
        }
    }
}
