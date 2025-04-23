fun main() {
    val tipoSuperEfetivo: Map<String, List<String>> = mapOf(
        "NORMAL" to listOf(),
        "FOGO" to listOf("GRAMA", "GELO", "INSETO", "METAL"),
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR"),
        "GELO" to listOf("GRAMA", "TERRA", "VOADOR", "DRAGÃO"),
        "LUTADOR" to listOf("NORMAL", "GELO", "PEDRA", "METAL", "NOTURNO"),
        "VENENO" to listOf("GRAMA", "FADA"),
        "TERRA" to listOf("FOGO", "ELÉTRICO", "VENENO", "PEDRA", "METAL"),
        "VOADOR" to listOf("GRAMA", "LUTADOR", "INSETO"),
        "PSÍQUICO" to listOf("LUTADOR", "VENENO"),
        "INSETO" to listOf("GRAMA", "PSÍQUICO", "NOTURNO"),
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO"),
        "FANTASMA" to listOf("FANTASMA", "PSÍQUICO"),
        "DRAGÃO" to listOf("DRAGÃO"),
        "METAL" to listOf("GELO", "PEDRA", "FADA"),
        "FADA" to listOf("LUTADOR", "DRAGÃO", "NOTURNO"),
        "NOTURNO" to listOf("PSÍQUICO", "FANTASMA")
    )

}
