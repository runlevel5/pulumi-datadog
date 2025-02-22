// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.confluent;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.confluent.IntegrationAccountArgs;
import com.pulumi.datadog.confluent.inputs.IntegrationAccountState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog IntegrationConfluentAccount resource. This can be used to create and manage Datadog integration_confluent_account.
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
 * import com.pulumi.datadog.confluent.IntegrationAccount;
 * import com.pulumi.datadog.confluent.IntegrationAccountArgs;
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
 *         // Create new integration_confluent_account resource
 *         var foo = new IntegrationAccount(&#34;foo&#34;, IntegrationAccountArgs.builder()        
 *             .apiKey(&#34;TESTAPIKEY123&#34;)
 *             .apiSecret(&#34;test-api-secret-123&#34;)
 *             .tags(            
 *                 &#34;mytag&#34;,
 *                 &#34;mytag2:myvalue&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Confluent account ID can be retrieved using the ListConfluentAccounts endpoint
 * 
 * https://docs.datadoghq.com/api/latest/confluent-cloud/#list-confluent-accounts
 * 
 * ```sh
 * $ pulumi import datadog:confluent/integrationAccount:IntegrationAccount new_list &#34;&lt;ID&gt;&#34;
 * ```
 * 
 */
@ResourceType(type="datadog:confluent/integrationAccount:IntegrationAccount")
public class IntegrationAccount extends com.pulumi.resources.CustomResource {
    /**
     * The API key associated with your Confluent account.
     * 
     */
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output<String> apiKey;

    /**
     * @return The API key associated with your Confluent account.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }
    /**
     * The API secret associated with your Confluent account.
     * 
     */
    @Export(name="apiSecret", refs={String.class}, tree="[0]")
    private Output<String> apiSecret;

    /**
     * @return The API secret associated with your Confluent account.
     * 
     */
    public Output<String> apiSecret() {
        return this.apiSecret;
    }
    /**
     * A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationAccount(String name) {
        this(name, IntegrationAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccount(String name, IntegrationAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccount(String name, IntegrationAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:confluent/integrationAccount:IntegrationAccount", name, args == null ? IntegrationAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationAccount(String name, Output<String> id, @Nullable IntegrationAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:confluent/integrationAccount:IntegrationAccount", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apiSecret"
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
    public static IntegrationAccount get(String name, Output<String> id, @Nullable IntegrationAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAccount(name, id, state, options);
    }
}
