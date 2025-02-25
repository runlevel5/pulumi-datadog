// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.SecurityMonitoringSuppressionArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.SecurityMonitoringSuppressionState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog Security Monitoring Suppression API resource. It can be used to create and manage Datadog security monitoring suppression rules.
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
 * import com.pulumi.datadog.SecurityMonitoringSuppression;
 * import com.pulumi.datadog.SecurityMonitoringSuppressionArgs;
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
 *         var mySuppression = new SecurityMonitoringSuppression(&#34;mySuppression&#34;, SecurityMonitoringSuppressionArgs.builder()        
 *             .name(&#34;My suppression&#34;)
 *             .description(&#34;Suppression for low severity CloudTrail signals from test environments limited to 2024&#34;)
 *             .enabled(true)
 *             .ruleQuery(&#34;severity:low source:cloudtrail&#34;)
 *             .suppressionQuery(&#34;env:test&#34;)
 *             .expirationDate(&#34;2024-12-31T12:00:00Z&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Security monitoring suppressions can be imported using ID, for example:
 * 
 * ```sh
 * $ pulumi import datadog:index/securityMonitoringSuppression:SecurityMonitoringSuppression my_suppression m0o-hto-lkb
 * ```
 * 
 */
@ResourceType(type="datadog:index/securityMonitoringSuppression:SecurityMonitoringSuppression")
public class SecurityMonitoringSuppression extends com.pulumi.resources.CustomResource {
    /**
     * An exclusion query on the input data of the security rules, which could be logs, Agent events, or other types of data based on the security rule. Events matching this query are ignored by any detection rules referenced in the suppression rule.
     * 
     */
    @Export(name="dataExclusionQuery", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataExclusionQuery;

    /**
     * @return An exclusion query on the input data of the security rules, which could be logs, Agent events, or other types of data based on the security rule. Events matching this query are ignored by any detection rules referenced in the suppression rule.
     * 
     */
    public Output<Optional<String>> dataExclusionQuery() {
        return Codegen.optional(this.dataExclusionQuery);
    }
    /**
     * A description for the suppression rule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the suppression rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether the suppression rule is enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Whether the suppression rule is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won&#39;t suppress signals anymore.
     * 
     */
    @Export(name="expirationDate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expirationDate;

    /**
     * @return A RFC3339 timestamp giving an expiration date for the suppression rule. After this date, it won&#39;t suppress signals anymore.
     * 
     */
    public Output<Optional<String>> expirationDate() {
        return Codegen.optional(this.expirationDate);
    }
    /**
     * The name of the suppression rule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the suppression rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
     * 
     */
    @Export(name="ruleQuery", refs={String.class}, tree="[0]")
    private Output<String> ruleQuery;

    /**
     * @return The rule query of the suppression rule, with the same syntax as the search bar for detection rules.
     * 
     */
    public Output<String> ruleQuery() {
        return this.ruleQuery;
    }
    /**
     * The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. It uses the same syntax as the queries to search signals in the Signals Explorer.
     * 
     */
    @Export(name="suppressionQuery", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> suppressionQuery;

    /**
     * @return The suppression query of the suppression rule. If a signal matches this query, it is suppressed and is not triggered. It uses the same syntax as the queries to search signals in the Signals Explorer.
     * 
     */
    public Output<Optional<String>> suppressionQuery() {
        return Codegen.optional(this.suppressionQuery);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityMonitoringSuppression(String name) {
        this(name, SecurityMonitoringSuppressionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityMonitoringSuppression(String name, SecurityMonitoringSuppressionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityMonitoringSuppression(String name, SecurityMonitoringSuppressionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/securityMonitoringSuppression:SecurityMonitoringSuppression", name, args == null ? SecurityMonitoringSuppressionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecurityMonitoringSuppression(String name, Output<String> id, @Nullable SecurityMonitoringSuppressionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/securityMonitoringSuppression:SecurityMonitoringSuppression", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static SecurityMonitoringSuppression get(String name, Output<String> id, @Nullable SecurityMonitoringSuppressionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityMonitoringSuppression(name, id, state, options);
    }
}
