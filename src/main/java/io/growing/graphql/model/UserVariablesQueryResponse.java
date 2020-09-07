package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class UserVariablesQueryResponse extends GraphQLResult<Map<String, java.util.List<UserVariableDto>>> {

    private static final String OPERATION_NAME = "userVariables";

    public UserVariablesQueryResponse() {
    }

    public java.util.List<UserVariableDto> userVariables() {
        Map<String, java.util.List<UserVariableDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
