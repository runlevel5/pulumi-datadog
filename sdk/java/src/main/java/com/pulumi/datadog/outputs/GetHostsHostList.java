// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.GetHostsHostListMeta;
import com.pulumi.datadog.outputs.GetHostsHostListMetrics;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetHostsHostList {
    private List<String> aliases;
    private List<String> apps;
    private String awsName;
    private String hostName;
    private Integer id;
    private Boolean isMuted;
    private Integer lastReportedTime;
    private GetHostsHostListMeta meta;
    private GetHostsHostListMetrics metrics;
    private Integer muteTimeout;
    private String name;
    private List<String> sources;
    private Boolean up;

    private GetHostsHostList() {}
    public List<String> aliases() {
        return this.aliases;
    }
    public List<String> apps() {
        return this.apps;
    }
    public String awsName() {
        return this.awsName;
    }
    public String hostName() {
        return this.hostName;
    }
    public Integer id() {
        return this.id;
    }
    public Boolean isMuted() {
        return this.isMuted;
    }
    public Integer lastReportedTime() {
        return this.lastReportedTime;
    }
    public GetHostsHostListMeta meta() {
        return this.meta;
    }
    public GetHostsHostListMetrics metrics() {
        return this.metrics;
    }
    public Integer muteTimeout() {
        return this.muteTimeout;
    }
    public String name() {
        return this.name;
    }
    public List<String> sources() {
        return this.sources;
    }
    public Boolean up() {
        return this.up;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostsHostList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> aliases;
        private List<String> apps;
        private String awsName;
        private String hostName;
        private Integer id;
        private Boolean isMuted;
        private Integer lastReportedTime;
        private GetHostsHostListMeta meta;
        private GetHostsHostListMetrics metrics;
        private Integer muteTimeout;
        private String name;
        private List<String> sources;
        private Boolean up;
        public Builder() {}
        public Builder(GetHostsHostList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.apps = defaults.apps;
    	      this.awsName = defaults.awsName;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.isMuted = defaults.isMuted;
    	      this.lastReportedTime = defaults.lastReportedTime;
    	      this.meta = defaults.meta;
    	      this.metrics = defaults.metrics;
    	      this.muteTimeout = defaults.muteTimeout;
    	      this.name = defaults.name;
    	      this.sources = defaults.sources;
    	      this.up = defaults.up;
        }

        @CustomType.Setter
        public Builder aliases(List<String> aliases) {
            if (aliases == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "aliases");
            }
            this.aliases = aliases;
            return this;
        }
        public Builder aliases(String... aliases) {
            return aliases(List.of(aliases));
        }
        @CustomType.Setter
        public Builder apps(List<String> apps) {
            if (apps == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "apps");
            }
            this.apps = apps;
            return this;
        }
        public Builder apps(String... apps) {
            return apps(List.of(apps));
        }
        @CustomType.Setter
        public Builder awsName(String awsName) {
            if (awsName == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "awsName");
            }
            this.awsName = awsName;
            return this;
        }
        @CustomType.Setter
        public Builder hostName(String hostName) {
            if (hostName == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "hostName");
            }
            this.hostName = hostName;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isMuted(Boolean isMuted) {
            if (isMuted == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "isMuted");
            }
            this.isMuted = isMuted;
            return this;
        }
        @CustomType.Setter
        public Builder lastReportedTime(Integer lastReportedTime) {
            if (lastReportedTime == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "lastReportedTime");
            }
            this.lastReportedTime = lastReportedTime;
            return this;
        }
        @CustomType.Setter
        public Builder meta(GetHostsHostListMeta meta) {
            if (meta == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "meta");
            }
            this.meta = meta;
            return this;
        }
        @CustomType.Setter
        public Builder metrics(GetHostsHostListMetrics metrics) {
            if (metrics == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "metrics");
            }
            this.metrics = metrics;
            return this;
        }
        @CustomType.Setter
        public Builder muteTimeout(Integer muteTimeout) {
            if (muteTimeout == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "muteTimeout");
            }
            this.muteTimeout = muteTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sources(List<String> sources) {
            if (sources == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "sources");
            }
            this.sources = sources;
            return this;
        }
        public Builder sources(String... sources) {
            return sources(List.of(sources));
        }
        @CustomType.Setter
        public Builder up(Boolean up) {
            if (up == null) {
              throw new MissingRequiredPropertyException("GetHostsHostList", "up");
            }
            this.up = up;
            return this;
        }
        public GetHostsHostList build() {
            final var _resultValue = new GetHostsHostList();
            _resultValue.aliases = aliases;
            _resultValue.apps = apps;
            _resultValue.awsName = awsName;
            _resultValue.hostName = hostName;
            _resultValue.id = id;
            _resultValue.isMuted = isMuted;
            _resultValue.lastReportedTime = lastReportedTime;
            _resultValue.meta = meta;
            _resultValue.metrics = metrics;
            _resultValue.muteTimeout = muteTimeout;
            _resultValue.name = name;
            _resultValue.sources = sources;
            _resultValue.up = up;
            return _resultValue;
        }
    }
}
