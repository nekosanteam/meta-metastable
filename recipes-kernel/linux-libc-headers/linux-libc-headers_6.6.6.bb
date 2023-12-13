require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

#PROVIDES += "linux-libc-headers"
#RPROVIDES:${PN}-dev += "linux-libc-headers-dev"
#RPROVIDES:${PN}-dbg += "linux-libc-headers-dbg"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
SRC_URI[sha256sum] = "ebf70a917934b13169e1be5b95c3b6c2fea5bc14e6dc144f1efb8a0016b224c8"
