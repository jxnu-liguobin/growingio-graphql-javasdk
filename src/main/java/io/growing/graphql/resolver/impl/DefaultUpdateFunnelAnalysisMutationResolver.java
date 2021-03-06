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
final public class DefaultUpdateFunnelAnalysisMutationResolver implements UpdateFunnelAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultUpdateFunnelAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultUpdateFunnelAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public FunnelAnalysisDto updateFunnelAnalysis(String id, FunnelAnalysisInputDto funnelAnalysis) throws Exception {
        UpdateFunnelAnalysisMutationRequest request = new UpdateFunnelAnalysisMutationRequest();
        List<String> keys = Arrays.asList("id", "funnelAnalysis");
        List<?> values = Arrays.asList(id, funnelAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        FunnelAnalysisResponseProjection projection = new FunnelAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        UpdateFunnelAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateFunnelAnalysisMutationResponse.class);
        return result.updateFunnelAnalysis();
    }

}