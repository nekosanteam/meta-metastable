# meta-metastable
 
```
MACHINE = "qemuarm64"
DL_DIR = "${TOPDIR}/../downloads"
PACKAGE_CLASSES = "package_deb"
INHERIT += "rm_work"

LINUXLIBCVERSION = "6.6.11"

VIRTUAL-RUNTIME_init_manager = "busybox"
VIRTUAL-RUNTIME_dev_manager = "busybox-mdev"
```
