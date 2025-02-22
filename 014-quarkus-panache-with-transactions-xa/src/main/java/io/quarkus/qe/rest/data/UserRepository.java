package io.quarkus.qe.rest.data;

import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import io.quarkus.panache.common.Sort;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<UserEntity, Long> {

    @Override
    public PanacheQuery<UserEntity> find(String query, Map<String, Object> params) {
        return find(query, Sort.ascending("name"), params);
    }
}
