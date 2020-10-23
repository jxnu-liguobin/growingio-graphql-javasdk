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
final public class DefaultSettingPersonaMeasurementsMutationResolver implements SettingPersonaMeasurementsMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultSettingPersonaMeasurementsMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultSettingPersonaMeasurementsMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public Boolean settingPersonaMeasurements(java.util.List<MeasurementInputDto> measurements) throws Exception {
        SettingPersonaMeasurementsMutationRequest request = new SettingPersonaMeasurementsMutationRequest();
        List<String> keys = Arrays.asList("measurements");
        List<?> values = Arrays.asList(measurements);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        SettingPersonaMeasurementsMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SettingPersonaMeasurementsMutationResponse.class);
        return result.settingPersonaMeasurements();
    }

}