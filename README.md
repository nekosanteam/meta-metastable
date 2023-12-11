# meta-metastable
 
```
MACHINE = "qemuarm64"
DL_DIR = "${TOPDIR}/../downloads"
PACKAGE_CLASSES = "package_deb"
INHERIT += "rm_work"

LINUXLIBCVERSION = "6.6"
or
PREFERRED_PROVIDER_linux-libc-headers = "linux-libc-headers-stable"
PREFERRED_PROVIDER_nativesdk-linux-libc-headers = "nativesdk-linux-libc-headers-stable"
PREFERRED_VERSION_linux-libc-headers-stable = "6.6"
PREFERRED_VERSION_nativesdk-linux-libc-headers-stable = "6.6"

VIRTUAL-RUNTIME_init_manager = "busybox"
VIRTUAL-RUNTIME_dev_manager = "busybox-mdev"
```
