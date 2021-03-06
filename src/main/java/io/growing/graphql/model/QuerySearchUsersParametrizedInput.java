package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field searchUsers in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class QuerySearchUsersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String q;

    public QuerySearchUsersParametrizedInput() {
    }

    public QuerySearchUsersParametrizedInput(String q) {
        this.q = q;
    }

    public QuerySearchUsersParametrizedInput q(String q) {
        this.q = q;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (q != null) {
            joiner.add("q: " + GraphQLRequestSerializer.getEntry(q));
        }
        return joiner.toString();
    }

}
