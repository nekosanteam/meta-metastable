require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

#PROVIDES += "linux-libc-headers"
#RPROVIDES:${PN}-dev += "linux-libc-headers-dev"
#RPROVIDES:${PN}-dbg += "linux-libc-headers-dbg"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
SRC_URI[sha256sum] = "8d76c95277dc5ab0a6cd0069432af2ceb759d0ac2b6f5401330d390196095676"
