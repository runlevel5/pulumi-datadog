// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.DowntimeScheduleArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.DowntimeScheduleState;
import com.pulumi.datadog.outputs.DowntimeScheduleMonitorIdentifier;
import com.pulumi.datadog.outputs.DowntimeScheduleOneTimeSchedule;
import com.pulumi.datadog.outputs.DowntimeScheduleRecurringSchedule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog DowntimeSchedule resource. This can be used to create and manage Datadog downtimes.
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
 * import com.pulumi.datadog.DowntimeSchedule;
 * import com.pulumi.datadog.DowntimeScheduleArgs;
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
 *         // Create new downtime_schedule resource
 *         var downtimeScheduleExample = new DowntimeSchedule(&#34;downtimeScheduleExample&#34;, DowntimeScheduleArgs.builder()        
 *             .scope(&#34;env:us9-prod7 AND team:test123&#34;)
 *             .monitorIdentifier(DowntimeScheduleMonitorIdentifierArgs.builder()
 *                 .monitorTags(                
 *                     &#34;test:123&#34;,
 *                     &#34;data:test&#34;)
 *                 .build())
 *             .recurringSchedule(DowntimeScheduleRecurringScheduleArgs.builder()
 *                 .recurrences(DowntimeScheduleRecurringScheduleRecurrenceArgs.builder()
 *                     .duration(&#34;1h&#34;)
 *                     .rrule(&#34;FREQ=DAILY;INTERVAL=1&#34;)
 *                     .start(&#34;2050-01-02T03:04:05&#34;)
 *                     .build())
 *                 .timezone(&#34;America/New_York&#34;)
 *                 .build())
 *             .displayTimezone(&#34;America/New_York&#34;)
 *             .message(&#34;Message about the downtime&#34;)
 *             .muteFirstRecoveryNotification(true)
 *             .notifyEndStates(            
 *                 &#34;alert&#34;,
 *                 &#34;warn&#34;)
 *             .notifyEndTypes(            
 *                 &#34;canceled&#34;,
 *                 &#34;expired&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import datadog:index/downtimeSchedule:DowntimeSchedule new_list &#34;00e000000-0000-1234-0000-000000000000&#34;
 * ```
 * 
 */
@ResourceType(type="datadog:index/downtimeSchedule:DowntimeSchedule")
public class DowntimeSchedule extends com.pulumi.resources.CustomResource {
    /**
     * The timezone in which to display the downtime&#39;s start and end times in Datadog applications. This is not used as an offset for scheduling.
     * 
     */
    @Export(name="displayTimezone", refs={String.class}, tree="[0]")
    private Output<String> displayTimezone;

    /**
     * @return The timezone in which to display the downtime&#39;s start and end times in Datadog applications. This is not used as an offset for scheduling.
     * 
     */
    public Output<String> displayTimezone() {
        return this.displayTimezone;
    }
    /**
     * A message to include with notifications for this downtime. Email notifications can be sent to specific users by using the same `@username` notation as events.
     * 
     */
    @Export(name="message", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> message;

    /**
     * @return A message to include with notifications for this downtime. Email notifications can be sent to specific users by using the same `@username` notation as events.
     * 
     */
    public Output<Optional<String>> message() {
        return Codegen.optional(this.message);
    }
    @Export(name="monitorIdentifier", refs={DowntimeScheduleMonitorIdentifier.class}, tree="[0]")
    private Output</* @Nullable */ DowntimeScheduleMonitorIdentifier> monitorIdentifier;

    public Output<Optional<DowntimeScheduleMonitorIdentifier>> monitorIdentifier() {
        return Codegen.optional(this.monitorIdentifier);
    }
    /**
     * If the first recovery notification during a downtime should be muted.
     * 
     */
    @Export(name="muteFirstRecoveryNotification", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> muteFirstRecoveryNotification;

    /**
     * @return If the first recovery notification during a downtime should be muted.
     * 
     */
    public Output<Boolean> muteFirstRecoveryNotification() {
        return this.muteFirstRecoveryNotification;
    }
    /**
     * States that will trigger a monitor notification when the `notify_end_types` action occurs.
     * 
     */
    @Export(name="notifyEndStates", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> notifyEndStates;

    /**
     * @return States that will trigger a monitor notification when the `notify_end_types` action occurs.
     * 
     */
    public Output<List<String>> notifyEndStates() {
        return this.notifyEndStates;
    }
    /**
     * Actions that will trigger a monitor notification if the downtime is in the `notify_end_types` state.
     * 
     */
    @Export(name="notifyEndTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> notifyEndTypes;

    /**
     * @return Actions that will trigger a monitor notification if the downtime is in the `notify_end_types` state.
     * 
     */
    public Output<List<String>> notifyEndTypes() {
        return this.notifyEndTypes;
    }
    @Export(name="oneTimeSchedule", refs={DowntimeScheduleOneTimeSchedule.class}, tree="[0]")
    private Output</* @Nullable */ DowntimeScheduleOneTimeSchedule> oneTimeSchedule;

    public Output<Optional<DowntimeScheduleOneTimeSchedule>> oneTimeSchedule() {
        return Codegen.optional(this.oneTimeSchedule);
    }
    @Export(name="recurringSchedule", refs={DowntimeScheduleRecurringSchedule.class}, tree="[0]")
    private Output</* @Nullable */ DowntimeScheduleRecurringSchedule> recurringSchedule;

    public Output<Optional<DowntimeScheduleRecurringSchedule>> recurringSchedule() {
        return Codegen.optional(this.recurringSchedule);
    }
    /**
     * The scope to which the downtime applies. Must follow the [common search syntax](https://docs.datadoghq.com/logs/explorer/search_syntax/).
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return The scope to which the downtime applies. Must follow the [common search syntax](https://docs.datadoghq.com/logs/explorer/search_syntax/).
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DowntimeSchedule(String name) {
        this(name, DowntimeScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DowntimeSchedule(String name, DowntimeScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DowntimeSchedule(String name, DowntimeScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/downtimeSchedule:DowntimeSchedule", name, args == null ? DowntimeScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DowntimeSchedule(String name, Output<String> id, @Nullable DowntimeScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/downtimeSchedule:DowntimeSchedule", name, state, makeResourceOptions(options, id));
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
    public static DowntimeSchedule get(String name, Output<String> id, @Nullable DowntimeScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DowntimeSchedule(name, id, state, options);
    }
}
