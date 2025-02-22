// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardJsonState extends com.pulumi.resources.ResourceArgs {

    public static final DashboardJsonState Empty = new DashboardJsonState();

    /**
     * The JSON formatted definition of the Dashboard.
     * 
     */
    @Import(name="dashboard")
    private @Nullable Output<String> dashboard;

    /**
     * @return The JSON formatted definition of the Dashboard.
     * 
     */
    public Optional<Output<String>> dashboard() {
        return Optional.ofNullable(this.dashboard);
    }

    /**
     * A list of dashboard lists this dashboard belongs to. This attribute should not be set if managing the corresponding
     * dashboard lists using Terraform as it causes inconsistent behavior.
     * 
     */
    @Import(name="dashboardLists")
    private @Nullable Output<List<Integer>> dashboardLists;

    /**
     * @return A list of dashboard lists this dashboard belongs to. This attribute should not be set if managing the corresponding
     * dashboard lists using Terraform as it causes inconsistent behavior.
     * 
     */
    public Optional<Output<List<Integer>>> dashboardLists() {
        return Optional.ofNullable(this.dashboardLists);
    }

    /**
     * The list of dashboard lists this dashboard should be removed from. Internal only.
     * 
     */
    @Import(name="dashboardListsRemoveds")
    private @Nullable Output<List<Integer>> dashboardListsRemoveds;

    /**
     * @return The list of dashboard lists this dashboard should be removed from. Internal only.
     * 
     */
    public Optional<Output<List<Integer>>> dashboardListsRemoveds() {
        return Optional.ofNullable(this.dashboardListsRemoveds);
    }

    /**
     * The URL of the dashboard.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL of the dashboard.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private DashboardJsonState() {}

    private DashboardJsonState(DashboardJsonState $) {
        this.dashboard = $.dashboard;
        this.dashboardLists = $.dashboardLists;
        this.dashboardListsRemoveds = $.dashboardListsRemoveds;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardJsonState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardJsonState $;

        public Builder() {
            $ = new DashboardJsonState();
        }

        public Builder(DashboardJsonState defaults) {
            $ = new DashboardJsonState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dashboard The JSON formatted definition of the Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder dashboard(@Nullable Output<String> dashboard) {
            $.dashboard = dashboard;
            return this;
        }

        /**
         * @param dashboard The JSON formatted definition of the Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder dashboard(String dashboard) {
            return dashboard(Output.of(dashboard));
        }

        /**
         * @param dashboardLists A list of dashboard lists this dashboard belongs to. This attribute should not be set if managing the corresponding
         * dashboard lists using Terraform as it causes inconsistent behavior.
         * 
         * @return builder
         * 
         */
        public Builder dashboardLists(@Nullable Output<List<Integer>> dashboardLists) {
            $.dashboardLists = dashboardLists;
            return this;
        }

        /**
         * @param dashboardLists A list of dashboard lists this dashboard belongs to. This attribute should not be set if managing the corresponding
         * dashboard lists using Terraform as it causes inconsistent behavior.
         * 
         * @return builder
         * 
         */
        public Builder dashboardLists(List<Integer> dashboardLists) {
            return dashboardLists(Output.of(dashboardLists));
        }

        /**
         * @param dashboardLists A list of dashboard lists this dashboard belongs to. This attribute should not be set if managing the corresponding
         * dashboard lists using Terraform as it causes inconsistent behavior.
         * 
         * @return builder
         * 
         */
        public Builder dashboardLists(Integer... dashboardLists) {
            return dashboardLists(List.of(dashboardLists));
        }

        /**
         * @param dashboardListsRemoveds The list of dashboard lists this dashboard should be removed from. Internal only.
         * 
         * @return builder
         * 
         */
        public Builder dashboardListsRemoveds(@Nullable Output<List<Integer>> dashboardListsRemoveds) {
            $.dashboardListsRemoveds = dashboardListsRemoveds;
            return this;
        }

        /**
         * @param dashboardListsRemoveds The list of dashboard lists this dashboard should be removed from. Internal only.
         * 
         * @return builder
         * 
         */
        public Builder dashboardListsRemoveds(List<Integer> dashboardListsRemoveds) {
            return dashboardListsRemoveds(Output.of(dashboardListsRemoveds));
        }

        /**
         * @param dashboardListsRemoveds The list of dashboard lists this dashboard should be removed from. Internal only.
         * 
         * @return builder
         * 
         */
        public Builder dashboardListsRemoveds(Integer... dashboardListsRemoveds) {
            return dashboardListsRemoveds(List.of(dashboardListsRemoveds));
        }

        /**
         * @param url The URL of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public DashboardJsonState build() {
            return $;
        }
    }

}
