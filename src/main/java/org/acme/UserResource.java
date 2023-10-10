package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import io.quarkiverse.zanzibar.annotations.FGAPathObject;
import io.quarkiverse.zanzibar.annotations.FGARelation;
import io.quarkiverse.zanzibar.annotations.FGAUserType;

@Path("/api/users")
public class UserResource {

    @GET
    @Path("{id}")
    @FGAPathObject(param = "id", type = "role")
    @FGARelation("assignee")
    @FGAUserType("user")
    public String getUser(String id) {
        return "success";
    }
}