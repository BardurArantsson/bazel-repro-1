load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
scala_import(
    name = "cats_core",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":cats_kernel",
        ":cats_macros",
        ":machinist"
    ],
    jars = [
        "//external:jar/org/typelevel/cats_core_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "cats_kernel",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/org/typelevel/cats_kernel_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "cats_macros",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":machinist"
    ],
    jars = [
        "//external:jar/org/typelevel/cats_macros_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "kind_projector_2_12_10",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_compiler",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/org/typelevel/kind_projector_2_12_10"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "machinist",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect"
    ],
    jars = [
        "//external:jar/org/typelevel/machinist_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)


