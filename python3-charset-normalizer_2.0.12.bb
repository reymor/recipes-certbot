LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0974a390827087287db39928f7c524b5"

SRC_URI = "git://github.com/Ousret/charset_normalizer.git;protocol=https;branch=master"

PV = "2.0.12+git${SRCPV}"
SRCREV = "a5f4348490ebc04f90d94496a40ed802debe3113"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS:${PN} += "python3-codecs python3-core python3-crypt python3-json python3-logging python3-pytest python3-unittest"
