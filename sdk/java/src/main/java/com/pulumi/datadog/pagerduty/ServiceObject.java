// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.pagerduty.ServiceObjectArgs;
import com.pulumi.datadog.pagerduty.inputs.ServiceObjectState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides access to individual Service Objects of Datadog - PagerDuty integrations. Note that the Datadog - PagerDuty integration must be activated in the Datadog UI in order for this resource to be usable.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.datadog.pagerduty.ServiceObject;
 * import com.pulumi.datadog.pagerduty.ServiceObjectArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testingFoo = new ServiceObject(&#34;testingFoo&#34;, ServiceObjectArgs.builder()        
 *             .serviceName(&#34;testing_foo&#34;)
 *             .serviceKey(&#34;9876543210123456789&#34;)
 *             .build());
 * 
 *         var testingBar = new ServiceObject(&#34;testingBar&#34;, ServiceObjectArgs.builder()        
 *             .serviceName(&#34;testing_bar&#34;)
 *             .serviceKey(&#34;54321098765432109876&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Pagerduty service object can be imported using the service_name, while the service_key should be passed by setting the environment variable SERVICE_KEY
 * 
 * ```sh
 * $ pulumi import datadog:pagerduty/serviceObject:ServiceObject SERVICE_KEY=${service_key} datadog_integration_pagerduty_service_object.foo ${service_name}
 * ```
 * 
 */
@ResourceType(type="datadog:pagerduty/serviceObject:ServiceObject")
public class ServiceObject extends com.pulumi.resources.CustomResource {
    /**
     * Your Service name associated service key in PagerDuty. This key may also be referred to as an Integration Key or Routing Key in the Pagerduty Integration documentation to have it destroyed and recreated.
     * 
     */
    @Export(name="serviceKey", refs={String.class}, tree="[0]")
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
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return Your Service name in PagerDuty.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceObject(String name) {
        this(name, ServiceObjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceObject(String name, ServiceObjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceObject(String name, ServiceObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:pagerduty/serviceObject:ServiceObject", name, args == null ? ServiceObjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceObject(String name, Output<String> id, @Nullable ServiceObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:pagerduty/serviceObject:ServiceObject", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "serviceKey"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServiceObject get(String name, Output<String> id, @Nullable ServiceObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceObject(name, id, state, options);
    }
}
