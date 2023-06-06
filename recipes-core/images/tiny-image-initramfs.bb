DESCRIPTION = "tiny image for initramfs."
LICENSE = "MIT"
PACKAGE_INSTALL = "glibc libstdc++ ell busybox busybox-inittab base-files"
IMAGE_FEATURES = ""
IMAGE_FSTYPES = "${INITRAMFS_FSTYPES} ext4"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"
