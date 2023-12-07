# meta-metastable
 
```
MACHINE = "qemuarm64"
DL_DIR = "${TOPDIR}/../downloads"
PACKAGE_CLASSES = "package_deb"
INHERIT += "rm_work"

LINUXLIBCVERSION = "6.6"
or
PREFFERED_PROVIDER_linux-libc-headers = "linux-libc-headers-stable"
PREFFERED_PROVIDER_nativesdk-linux-libc-headers = "nativesdk-linux-libc-headers-stable"
PREFFERED_VERSION_linux-libc-headers-stable = "6.6"
PREFFERED_VERSION_nativesdk-linux-libc-headers-stable = "6.6"

VIRTUAL-RUNTIME_init_manager = "busybox"
VIRTUAL-RUNTIME_dev_manager = "busybox-mdev"
```
