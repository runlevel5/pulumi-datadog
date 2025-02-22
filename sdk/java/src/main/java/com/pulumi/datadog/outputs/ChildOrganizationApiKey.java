// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChildOrganizationApiKey {
    /**
     * @return API key.
     * 
     */
    private @Nullable String key;
    /**
     * @return Name of your API key.
     * 
     */
    private @Nullable String name;

    private ChildOrganizationApiKey() {}
    /**
     * @return API key.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Name of your API key.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChildOrganizationApiKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String name;
        public Builder() {}
        public Builder(ChildOrganizationApiKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public ChildOrganizationApiKey build() {
            final var _resultValue = new ChildOrganizationApiKey();
            _resultValue.key = key;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
