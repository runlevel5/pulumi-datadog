// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ServiceObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceObjectArgs Empty = new ServiceObjectArgs();

    /**
     * Your Service name associated service key in PagerDuty. This key may also be referred to as an Integration Key or Routing Key in the Pagerduty Integration documentation to have it destroyed and recreated.
     * 
     */
    @Import(name="serviceKey", required=true)
    private Output<String> serviceKey;

    /**
     * @return Your Service name associated service key in PagerDuty. This key may also be referred to as an Integration Key or Routing Key in the Pagerduty Integration documentation to have it destroyed and recreated.
     * 
     */
    public Output<String> serviceKey() {
        return this.serviceKey;
    }

    /**
     * Your Service name in PagerDuty.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return Your Service name in PagerDuty.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ServiceObjectArgs() {}

    private ServiceObjectArgs(ServiceObjectArgs $) {
        this.serviceKey = $.serviceKey;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceObjectArgs $;

        public Builder() {
            $ = new ServiceObjectArgs();
        }

        public Builder(ServiceObjectArgs defaults) {
            $ = new ServiceObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceKey Your Service name associated service key in PagerDuty. This key may also be referred to as an Integration Key or Routing Key in the Pagerduty Integration documentation to have it destroyed and recreated.
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(Output<String> serviceKey) {
            $.serviceKey = serviceKey;
            return this;
        }

        /**
         * @param serviceKey Your Service name associated service key in PagerDuty. This key may also be referred to as an Integration Key or Routing Key in the Pagerduty Integration documentation to have it destroyed and recreated.
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(String serviceKey) {
            return serviceKey(Output.of(serviceKey));
        }

        /**
         * @param serviceName Your Service name in PagerDuty.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Your Service name in PagerDuty.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ServiceObjectArgs build() {
            if ($.serviceKey == null) {
                throw new MissingRequiredPropertyException("ServiceObjectArgs", "serviceKey");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("ServiceObjectArgs", "serviceName");
            }
            return $;
        }
    }

}
