SUMMARY = "Linux kernel libc headers"
DESCRIPTION = "Linux kernel libc headers"
LICENSE = "GPL-2.0-only"

LINUXLIBCVERSION = "5.15"
require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

PROVIDES += "linux-libc-headers"
RPROVIDES:${PN}-dev += "linux-libc-headers-dev"
RPROVIDES:${PN}-dbg += "linux-libc-headers-dbg"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
SRC_URI[sha256sum] = "57b2cf6991910e3b67a1b3490022e8a0674b6965c74c12da1e99d138d1991ee8"
