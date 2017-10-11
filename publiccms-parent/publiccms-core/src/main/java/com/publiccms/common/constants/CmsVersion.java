package com.publiccms.common.constants;

import static com.publiccms.common.constants.CommonConstants.CMS_FILEPATH;
import static com.publiccms.common.constants.CommonConstants.LICENSE_FILENAME;

import java.util.UUID;

import com.publiccms.common.copyright.CmsCopyright;

import com.publiccms.common.copyright.Copyright;
import com.publiccms.common.copyright.License;

/**
 *
 * CmsVersion
 *
 */
public class CmsVersion {
    private static final String clusterId = UUID.randomUUID().toString();
    private static boolean master = false;
    private static boolean initialized = false;
    private static Copyright copyright = new CmsCopyright();

    /**
     * @return version
     */
    public static final String getVersion() {
        return "V4.0.20170812";
    }

    /**
     * @return whether the authorization edition
     */
    public static boolean isAuthorizationEdition() {
        return copyright.verify(CMS_FILEPATH + LICENSE_FILENAME);
    }

    /**
     * @param domain
     * @return whether the domain authorized
     */
    public static boolean verifyDomain(String domain) {
        return copyright.verify(CMS_FILEPATH + LICENSE_FILENAME);
    }

    /**
     * @return license
     */
    public static License getLicense() {
        return copyright.getLicense(CMS_FILEPATH + LICENSE_FILENAME);
    }

    /**
     * @return cluster id
     */
    public static final String getClusterId() {
        return clusterId;
    }

    /**
     * @return whether the master node
     */
    public static boolean isMaster() {
        return master;
    }

    /**
     * @param master
     */
    public static void setMaster(boolean master) {
        CmsVersion.master = master;
    }

    /**
     * @return whether initialized
     */
    public static boolean isInitialized() {
        return initialized;
    }

    /**
     * @param initialized
     */
    public static void setInitialized(boolean initialized) {
        CmsVersion.initialized = initialized;
    }
}