SUMMARY = "Linux kernel (stable-tree)"
DESCRIPTION = "Linux kernel (stable-tree)"
LICENSE = "MIT"

inherit kernel

#do_fetch[depends] += "linux-libc-headers:do_fetch"
DEPENDS += "bc-native"
DEPENDS += "${@bb.utils.contains('ARCH', 'x86', 'elfutils-native', '', d)}"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
KERNEL_CONFIG_COMMAND = "oe_runmake_call O=${B} -C ${S} olddefconfig"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
SRCREV = "4a61839152cc3e9e00ac059d73a28d148d622b30"
LINUX_VERSION = "6.1.61"
SRC_URI = "git://git.yoctoproject.org/linux-yocto.git;branch=v6.1/base;protocol=https"
#SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;branch=linux-6.1.y;protocol=https"
PV = "6.1"
