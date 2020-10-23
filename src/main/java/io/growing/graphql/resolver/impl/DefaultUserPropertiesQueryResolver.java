package io.growing.graphql.resolver.impl;

import com.kobylynskyi.graphql.codegen.extension.GrowingIOConfig;
import com.kobylynskyi.graphql.codegen.extension.utils.JavaCollectionUtils;
import com.kobylynskyi.graphql.codegen.extension.utils.OkHttpUtils;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import io.growing.graphql.resolver.*;
import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultUserPropertiesQueryResolver implements UserPropertiesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUserPropertiesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUserPropertiesQueryResolver() {}

    @Override
    public java.util.List<UserPropertyDto> userProperties() throws Exception {
        UserPropertiesQueryRequest request = new UserPropertiesQueryRequest();
        UserPropertyResponseProjection projection = new UserPropertyResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UserPropertiesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UserPropertiesQueryResponse.class);
        return result.userProperties();
    }

}