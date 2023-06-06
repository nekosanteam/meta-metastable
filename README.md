# meta-metastable
 
```
MACHINE = "qemuarm64"
DL_DIR = "${TOPDIR}/../downloads"
PACKAGE_CLASSES = "package_deb"

PREFERRED_PROVIDER_virtual/kernel = "linux-stable"
VIRTUAL-RUNTIME_init_manager = "busybox"
VIRTUAL-RUNTIME_dev_manager = "busybox-mdev"
BBMASK += " poky/meta/recipes-kernel/linux-libc-headers/linux-libc-headers"

BBMULTICONFIG = "main rescue"

# conf/multiconfig/rescue.conf
INITRAMFS_IMAGE = "tiny-image-initramfs"
INITRAMFS_IMAGE_BUNDLE = "1"
```
