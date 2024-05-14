package dev.turwaith.helldiversapiaccess

import dev.turwaith.helldiversapiaccess.DTOs.MajorOrderDto

interface MajorOrderInterface {
    fun getCurrentMajorOrder(): MajorOrderDto
}