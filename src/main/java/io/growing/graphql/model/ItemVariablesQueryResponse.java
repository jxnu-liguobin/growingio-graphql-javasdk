package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class ItemVariablesQueryResponse extends GraphQLResult<Map<String, java.util.List<ItemVariableDto>>> {

    private static final String OPERATION_NAME = "itemVariables";

    public ItemVariablesQueryResponse() {
    }

    public java.util.List<ItemVariableDto> itemVariables() {
        Map<String, java.util.List<ItemVariableDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
