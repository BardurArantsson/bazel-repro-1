I've committed the resolved dependencies in 3rdparty, so you can probably just skip the
bazel_dep step.

Dependencies have been generated using

   cd $BAZEL_DEP
   bazel run //:parse generate -- -r ${PROJ_DIR} -s 3rdparty/workspace.bzl --deps dependencies.yml

(where PROJ_DIR is the directory where this code is checked out.)

I'm building using

   bazel build --verbose_failures //src:all


The error message from Bazel is:


ERROR: /home/bardur/tmp/repro-1/src/BUILD:12:1: scala //src:myspec-all failed (Exit 1)
src/MySpec.scala:11: error: exception during macro expansion:
java.lang.NoClassDefFoundError: scala/runtime/LazyRef
        at org.scalactic.MacroOwnerRepair$Utils.repairOwners(MacroOwnerRepair.scala:66)
        at org.scalactic.MacroOwnerRepair.repairOwners(MacroOwnerRepair.scala:46)
        at org.scalactic.BooleanMacro.genMacro(BooleanMacro.scala:837)
        at org.scalatest.AssertionsMacro$.assert(AssertionsMacro.scala:34)

    assert(true === true)
          ^
one error found
one error found
java.lang.RuntimeException: Build failed
        at io.bazel.rulesscala.scalac.ScalacProcessor.compileScalaSources(ScalacProcessor.java:244)
        at io.bazel.rulesscala.scalac.ScalacProcessor.processRequest(ScalacProcessor.java:69)
        at io.bazel.rulesscala.worker.GenericWorker.runPersistentWorker(GenericWorker.java:45)
        at io.bazel.rulesscala.worker.GenericWorker.run(GenericWorker.java:111)
        at io.bazel.rulesscala.scalac.ScalaCInvoker.main(ScalaCInvoker.java:41)
