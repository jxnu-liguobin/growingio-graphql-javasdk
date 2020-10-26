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
final public class DefaultUbaUserVariablesQueryResolver implements UbaUserVariablesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUbaUserVariablesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUbaUserVariablesQueryResolver() {}

    @Override
    public java.util.List<UserVariableDto> ubaUserVariables(String tunnelId) throws Exception {
        UbaUserVariablesQueryRequest request = new UbaUserVariablesQueryRequest();
        List<String> keys = Arrays.asList("tunnelId");
        List<?> values = Arrays.asList(tunnelId);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserVariableResponseProjection projection = new UserVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UbaUserVariablesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UbaUserVariablesQueryResponse.class);
        return result.ubaUserVariables();
    }

}