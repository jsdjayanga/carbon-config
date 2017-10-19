module org.wso2.carbon.config {
    requires slf4j.api;
    requires java.compiler;
    requires snakeyaml;

    requires org.wso2.carbon.secvault;

    exports org.wso2.carbon.config;
    exports org.wso2.carbon.config.annotation;
    exports org.wso2.carbon.config.provider;
}