SUMMARY = "Linux kernel libc headers"
DESCRIPTION = "Linux kernel libc headers"
LICENSE = "GPL-2.0-only"

LINUXLIBCVERSION = "6.6"
require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

PROVIDES += "linux-libc-headers"
RPROVIDES:${PN}-dev = "linux-libc-headers-dev"
RPROVIDES:${PN}-dbg = "linux-libc-headers-dbg"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
PV = "6.6"
SRC_URI[sha256sum] = "d926a06c63dd8ac7df3f86ee1ffc2ce2a3b81a2d168484e76b5b389aba8e56d0"
