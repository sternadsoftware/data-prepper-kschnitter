package org.opensearch.dataprepper.plugins.source.otellogs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RetryInfoConfig {

    @JsonProperty("min_delay")
    private Integer minDelay;

    @JsonProperty("max_delay")
    private Integer maxDelay;

    // Jackson needs this constructor
    public RetryInfoConfig() {}

    public RetryInfoConfig(int minDelay, int maxDelay) {
        this.minDelay = minDelay;
        this.maxDelay = maxDelay;
    }

    public int getMinDelay() {
        return minDelay;
    }

    public void setMinDelay(Integer minDelay) {
        this.minDelay = minDelay;
    }

    public int getMaxDelay() {
        return maxDelay;
    }

    public void setMaxDelay(Integer maxDelay) {
        this.maxDelay = maxDelay;
    }
}
