package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class UtmArgumentsQueryResponse extends GraphQLResult<Map<String, java.util.List<UtmArgumentDto>>> {

    private static final String OPERATION_NAME = "utmArguments";

    public UtmArgumentsQueryResponse() {
    }

    public java.util.List<UtmArgumentDto> utmArguments() {
        Map<String, java.util.List<UtmArgumentDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
