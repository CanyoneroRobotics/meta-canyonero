DESCRIPTION = "C++ library for serial port support."
SECTION = "libs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
HOMEPAGE = "http://libserial.readthedocs.io/en/latest/index.html"

SRC_URI = "git://github.com/crayzeewulf/libserial.git"
SRCREV = "4b976aaaf743c1b2fbd92f33406cc7551dc34300"

S = "${WORKDIR}/git"

EXTRA_OECONF = "--without-python"

inherit autotools pkgconfig
