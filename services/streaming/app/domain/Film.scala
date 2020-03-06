package domain

import java.time.LocalDateTime

case class Film(
    id: Option[Int] = None,
    name: String,
    description: String,
    genres: List[Genre],
    duration: Option[Long] = None,
    uploadDate: LocalDateTime = LocalDateTime.now,
    available: Boolean = false)
