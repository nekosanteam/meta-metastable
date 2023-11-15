SUMMARY = "Linux kernel libc headers"
DESCRIPTION = "Linux kernel libc headers"
LICENSE = "GPL-2.0-only"

require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

#PROVIDES += "linux-libc-headers"
#RPROVIDES:${PN}-dev += "linux-libc-headers-dev"
#RPROVIDES:${PN}-dbg += "linux-libc-headers-dbg"

#S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
#SRCREV = "fa74641fb6b93a19ccb50579886ecc98320230f9"
#LINUX_VERSION = "6.1.29"
#SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;branch=linux-6.1.y;protocol=https;"
PV = "6.1"
SRC_URI[sha256sum] = "2ca1f17051a430f6fed1196e4952717507171acfd97d96577212502703b25deb"
