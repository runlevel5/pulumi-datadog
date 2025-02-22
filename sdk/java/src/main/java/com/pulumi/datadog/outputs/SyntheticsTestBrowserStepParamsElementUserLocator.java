// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.SyntheticsTestBrowserStepParamsElementUserLocatorValue;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticsTestBrowserStepParamsElementUserLocator {
    /**
     * @return Defaults to `false`.
     * 
     */
    private @Nullable Boolean failTestOnCannotLocate;
    private SyntheticsTestBrowserStepParamsElementUserLocatorValue value;

    private SyntheticsTestBrowserStepParamsElementUserLocator() {}
    /**
     * @return Defaults to `false`.
     * 
     */
    public Optional<Boolean> failTestOnCannotLocate() {
        return Optional.ofNullable(this.failTestOnCannotLocate);
    }
    public SyntheticsTestBrowserStepParamsElementUserLocatorValue value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticsTestBrowserStepParamsElementUserLocator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean failTestOnCannotLocate;
        private SyntheticsTestBrowserStepParamsElementUserLocatorValue value;
        public Builder() {}
        public Builder(SyntheticsTestBrowserStepParamsElementUserLocator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failTestOnCannotLocate = defaults.failTestOnCannotLocate;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder failTestOnCannotLocate(@Nullable Boolean failTestOnCannotLocate) {

            this.failTestOnCannotLocate = failTestOnCannotLocate;
            return this;
        }
        @CustomType.Setter
        public Builder value(SyntheticsTestBrowserStepParamsElementUserLocatorValue value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestBrowserStepParamsElementUserLocator", "value");
            }
            this.value = value;
            return this;
        }
        public SyntheticsTestBrowserStepParamsElementUserLocator build() {
            final var _resultValue = new SyntheticsTestBrowserStepParamsElementUserLocator();
            _resultValue.failTestOnCannotLocate = failTestOnCannotLocate;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
