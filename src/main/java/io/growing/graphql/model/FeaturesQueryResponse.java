package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class FeaturesQueryResponse extends GraphQLResult<Map<String, java.util.List<FeatureDto>>> {

    private static final String OPERATION_NAME = "features";

    public FeaturesQueryResponse() {
    }

    public java.util.List<FeatureDto> features() {
        Map<String, java.util.List<FeatureDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
