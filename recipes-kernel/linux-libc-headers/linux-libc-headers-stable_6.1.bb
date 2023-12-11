SUMMARY = "Linux kernel libc headers"
DESCRIPTION = "Linux kernel libc headers"
LICENSE = "GPL-2.0-only"

LINUXLIBCVERSION = "6.1"
require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

PROVIDES += "linux-libc-headers"
RPROVIDES:${PN}-dev += "linux-libc-headers-dev"
RPROVIDES:${PN}-dbg += "linux-libc-headers-dbg"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
SRC_URI[sha256sum] = "2ca1f17051a430f6fed1196e4952717507171acfd97d96577212502703b25deb"
