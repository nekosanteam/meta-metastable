SUMMARY = "Linux kernel libc headers (stable-tree)"
DESCRIPTION = "Linux kernel libc headers (stable-tree)"
LICENSE = "MIT"

require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

PROVIDES += "linux-libc-headers"
RPROVIDES:${PN}-dev += "linux-libc-headers-dev"
RPROVIDES:${PN}-dbg += "linux-libc-headers-dbg"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
SRCREV = "fa74641fb6b93a19ccb50579886ecc98320230f9"
LINUX_VERSION = "6.1.29"
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;branch=linux-6.1.y;protocol=https;"
PV = "6.1"
