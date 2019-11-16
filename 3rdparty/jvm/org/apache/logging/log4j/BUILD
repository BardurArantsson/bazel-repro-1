load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
java_library(
    name = "log4j_api",
    exports = [
        "//external:jar/org/apache/logging/log4j/log4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "log4j_core",
    exports = [
        "//external:jar/org/apache/logging/log4j/log4j_core",
        ":log4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "log4j_slf4j_impl",
    exports = [
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/logging/log4j/log4j_slf4j_impl",
        ":log4j_api",
        ":log4j_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)


