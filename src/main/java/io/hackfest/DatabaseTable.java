package io.hackfest;

import io.hackfest.model.DbPosUpdate;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
class DatabaseTable implements PanacheRepositoryBase<DbPosUpdate, UUID> {
}
