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
public class UserProfileQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "userProfile";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UserProfileQueryRequest() {
    }

    public void setUserId(String userId) {
        this.input.put("userId", userId);
    }

    public void setTags(java.util.List<String> tags) {
        this.input.put("tags", tags);
    }

    public void setProperties(java.util.List<String> properties) {
        this.input.put("properties", properties);
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

        private String userId;
        private java.util.List<String> tags;
        private java.util.List<String> properties;

        public Builder() {
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setProperties(java.util.List<String> properties) {
            this.properties = properties;
            return this;
        }


        public UserProfileQueryRequest build() {
            UserProfileQueryRequest obj = new UserProfileQueryRequest();
            obj.setUserId(userId);
            obj.setTags(tags);
            obj.setProperties(properties);
            return obj;
        }

    }
}
