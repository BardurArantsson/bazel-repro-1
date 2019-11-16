I've committed the resolved dependencies in 3rdparty, so you can probably just skip the
bazel_dep step.

Dependencies have been generated using

   cd $BAZEL_DEP
   bazel run //:parse generate -- -r ${PROJ_DIR} -s 3rdparty/workspace.bzl --deps dependencies.yml

(where PROJ_DIR is the directory where this code is checked out.)

I'm building using

   bazel build --verbose_failures //src:all
