DESCRIPTION = "tiny image for rootfs."
LICENSE = "MIT"
PACKAGE_INSTALL = "glibc libstdc++ ell busybox busybox-inittab base-files"
IMAGE_FEATURES = ""
IMAGE_FSTYPES = "ext4 tar.xz"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"
