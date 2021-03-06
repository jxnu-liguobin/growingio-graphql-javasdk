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
public class SimpleEventsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "simpleEvents";

    private Map<String, Object> input = new LinkedHashMap<>();

    public SimpleEventsQueryRequest() {
    }

    public void setElementId(String elementId) {
        this.input.put("elementId", elementId);
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

        private String elementId;

        public Builder() {
        }

        public Builder setElementId(String elementId) {
            this.elementId = elementId;
            return this;
        }


        public SimpleEventsQueryRequest build() {
            SimpleEventsQueryRequest obj = new SimpleEventsQueryRequest();
            obj.setElementId(elementId);
            return obj;
        }

    }
}
