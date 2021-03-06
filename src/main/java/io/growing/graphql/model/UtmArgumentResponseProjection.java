package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UtmArgument
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class UtmArgumentResponseProjection extends GraphQLResponseProjection {

    public UtmArgumentResponseProjection() {
    }

    @Override
    public UtmArgumentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UtmArgumentResponseProjection all$(int maxDepth) {
        this.id();
        this.utmKey();
        this.userKey();
        this.typename();
        return this;
    }

    public UtmArgumentResponseProjection id() {
        return id(null);
    }

    public UtmArgumentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UtmArgumentResponseProjection utmKey() {
        return utmKey(null);
    }

    public UtmArgumentResponseProjection utmKey(String alias) {
        fields.add(new GraphQLResponseField("utmKey").alias(alias));
        return this;
    }

    public UtmArgumentResponseProjection userKey() {
        return userKey(null);
    }

    public UtmArgumentResponseProjection userKey(String alias) {
        fields.add(new GraphQLResponseField("userKey").alias(alias));
        return this;
    }

    public UtmArgumentResponseProjection typename() {
        return typename(null);
    }

    public UtmArgumentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
