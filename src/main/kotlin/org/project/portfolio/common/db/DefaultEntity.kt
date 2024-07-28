package org.project.portfolio.common.db

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

@MappedSuperclass
abstract class DefaultEntity(
    @Column(name = "deleted_at")
    var deletedAt: LocalDateTime? = null,

    @Column(name = "updated_id", nullable = false)
    var updatedId: Int = 0,

    @Column(name = "updated_at", nullable = false)
    var updatedAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "created_id")
    var createdId: Int? = null,

    @Column(name = "created_at", nullable = false)
    var createdAt: LocalDateTime = LocalDateTime.now()
) {

}
