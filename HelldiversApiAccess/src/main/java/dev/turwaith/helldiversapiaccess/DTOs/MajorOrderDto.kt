package dev.turwaith.helldiversapiaccess.DTOs

data class MajorOrderDto(
    var progress: Int,
    var title: String,
    var description: String,
    var descriptionLong: String,
    var goal: Int,
    var expiresIn: Int
)
