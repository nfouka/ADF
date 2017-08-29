# ADF
New Tutorials for ADF starter developer's


Where can I change allocated memory of JDeveloper?



For JDeveloper 11.1.2.x, you can configure VM options in the JDeveloper configuration file at jdeveloper/jdev/bin/jdev.conf. For example, to set the maximum heap size to 2GB, add the following line to this file:

AddVMOption  -Xmx2048M

Note that this only affects the IDE - to set memory limits for the internal Weblogic Server, you can set the USER_MEM_ARGS environment variable before launching the IDE, like

$ export USER_MEM_ARGS="-Xms256m -Xmx1024m"
