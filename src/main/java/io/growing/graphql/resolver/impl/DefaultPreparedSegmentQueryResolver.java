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

/**
 * activeToday: 今日活跃用户
 * activeInThreeWeeks: 近 3 周活跃用户
 * activeNotInTwoWeeks: 近 2 周不活跃用户
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultPreparedSegmentQueryResolver implements PreparedSegmentQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultPreparedSegmentQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultPreparedSegmentQueryResolver() {}

    /**
     * activeToday: 今日活跃用户
     * activeInThreeWeeks: 近 3 周活跃用户
     * activeNotInTwoWeeks: 近 2 周不活跃用户
     */
    @Override
    public PreparedSegmentDto preparedSegment(String id) throws Exception {
        PreparedSegmentQueryRequest request = new PreparedSegmentQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        PreparedSegmentResponseProjection projection = new PreparedSegmentResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        PreparedSegmentQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, PreparedSegmentQueryResponse.class);
        return result.preparedSegment();
    }

}