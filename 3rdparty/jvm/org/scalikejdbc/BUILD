load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
scala_import(
    name = "scalikejdbc_core",
    exports = [
        "//3rdparty/jvm/org/apache/commons:commons_dbcp2",
        "//3rdparty/jvm/org/scala_lang/modules:scala_parser_combinators",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/slf4j:slf4j_api"
    ],
    jars = [
        "//external:jar/org/scalikejdbc/scalikejdbc_core_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)


