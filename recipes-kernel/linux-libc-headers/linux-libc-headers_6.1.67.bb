require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

#PROVIDES += "linux-libc-headers"
#RPROVIDES:${PN}-dev += "linux-libc-headers-dev"
#RPROVIDES:${PN}-dbg += "linux-libc-headers-dbg"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
SRC_URI[sha256sum] = "7537db7289ca4854a126bc1237c47c5b21784bcbf27b4e571d389e3528c59285"
