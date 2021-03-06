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
final public class DefaultUpdateUserVariableMutationResolver implements UpdateUserVariableMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateUserVariableMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateUserVariableMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public UserVariableDto updateUserVariable(String id, VariableInputDto userVariable) throws Exception {
        UpdateUserVariableMutationRequest request = new UpdateUserVariableMutationRequest();
        List<String> keys = Arrays.asList("id", "userVariable");
        List<?> values = Arrays.asList(id, userVariable);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        UserVariableResponseProjection projection = new UserVariableResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateUserVariableMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateUserVariableMutationResponse.class);
        return result.updateUserVariable();
    }

}