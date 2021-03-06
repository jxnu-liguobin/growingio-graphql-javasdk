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
final public class DefaultCreateFunnelAnalysisMutationResolver implements CreateFunnelAnalysisMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCreateFunnelAnalysisMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCreateFunnelAnalysisMutationResolver() {}

    @javax.validation.constraints.NotNull
    @Override
    public FunnelAnalysisDto createFunnelAnalysis(FunnelAnalysisInputDto funnelAnalysis) throws Exception {
        CreateFunnelAnalysisMutationRequest request = new CreateFunnelAnalysisMutationRequest();
        List<String> keys = Arrays.asList("funnelAnalysis");
        List<?> values = Arrays.asList(funnelAnalysis);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        FunnelAnalysisResponseProjection projection = new FunnelAnalysisResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        CreateFunnelAnalysisMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CreateFunnelAnalysisMutationResponse.class);
        return result.createFunnelAnalysis();
    }

}