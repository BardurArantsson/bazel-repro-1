load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")

scala_import(
    name = "scalatest",
    jars = [
        "//3rdparty/jvm/org/scalatest:scalatest_2_12",
        "//3rdparty/jvm/org/scalactic:scalactic_2_12",
    ],
)

scala_library(
    name = "myspec-all",
    srcs = glob(["**/*.scala"]),
    deps = [ 
        "//3rdparty/jvm/dk/cwconsult/peregrin:peregrin_core",
        "//3rdparty/jvm/dk/cwconsult:tempgres_client",
        "//3rdparty/jvm/org/apache/logging/log4j:log4j_api",
        "//3rdparty/jvm/org/apache/logging/log4j:log4j_core",
        "//3rdparty/jvm/org/apache/logging/log4j:log4j_slf4j_impl",
        "//3rdparty/jvm/org/scalikejdbc:scalikejdbc_core",
        "//3rdparty/jvm/org/scodec:scodec_bits",
        "//3rdparty/jvm/org/typelevel:cats_core",
        "//3rdparty/jvm/org/typelevel:cats_kernel",
        "//3rdparty/jvm/org/typelevel:cats_macros",
        "//3rdparty/jvm/org/postgresql:postgresql",
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_core",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/typesafe/play:twirl_api",
        "@io_bazel_rules_scala_scala_library//:io_bazel_rules_scala_scala_library",
        "@io_bazel_rules_scala_scala_reflect//:io_bazel_rules_scala_scala_reflect",
        "@io_bazel_rules_scala_scala_compiler//:io_bazel_rules_scala_scala_compiler",
        "@io_bazel_rules_scala_scala_xml//:io_bazel_rules_scala_scala_xml",
        ":scalatest",
    ],
)
