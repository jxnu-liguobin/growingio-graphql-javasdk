package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public class UpdateTagMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateTag";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateTagMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setTag(TagInputDto tag) {
        this.input.put("tag", tag);
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

        private String id;
        private TagInputDto tag;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTag(TagInputDto tag) {
            this.tag = tag;
            return this;
        }


        public UpdateTagMutationRequest build() {
            UpdateTagMutationRequest obj = new UpdateTagMutationRequest();
            obj.setId(id);
            obj.setTag(tag);
            return obj;
        }

    }
}
