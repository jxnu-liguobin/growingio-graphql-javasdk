package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class CreateUserVariableMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "createUserVariable";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CreateUserVariableMutationRequest() {
    }

    public void setUserVariable(VariableInputDto userVariable) {
        this.input.put("userVariable", userVariable);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private VariableInputDto userVariable;

        public Builder() {
        }

        public Builder setUserVariable(VariableInputDto userVariable) {
            this.userVariable = userVariable;
            return this;
        }


        public CreateUserVariableMutationRequest build() {
            CreateUserVariableMutationRequest obj = new CreateUserVariableMutationRequest();
            obj.setUserVariable(userVariable);
            return obj;
        }

    }
}
