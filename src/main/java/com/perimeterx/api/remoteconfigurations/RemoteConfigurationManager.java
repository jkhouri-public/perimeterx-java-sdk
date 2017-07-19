package com.perimeterx.api.remoteconfigurations;

import com.perimeterx.models.configuration.PXDynamicConfiguration;

import java.io.IOException;

/**
 * This interface will be used to retrieve new values for the PXConfiguration
 */
public interface RemoteConfigurationManager {
    /**
     * Returns new values to update PXConfiguration settings
     * @return PXDynamicConfiguration
     */
    PXDynamicConfiguration getConfiguration() throws IOException;

    /**
     * Method that updates PXConfiguration with values from a PXDynamicConfiguration object
     * @param pxDynamicConfiguration
     */
    void updateConfiguration(PXDynamicConfiguration pxDynamicConfiguration);

    /**
     * Should set PerimeterX module to disabled on error
     */
    void disableModuleOnError();
}
