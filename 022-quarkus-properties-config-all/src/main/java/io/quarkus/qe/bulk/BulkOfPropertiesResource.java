package io.quarkus.qe.bulk;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperties;

@Path("/bulk-properties")
public class BulkOfPropertiesResource {

    @ConfigProperties
    BulkOfPropertiesConfiguration config;

    @GET
    @Path("/url")
    public String getUrl() {
        return config.url;
    }

    @GET
    @Path("/port")
    public int getPort() {
        return config.port;
    }

    @GET
    @Path("/repeatedPort")
    public int getRepeatedPort() {
        return config.repeatedPort;
    }

    @GET
    @Path("/path")
    public String getPath() {
        return config.path;
    }

    @GET
    @Path("/urlWithDefaultAndConfigFound")
    public String getUrlWithDefaultAndConfigFound() {
        return config.urlWithDefaultAndConfigFound;
    }

    @GET
    @Path("/urlWithDefaultAndConfigNotFound")
    public String getUrlWithDefaultAndConfigNotFound() {
        return config.urlWithDefaultAndConfigNotFound;
    }

    @GET
    @Path("/urlWithDefaultNested")
    public String getUrlWithDefaultNested() {
        return config.urlWithDefaultNested;
    }

    @GET
    @Path("/urlComposed")
    public String getUrlComposed() {
        return config.urlComposed;
    }

    @GET
    @Path("/urlRaw")
    public String getUrlRaw() {
        return config.urlRaw;
    }
}
